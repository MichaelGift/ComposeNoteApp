package com.myth.composenoteapp.feature_note.domain.use_case

import com.myth.composenoteapp.feature_note.domain.model.Note
import com.myth.composenoteapp.feature_note.domain.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? = repository.getNoteById(id)
}