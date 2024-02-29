package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Track(
    @SerializedName("albumadamid")
    val albumadamid: String,
    @SerializedName("artists")
    val artists: List<Artist>,
    @SerializedName("genres")
    val genres: Genres,
    @SerializedName("hub")
    val hub: Hub,
    @SerializedName("images")
    val images: ImagesX,
    @SerializedName("isrc")
    val isrc: String,
    @SerializedName("key")
    val key: String,
    @SerializedName("layout")
    val layout: String,
    @SerializedName("myshazam")
    val myshazam: Myshazam,
    @SerializedName("sections")
    val sections: List<Section>,
    @SerializedName("share")
    val share: ShareX,
    @SerializedName("subtitle")
    val subtitle: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String,
    @SerializedName("urlparams")
    val urlparams: Urlparams
)