package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class ImagesX(
    @SerializedName("background")
    val background: String,
    @SerializedName("coverart")
    val coverart: String,
    @SerializedName("coverarthq")
    val coverarthq: String,
    @SerializedName("joecolor")
    val joecolor: String
)