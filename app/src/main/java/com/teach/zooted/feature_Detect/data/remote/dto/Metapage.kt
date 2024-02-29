package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Metapage(
    @SerializedName("caption")
    val caption: String,
    @SerializedName("image")
    val image: String
)