package com.myth.composenoteapp.feature_note.presentation.note

import com.myth.composenoteapp.feature_note.domain.model.Note
import com.myth.composenoteapp.feature_note.domain.util.NoteOrder
import com.myth.composenoteapp.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
