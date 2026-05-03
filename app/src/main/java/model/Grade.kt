package model

import androidx.annotation.DrawableRes

data class Grade(
    @DrawableRes val image: Int,
    val pointsPerClick: Int,
    val threshold: Int
)