package kz.yerbol.myapplication11_6

import java.io.Serializable

data class News(
    val title: String,
    val author: String,
    val date: String,
): Serializable