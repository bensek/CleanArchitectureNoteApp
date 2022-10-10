package com.amalitech.cleanarchitecturenotesapp.feature_note.domain.use_case

import com.amalitech.cleanarchitecturenotesapp.feature_note.domain.model.Note

data class NoteUseCases(
    val getNoteUseCase: GetNotesUseCase,
    val deleteNoteUseCase: DeleteNoteUseCase,
    val addNoteUseCase: AddNoteUseCase
)
