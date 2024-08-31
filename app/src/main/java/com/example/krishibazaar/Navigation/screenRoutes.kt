package com.example.krishibazaar.Navigation

import kotlinx.serialization.Serializable


@Serializable
object HomeScreenRoute

@Serializable
object SearchScreenRoute

@Serializable
object DetailScreen

@Serializable
object RentScreenRoute

@Serializable
object MandiRateScreenRoute

data class screenRoutes(
    val HomeScreenRoute: String,
    val MandiRateScreenRoute: String,
    val SearchScreenRoute: String,
    val CartScreenRoute: String,
    val ProfileScreenRoute: String,
    val AboutScreenRoute: String,
    val RentScreenRoute: String
)