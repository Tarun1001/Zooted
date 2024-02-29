package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("dimensions")
    val dimensions: Dimensions,
    @SerializedName("url")
    val url: String
)