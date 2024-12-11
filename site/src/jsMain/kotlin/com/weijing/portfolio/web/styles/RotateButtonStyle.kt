package com.weijing.portfolio.web.styles

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.rotate
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import com.weijing.portfolio.web.utils.Res
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms

val RotateButtonStyle = CssStyle {
    base {
        Modifier
            .rotate(0.deg)
            .background(Colors.Transparent)
            .transition(
                CSSTransition(property = "rotate", duration = 300.ms),
                CSSTransition(property = "background", duration = 300.ms),
            )
    }

    hover {
        Modifier
            .rotate(10.deg)
            .background(Res.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color)
    }
}