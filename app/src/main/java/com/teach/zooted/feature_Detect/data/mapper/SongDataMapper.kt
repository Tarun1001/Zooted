package com.teach.zooted.feature_Detect.data.mapper

import com.teach.zooted.feature_Detect.data.remote.dto.RemoteSongData
import com.teach.zooted.feature_Detect.data.remote.dto.Track
import com.teach.zooted.feature_Detect.domain.model.SongEntitiy

fun RemoteSongData.songResponse():SongEntitiy{
    return SongEntitiy(
        tagid =tagid,
        track =track)
}

fun Track.toTrack():com.teach.zooted.feature_Detect.domain.model.Track{
    return com.teach.zooted.feature_Detect.domain.model.Track(subtitle=subtitle,title=title)
}