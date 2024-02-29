package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Images(
    @SerializedName("default")
    val default: String,
    @SerializedName("overflow")
    val overflow: String
)