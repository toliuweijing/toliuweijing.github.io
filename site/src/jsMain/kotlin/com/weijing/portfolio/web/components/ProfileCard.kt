package com.weijing.portfolio.web.components

import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontSize
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxHeight
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fontFamily
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.margin
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.opacity
import com.varabyte.kobweb.compose.ui.modifiers.padding
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.compose.ui.thenIf
import com.varabyte.kobweb.navigation.OpenLinkStrategy
import com.varabyte.kobweb.navigation.open
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.layout.SimpleGrid
import com.varabyte.kobweb.silk.components.layout.Surface
import com.varabyte.kobweb.silk.components.layout.numColumns
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.weijing.portfolio.web.styles.ExpandableButtonStyle
import com.weijing.portfolio.web.styles.RotateButtonStyle
import com.weijing.portfolio.web.utils.Res
import kotlinx.browser.window
import org.jetbrains.compose.web.css.CSSSizeValue
import org.jetbrains.compose.web.css.CSSUnitLengthOrPercentage
import org.jetbrains.compose.web.css.percent
import org.jetbrains.compose.web.css.px

@Composable
fun ProfileCard() {
    println("ProfileCard")
    val breakpoint = rememberBreakpoint()
    println("breakpoint $breakpoint")
    SimpleGrid(
        numColumns = numColumns(base = 1, md = 2),
        modifier = Modifier
            .fillMaxWidth(
                profileCardFillMaxWith(breakpoint)
            )
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier.height(Res.Dimens.MAX_CARD_HEIGHT.px)
            )
            .borderRadius(Res.Dimens.BORDER_RADIUS.px)
            .backgroundColor(Colors.White)
            .padding(all = 12.px)
    ) {
        LeftCard(breakpoint)
        RightCard(breakpoint)
    }
}

private fun profileCardFillMaxWith(breakpoint: Breakpoint): CSSSizeValue<out CSSUnitLengthOrPercentage> {
    val result = if (breakpoint <= Breakpoint.MD) 100.percent
    else Res.Dimens.MAX_CARD_WIDTH.px.also {
        println("fillMaxWidth")
    }
    println("profileCardFillMaxWith $breakpoint $result")
    return result
}

@Composable
fun LeftCard(breakpoint: Breakpoint) {
    Column(
        modifier = Modifier.fillMaxWidth().padding(leftRight = 50.px),
        verticalArrangement = Arrangement.spacedBy(20.px, alignment = Alignment.CenterVertically),
        horizontalAlignment =
            if (breakpoint > Breakpoint.MD) Alignment.Start
            else Alignment.CenterHorizontally,
    ) {
        SpanText(
            text = Res.String.NAME,
            modifier = Modifier
                .fontFamily(Res.String.ROBOTO_CONDENSED)
                .fontSize(50.px)
        )
        SpanText(
            text = Res.String.PROFESSION,
            modifier = Modifier
                .fontFamily(Res.String.ROBOTO_REGULAR)
        )
        Surface(
            modifier = Modifier
                .background(Res.Theme.YELLOW.color)
                .width(40.px)
                .height(4.px)
        ) {}
        SpanText(
            text = Res.String.ABOUT_ME,
            modifier = Modifier
                .fontFamily(Res.String.ROBOTO_REGULAR)
                .opacity(50.percent)
        )
        Button(
            modifier =
                ExpandableButtonStyle.toModifier()
                    .background(Res.Theme.YELLOW.color)
                    .margin(top = 30.px),
            onClick = {
                window.open(href = Res.String.MY_EMAIL, strategy = OpenLinkStrategy.IN_NEW_TAB)
                println(Res.String.MY_EMAIL)
            },
        ) {
            Image(
                src = Res.Icon.EMAIL,
                modifier = Modifier.margin(right = 8.px)
            )
            SpanText(
                text = Res.String.BUTTON_TEXT,
                modifier = Modifier
                    .color(Colors.White)
                    .fontSize(FontSize.Medium)
            )
        }
        Row(
            modifier = Modifier.margin(bottom = 30.px),
            horizontalArrangement = Arrangement.spacedBy(10.px, Alignment.Start)
        ) {
            IconButton(
                modifier = RotateButtonStyle.toModifier(),
                icon = Res.Icon.GITHUB,
                url = Res.Url.GITHUB,
            )
            IconButton(
                modifier = RotateButtonStyle.toModifier(),
                icon = Res.Icon.LINKED_IN,
                url = Res.Url.LINKED_IN,
            )
        }
    }
}

@Composable
fun RightCard(breakpoint: Breakpoint) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .thenIf(
                condition = breakpoint > Breakpoint.MD,
                other = Modifier.height((Res.Dimens.MAX_CARD_HEIGHT - 24).px)
            ),
        contentAlignment = Alignment.Center,
    ) {
        Image(
            src = Res.Image.PROFILE_PHOTO,
            modifier = Modifier
                .objectFit(ObjectFit.Contain)
                .fillMaxWidth()
                .fillMaxHeight()
        )
    }
}
