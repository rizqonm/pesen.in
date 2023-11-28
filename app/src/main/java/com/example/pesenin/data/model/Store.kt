package com.example.pesenin.data.model

data class Store(
    val name:String? = null,
    var photo:String? = null,
    val qris:String? = null,
    val description:String? = null,
    var menu: List<Menu> = emptyList(),
)
