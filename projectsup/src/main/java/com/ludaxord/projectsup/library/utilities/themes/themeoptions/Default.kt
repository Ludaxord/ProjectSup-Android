package com.ludaxord.projectsup.library.utilities.themes.themeoptions

import android.content.Context
import com.ludaxord.projectsup.library.utilities.themes.Theme

class Default : Theme {

    constructor(context: Context) : super(context) {
        this.themeKey = context.resources.getString(com.ludaxord.projectsup.R.string.key_sup_default_style)
    }

    constructor(context: Context, themeKey: String) : super(context) {
        this.themeKey = themeKey
    }
}