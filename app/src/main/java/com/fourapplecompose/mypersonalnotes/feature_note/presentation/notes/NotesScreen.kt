package com.fourapplecompose.mypersonalnotes.feature_note.presentation.notes

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons


import androidx.compose.material.icons.filled.Adb
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import java.lang.reflect.Modifier

@Composable
fun NotesScreen(
    navController: NavController,
    viewModel: NotesViewModel = hiltViewModel()

) {
    val state = viewModel.state.value
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {
                // Later
            },
            backgroundColor = MaterialTheme.colors.primary
                ) {
                Icon(imageVector = Icons.Default.Add,
                    contentDescription = "Add Note")
            }

        },
        scaffoldState = scaffoldState
    ) {





    }


}