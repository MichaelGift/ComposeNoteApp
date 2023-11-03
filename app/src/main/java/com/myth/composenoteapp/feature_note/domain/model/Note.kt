package com.myth.composenoteapp.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.myth.composenoteapp.ui.theme.Pink40
import com.myth.composenoteapp.ui.theme.Pink80
import com.myth.composenoteapp.ui.theme.Purple40
import com.myth.composenoteapp.ui.theme.Purple80
import com.myth.composenoteapp.ui.theme.PurpleGrey40
import com.myth.composenoteapp.ui.theme.PurpleGrey80


@Entity
data class Note(
    @PrimaryKey val id: Int? = null,
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int
) {
    companion object {
        val noteColors = listOf(Pink40, Pink80, Purple40, Purple80, PurpleGrey40, PurpleGrey80)
    }
}

class InvalidNoteException(message: String) : Exception(message)
