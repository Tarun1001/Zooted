package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class ShareX(
    @SerializedName("avatar")
    val avatar: String,
    @SerializedName("href")
    val href: String,
    @SerializedName("html")
    val html: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("snapchat")
    val snapchat: String,
    @SerializedName("subject")
    val subject: String,
    @SerializedName("text")
    val text: String,
    @SerializedName("twitter")
    val twitter: String
)