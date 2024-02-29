package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class BeacondataX(
    @SerializedName("commontrackid")
    val commontrackid: String,
    @SerializedName("lyricsid")
    val lyricsid: String,
    @SerializedName("providername")
    val providername: String
)