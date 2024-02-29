package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Matche(
    @SerializedName("channel")
    val channel: String,
    @SerializedName("frequencyskew")
    val frequencyskew: Double,
    @SerializedName("id")
    val id: String,
    @SerializedName("offset")
    val offset: Double,
    @SerializedName("timeskew")
    val timeskew: Double
)