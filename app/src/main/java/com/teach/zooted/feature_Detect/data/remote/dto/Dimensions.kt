package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Dimensions(
    @SerializedName("height")
    val height: Int,
    @SerializedName("width")
    val width: Int
)