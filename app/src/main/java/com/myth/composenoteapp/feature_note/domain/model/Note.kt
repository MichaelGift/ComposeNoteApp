package com.myth.composenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.myth.composenoteapp.ui.theme.boldPurple
import com.myth.composenoteapp.ui.theme.energeticRed
import com.myth.composenoteapp.ui.theme.livelyTeal
import com.myth.composenoteapp.ui.theme.playfulGreen
import com.myth.composenoteapp.ui.theme.radiantOrchid
import com.myth.composenoteapp.ui.theme.sunnyYellow
import com.myth.composenoteapp.ui.theme.vibrantOceanBlue


@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(
            vibrantOceanBlue,
            livelyTeal,
            radiantOrchid,
            energeticRed,
            playfulGreen,
            boldPurple
        )
    }
}

class InvalidNoteException(message: String) : Exception(message)
