package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Urlparams(
    @SerializedName("{trackartist}")
    val trackartist: String,
    @SerializedName("{tracktitle}")
    val tracktitle: String
)