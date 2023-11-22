package com.androdu.stockmarket.data.mapper

import com.androdu.stockmarket.data.local.CompanyListingEntity
import com.androdu.stockmarket.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing() = CompanyListing(
    symbol = symbol,
    name = name,
    exchange = exchange
)

fun CompanyListing.toCompanyListingEntity() = CompanyListingEntity(
    symbol = symbol,
    name = name,
    exchange = exchange
)