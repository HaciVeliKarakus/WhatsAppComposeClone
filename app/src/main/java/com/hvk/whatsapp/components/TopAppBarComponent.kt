package com.hvk.whatsapp.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.sp
import com.hvk.whatsapp.R
import com.hvk.whatsapp.ui.theme.WhatsAppComposeCloneTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarComponent() {
    TopAppBar(
        title = {
            Text(
                text = "WhatsApp Clone",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colorScheme.primary
                )
            )
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(painterResource(R.drawable.ic_camera), contentDescription = "camera icon")
            }
            IconButton(onClick = {}) {
                Icon(painterResource(R.drawable.ic_search), contentDescription = "search icon")
            }
            IconButton(onClick = {}) {
                Icon(painterResource(R.drawable.ic_more_vert), contentDescription = "more icon")
            }
        }
    )
}


@PreviewLightDark
@Composable
private fun Preview() {
    WhatsAppComposeCloneTheme {
        TopAppBarComponent()
    }
}