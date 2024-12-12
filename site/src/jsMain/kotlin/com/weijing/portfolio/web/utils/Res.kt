package com.weijing.portfolio.web.utils

import com.varabyte.kobweb.compose.ui.graphics.Color

object Res {
    enum class Theme(val color: Color) {
        BLUE(color = Color.rgb(r = 255, g = 175, b = 26)),
        SOCIAL_ICON_BACKGROUND_LIGHT(color = Color.rgb(r = 255, g = 230, b = 184)),
        GRADIENT_ONE(color = Color.rgb(r = 255, g = 222, b = 165)),
        GRADIENT_TWO(color = Color.rgb(r = 255, g = 243, b = 219)),
    }

    object Icon {
        const val EMAIL_LIGHT = "mail.svg"
        const val EMAIL_DARK = "mail_light.svg"
        const val LINKED_IN = "linkedin-24.svg"
        const val GITHUB = "github.svg"
        const val GITHUB_LIGHT = "github_light.svg"
        const val INSTAGRAM = "instagram.svg"
        const val INSTAGRAM_LIGHT = "instagram_light.svg"
        const val GITLAB = "gitlab.svg"
        const val GITLAB_LIGHT = "gitlab_light.svg"
        const val SUN = "sun.svg"
        const val MOON = "moon.svg"
    }

    object Image {
//        const val PROFILE_PHOTO = "photo.jpg"
        const val PROFILE_PHOTO = "photo.png"
    }

    object String {
        const val NAME = "Jim(Weijing) Liu"
        const val PROFESSION = "Kotlin Multiplaform Developer"
        const val ABOUT_ME =
            "Specialized in Android native app development and Kotlin Multiplatform. Proven track record at Facebook and Snapchat, creating innovative mobile solutions."
//            "Experienced in crafting cutting-edge mobile camera experiences using Android Native and Kotlin Multiplatform. Proven track record at industry leaders like Facebook and Snapchat."
//            "Specializing in Android native apps and Kotlin Multiplatform development. Experienced at Facebook and Snapchat, building innovative mobile camera products."
        const val BUTTON_TEXT = "Get in touch"
        const val ROBOTO_CONDENSED = "RobotoCondensedBold"
        const val ROBOTO_REGULAR = "RobotoRegular"
        const val MY_EMAIL = "mailto:waiging.lau@gmail.com"
        const val SAVED_THEME = "theme"
    }

    object Dimens {
        const val BORDER_RADIUS = 8
        const val MAX_CARD_WIDTH = 1000
//        const val MAX_CARD_HEIGHT = 600
        const val MAX_CARD_HEIGHT = 512
        const val ICON_SIZE = 24
        const val ICON_SIZE_LG = 32
    }

    object Url {
        const val LINKED_IN = "https://www.linkedin.com/in/weijingliu/"
        const val GITHUB = "https://github.com/toliuweijing"
    }
}
