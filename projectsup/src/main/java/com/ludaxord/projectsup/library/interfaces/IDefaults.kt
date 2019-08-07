package com.ludaxord.projectsup.library.interfaces

import android.view.View
import com.ludaxord.projectsup.library.utilities.overrideFontColor
import com.ludaxord.projectsup.library.utilities.overrideFontTypeFace

interface IDefaults {
    fun setFonts(rootView: View, res: Any?, withColor: Boolean = true) {
        rootView.overrideFontTypeFace(res)
        if (withColor) {
            rootView.overrideFontColor()
        }
    }
}