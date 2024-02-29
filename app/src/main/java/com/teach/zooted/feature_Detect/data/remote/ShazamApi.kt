package com.teach.zooted.feature_Detect.data.remote

import com.teach.zooted.core.utils.AppConstants.APIKEY
import com.teach.zooted.core.utils.AppConstants.BASEURL
import com.teach.zooted.feature_Detect.data.remote.dto.RemoteSongData
import okhttp3.RequestBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface ShazamApi {

    @Headers(
        "X-RapidAPI-Key: $APIKEY",
        "X-RapidAPI-Host: $BASEURL",
        "Content-Type: text/plain"
    )
    @GET("songs/detect")
    suspend fun detectSong(@Body requestBody: RequestBody): RemoteSongData

}