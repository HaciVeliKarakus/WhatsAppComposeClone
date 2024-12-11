package com.hvk.whatsapp.screen.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.hvk.whatsapp.components.TabsComponent
import com.hvk.whatsapp.components.TopAppBarComponent
import com.hvk.whatsapp.data.tabs
import com.hvk.whatsapp.ui.theme.WhatsAppComposeCloneTheme
import kotlinx.coroutines.launch

@Composable
fun HomeScreen() {
    val pagerState = rememberPagerState { tabs.size }
    val scope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            Column {
                TopAppBarComponent()
                TabsComponent(pagerState) { selectedTab ->
                    scope.launch {
                        pagerState.animateScrollToPage(selectedTab)
                    }
                }
            }
        }
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues)) {
            HorizontalPager(
                state = pagerState
            ) { page: Int ->
                when (page) {
                    0 -> ChatPage()
                    1 -> StatusPage()
                    2 -> CallsPage()
                }
            }
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