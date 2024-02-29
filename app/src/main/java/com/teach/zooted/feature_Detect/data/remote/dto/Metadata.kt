package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Metadata(
    @SerializedName("text")
    val text: String,
    @SerializedName("title")
    val title: String
)