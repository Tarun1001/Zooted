package com.teach.zooted.feature_Detect.domain.use_case

import com.teach.zooted.feature_Detect.domain.model.SongEntitiy
import com.teach.zooted.feature_Detect.domain.repo.ShazamRepo
import okhttp3.RequestBody
import javax.inject.Inject

class DetectSongUseCase @Inject constructor(
    private val repo: ShazamRepo
) {
    suspend fun detectSong(requestBody: RequestBody): Any {
        //if(requestBody.)
        return repo.detectSong(requestBody)
    }
}
sealed class DetectSongUseCaseResult {
    data class Success(val song: SongEntitiy) : DetectSongUseCaseResult()
    data class Error(val message: String) : DetectSongUseCaseResult()
}