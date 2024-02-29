package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Youtubeurl(
    @SerializedName("actions")
    val actions: List<ActionXXXXX>,
    @SerializedName("caption")
    val caption: String,
    @SerializedName("image")
    val image: Image
)