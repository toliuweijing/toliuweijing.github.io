package com.weijing.portfolio.web.styles

import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.css.TransitionProperty
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.style.CssStyle
import com.varabyte.kobweb.silk.style.selectors.hover
import org.jetbrains.compose.web.css.ms
import org.jetbrains.compose.web.css.px

val ExpandableButtonStyle = CssStyle {
    base {
        Modifier
            .padding(leftRight = 12.px)
            .transition(CSSTransition(property = TransitionProperty.All.toString(), duration = 300.ms))
    }

    hover {
        Modifier.padding(leftRight = 20.px)
    }
}