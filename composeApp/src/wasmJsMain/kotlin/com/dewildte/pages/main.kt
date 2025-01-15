package com.dewildte.pages

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport
import com.dewildte.pages.app.PagesApp
import kotlinx.browser.document

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
    document.title = "Pages App"
    ComposeViewport(
        viewportContainer = document.body!!
    ) {
        PagesApp()
    }
}