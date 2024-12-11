package com.hvk.whatsapp.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.hvk.whatsapp.data.tabs
import com.hvk.whatsapp.ui.theme.WhatsAppComposeCloneTheme

@Composable
fun TabsComponent() {

    var selectedIndex by remember { mutableIntStateOf(0) }

    TabRow(
        selectedTabIndex = selectedIndex,
        modifier = Modifier.fillMaxWidth()
    ) {
        tabs.forEachIndexed { index, tabData ->
            Tab(
                selected = index == selectedIndex,
                onClick = { selectedIndex = index },
                modifier = Modifier.height(56.dp)
            ) {
                Text(tabData.title)
            }
        }
    }
}

@PreviewLightDark
@Composable
private fun Preview() {
    WhatsAppComposeCloneTheme {
        TabsComponent()
    }
}