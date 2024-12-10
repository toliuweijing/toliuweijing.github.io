package com.weijing.portfolio.web.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import com.weijing.portfolio.web.styles.RotateButtonStyle
import com.weijing.portfolio.web.utils.Res
import org.jetbrains.compose.web.css.px

@Composable
fun IconButton(
    icon: String,
    url: String,
) {
    Link(
        path = Res.Url.LINKED_IN,
        modifier = RotateButtonStyle.toModifier()
            .borderRadius(Res.Dimens.BORDER_RADIUS.px),
    ) {
        Button(
            onClick = {

            },
        ) {
            Image(src = Res.Icon.GITHUB)
        }
    }
}