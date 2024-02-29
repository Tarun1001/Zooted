package com.teach.zooted.feature_Detect.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Section(
    @SerializedName("actions")
    val actions: List<ActionXXXX>?,
    @SerializedName("avatar")
    val avatar: String?,
    @SerializedName("beacondata")
    val beacondata: BeacondataX?,
    @SerializedName("footer")
    val footer: String?,
    @SerializedName("id")
    val id: String?,
    @SerializedName("metadata")
    val metadata: List<Metadata>?,
    @SerializedName("metapages")
    val metapages: List<Metapage>?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("tabname")
    val tabname: String,
    @SerializedName("text")
    val text: List<String>?,
    @SerializedName("type")
    val type: String,
    @SerializedName("verified")
    val verified: Boolean?,
    @SerializedName("youtubeurl")
    val youtubeurl: Youtubeurl?
)