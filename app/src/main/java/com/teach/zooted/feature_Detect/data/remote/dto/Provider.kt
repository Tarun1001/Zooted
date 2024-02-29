package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Provider(
    @SerializedName("actions")
    val actions: List<ActionXX>,
    @SerializedName("caption")
    val caption: String,
    @SerializedName("images")
    val images: Images,
    @SerializedName("type")
    val type: String
)