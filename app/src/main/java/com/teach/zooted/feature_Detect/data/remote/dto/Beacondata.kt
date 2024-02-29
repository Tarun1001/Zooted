package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Beacondata(
    @SerializedName("providername")
    val providername: String,
    @SerializedName("type")
    val type: String
)