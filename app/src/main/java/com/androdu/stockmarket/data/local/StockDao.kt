package com.androdu.stockmarket.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.Companion.REPLACE
import androidx.room.Query

@Dao
interface StockDao {
    @Insert(onConflict = REPLACE)
    suspend fun insertCompanyListings(
        companyListingEntities: List<CompanyListingEntity>
    )

    @Query("DELETE FROM COMPANY_LISTINGS_TABLE")
    suspend fun clearCompanyListings()

    @Query(
        """
            SELECT *
            FROM COMPANY_LISTINGS_TABLE
            WHERE LOWER(name) LIKE '%' || LOWER(:query) || '%' OR
                UPPER(:query) == symbol
        """
    )
    suspend fun searchCompanyListings(query:String): List<CompanyListingEntity>
}