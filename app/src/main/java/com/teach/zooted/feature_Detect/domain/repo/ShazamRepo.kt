package com.teach.zooted.feature_Detect.domain.repo

import com.teach.zooted.feature_Detect.domain.model.SongEntitiy
import okhttp3.RequestBody

interface ShazamRepo {
    suspend fun detectSong(requestBody: RequestBody)
}