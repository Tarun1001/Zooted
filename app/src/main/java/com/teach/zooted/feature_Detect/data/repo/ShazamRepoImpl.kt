package com.teach.zooted.feature_Detect.data.repo

import android.util.Log
import com.teach.zooted.feature_Detect.data.mapper.songResponse
import com.teach.zooted.feature_Detect.data.remote.ShazamApi
import com.teach.zooted.feature_Detect.domain.model.SongEntitiy
import com.teach.zooted.feature_Detect.domain.repo.ShazamRepo
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import okhttp3.RequestBody
import retrofit2.HttpException
import java.net.ConnectException
import java.net.UnknownHostException

class ShazamRepoImpl(
    private val api: ShazamApi,
    private val dispatcher: CoroutineDispatcher
):ShazamRepo {
    override suspend fun detectSong(requestBody: RequestBody) {
        return withContext(dispatcher){
            try {
                api.detectSong(requestBody).songResponse()
            }catch (e: Exception){
                when(e){
                    is UnknownHostException, is ConnectException, is HttpException -> {
                        Log.e("HTTP","Error: No data from Remote")
                    }else -> throw e
                }
            }
        }
    }
}