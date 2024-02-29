package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class ActionXXXXX(
    @SerializedName("name")
    val name: String,
    @SerializedName("share")
    val share: ShareX,
    @SerializedName("type")
    val type: String,
    @SerializedName("uri")
    val uri: String
)