package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Artist(
    @SerializedName("adamid")
    val adamid: String,
    @SerializedName("id")
    val id: String
)