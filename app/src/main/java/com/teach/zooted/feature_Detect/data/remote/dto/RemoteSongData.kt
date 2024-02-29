package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class RemoteSongData(
    @SerializedName("matches")
    val matches: List<Matche>,
    @SerializedName("tagid")
    val tagid: String,
    @SerializedName("timestamp")
    val timestamp: Long,
    @SerializedName("timezone")
    val timezone: String,
    @SerializedName("track")
    val track: Track
)