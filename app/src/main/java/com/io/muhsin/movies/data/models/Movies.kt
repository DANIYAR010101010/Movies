package com.io.muhsin.movies.data.models

data class Movies(
    var _links: Links? = null,
    var averageRuntime: Int? = null,
    var dvdCountry: Any? = null,
    var ended: String? = null,
    var externals: Externals? = null,
    var genres: List<String?>? = null,
    var id: Int? = null,
    var image: Image? = null,
    var language: String? = null,
    var name: String? = null,
    var network: Network? = null,
    var officialSite: String? = null,
    var premiered: String? = null,
    var rating: Rating? = null,
    var runtime: Int? = null,
    var schedule: Schedule? = null,
    var status: String? = null,
    var summary: String? = null,
    var type: String? = null,
    var updated: Int? = null,
    var url: String? = null,
    var webChannel: Any? = null,
    var weight: Int? = null
)