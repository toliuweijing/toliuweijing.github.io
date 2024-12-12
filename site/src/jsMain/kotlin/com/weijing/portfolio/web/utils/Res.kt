package com.weijing.portfolio.web.utils

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        YELLOW(color = Color.rgb(r = 255, g = 175, b = 26)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 255, g = 230, b = 184)),
        HOME_PAGE_GRADIENT_ONE(color = Color.rgb(r = 255, g = 222, b = 165)),
        HOME_PAGE_GRADIENT_TWO(color = Color.rgb(r = 255, g = 243, b = 219)),
    }

    object Icon {
        const val EMAIL = "mail.svg"
        const val LINKED_IN = "linkedin-24.svg"
        const val GITHUB = "github.svg"
    }

    object Image {
        const val PROFILE_PHOTO = "photo.png"
    }

    object String {
        const val NAME = "Jim(Weijing) Liu"
        const val PROFESSION = "Kotlin Multiplaform Developer"
        const val ABOUT_ME =
            "Specialized in Android native app development and Kotlin Multiplatform. Proven track record at Facebook and Snapchat, creating innovative mobile solutions."
        const val BUTTON_TEXT = "Get in touch"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:weijing.liu@nyu.com"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000
        const val MAX_CARD_HEIGHT = 512
        const val ICON_SIZE = 24
    }

    object Url {
        const val LINKED_IN = "https://www.linkedin.com/in/weijingliu/"
        const val GITHUB = "https://github.com/toliuweijing"
    }
}
