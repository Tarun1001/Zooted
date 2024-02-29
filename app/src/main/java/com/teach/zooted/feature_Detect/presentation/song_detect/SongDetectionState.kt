package com.teach.zooted.feature_Detect.presentation.song_detect

import com.teach.zooted.feature_Detect.domain.model.SongEntitiy

data class SongDetectionState(
    val songEntitiy: SongEntitiy? = null,
    val isLoading:Boolean=true,
    val error:String?=null
)
