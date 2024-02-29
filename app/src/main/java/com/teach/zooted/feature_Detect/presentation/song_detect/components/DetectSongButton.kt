package com.teach.zooted.feature_Detect.presentation.song_detect.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircleOutline
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DetectSongButton() {
    
}
@Composable
fun CompleteButton(
    onCompleteClick: () -> Unit,
    modifier: Modifier = Modifier,
    color:Color
){
    Button(onClick = {
        onCompleteClick()
    },
        shape = CircleShape,

        modifier = modifier
    ) {

        /*if(completed){
            Icon(
                imageVector = Icons.Default.CheckCircleOutline,
                contentDescription = ContentDescriptions.COMPLETE_TODO_ITEM,
                tint = color,
                modifier = Modifier.size(48.dp)
            )
        }else {
            EmptyCircle(color = color)
        }*/

    }
}