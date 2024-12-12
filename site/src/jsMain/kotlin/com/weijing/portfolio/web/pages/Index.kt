package com.weijing.portfolio.web.pages

import androidx.compose.runtime.*
import com.varabyte.kobweb.compose.css.functions.LinearGradient
import com.varabyte.kobweb.compose.css.functions.linearGradient
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.backgroundImage
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxSize
import com.varabyte.kobweb.core.Page
import com.weijing.portfolio.web.components.ProfileCard
import com.weijing.portfolio.web.utils.Res

@Page
@Composable
fun HomePage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .backgroundImage(
                linearGradient(
                    dir = LinearGradient.Direction.ToRight,
                    from = Res.Theme.HOME_PAGE_GRADIENT_ONE.color,
                    to = Res.Theme.HOME_PAGE_GRADIENT_TWO.color,
                )
            )
        ,
        contentAlignment = Alignment.Center,
    ) {
        ProfileCard()
    }
}
