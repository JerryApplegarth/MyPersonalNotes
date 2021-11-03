package com.fourapplecompose.mypersonalnotes.feature_note.presentation.add_edit_note

import androidx.appcompat.widget.WithHint

data class NoteTextFieldState(
    val text: String = "",
    val hint: String = "",
    val isHintVisible: Boolean = true
)
