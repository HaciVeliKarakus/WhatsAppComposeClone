package com.hvk.whatsapp.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.hvk.whatsapp.components.TopAppBarComponent
import com.hvk.whatsapp.components.TabsComponent
import com.hvk.whatsapp.ui.theme.WhatsAppComposeCloneTheme

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = {
            Column {
                TopAppBarComponent()
                TabsComponent()
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {

        }
    }
}

@PreviewLightDark
@Composable
private fun Preview() {
    WhatsAppComposeCloneTheme {
        HomeScreen()
    }
}