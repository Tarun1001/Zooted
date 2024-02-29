package com.teach.zooted.feature_Detect.presentation.song_detect

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.teach.zooted.feature_Detect.data.di.IoDispatcher
import com.teach.zooted.feature_Detect.domain.use_case.DetectSongUseCase
import com.teach.zooted.feature_Detect.domain.use_case.DetectSongUseCaseResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import okhttp3.RequestBody
import javax.inject.Inject

@HiltViewModel
class SongDetectionViewModel @Inject constructor(
    private val useCase: DetectSongUseCase,
    @IoDispatcher private val dispatcher:CoroutineDispatcher
) :ViewModel() {
    private val _state= mutableStateOf(SongDetectionState())
    val state: State<SongDetectionState> =_state

    private var detectSongJob:Job? = null
    private val errorHandler = CoroutineExceptionHandler {_, e ->
        e.printStackTrace()
        _state.value = _state.value.copy(
            error = e.message,
            isLoading = false
        )
    }
    fun detectSong(requestBody: RequestBody){
        detectSongJob?.cancel()
        detectSongJob = viewModelScope.launch(dispatcher+errorHandler){
            val result= useCase.detectSong(requestBody)

            when(result){
                is DetectSongUseCaseResult.Success ->{
                    _state.value=_state.value.copy(songEntitiy = result.song,isLoading = false,error = null)
                }
                is DetectSongUseCaseResult.Error ->{
                    _state.value=_state.value.copy(error = "Something went Wrong hahaha lol ", isLoading = false)
                }
            }
        }
    }

}