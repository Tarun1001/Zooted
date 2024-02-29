package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class ActionX(
    @SerializedName("name")
    val name: String?,
    @SerializedName("type")
    val type: String,
    @SerializedName("uri")
    val uri: String
)