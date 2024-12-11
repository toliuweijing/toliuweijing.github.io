package com.weijing.portfolio.web.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.BackgroundBlendMode
import com.varabyte.kobweb.compose.css.Cursor
import com.varabyte.kobweb.compose.css.Filter
import com.varabyte.kobweb.compose.css.functions.CSSFilter
import com.varabyte.kobweb.compose.css.functions.brightness
import com.varabyte.kobweb.compose.css.functions.contrast
import com.varabyte.kobweb.compose.css.functions.grayscale
import com.varabyte.kobweb.compose.css.functions.hueRotate
import com.varabyte.kobweb.compose.css.functions.invert
import com.varabyte.kobweb.compose.css.functions.saturate
import com.varabyte.kobweb.compose.css.functions.sepia
import com.varabyte.kobweb.compose.dom.svg.Svg
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundBlendMode
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.cursor
import com.varabyte.kobweb.compose.ui.modifiers.filter
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.navigation.Link
import com.varabyte.kobweb.silk.style.toModifier
import com.weijing.portfolio.web.styles.RotateButtonStyle
import com.weijing.portfolio.web.utils.Res
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnit
import org.jetbrains.compose.web.css.LineStyle
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun IconButton(
    modifier: Modifier = Modifier,
    icon: String,
    url: String,
    iconSize: CSSSizeValue<CSSUnit.px> = Res.Dimens.ICON_SIZE.px,
) {
    Link(
        path = url,
    ) {
        Box(
            modifier = modifier
                .padding(8.px)
                .borderRadius(Res.Dimens.BORDER_RADIUS.px)
                .cursor(Cursor.Pointer)
                .border {
                    width(1.px)
                    style(LineStyle.Solid)
                    color(Res.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color)
                }
        ) {
            Image(
                modifier = Modifier
                    .filter(
                        brightness(0),
                        saturate(100.percent),
                        invert(46.percent),
                        sepia(97.percent),
                        saturate(1741.percent),
                        hueRotate(184.deg),
                        brightness(96.percent),
                        contrast(97.percent),
                    )
                    .size(iconSize),
                src = icon,
            )
        }
    }
}