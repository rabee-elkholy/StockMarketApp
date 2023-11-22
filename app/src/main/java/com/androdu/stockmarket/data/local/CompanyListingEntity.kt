package com.androdu.stockmarket.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = CompanyListingEntity.TABLE_NAME)
data class CompanyListingEntity(
    val symbol: String,
    val name: String,
    val exchange: String,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        const val TABLE_NAME = "company_listings_table"
    }
}