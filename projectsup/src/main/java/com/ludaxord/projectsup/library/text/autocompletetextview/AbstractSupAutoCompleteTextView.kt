package com.ludaxord.projectsup.library.text.autocompletetextview

import android.content.Context
import android.util.AttributeSet
import android.widget.AutoCompleteTextView

abstract class AbstractSupAutoCompleteTextView : AutoCompleteTextView {

    protected constructor(context: Context, res: Pair<String, String>) : super(context) {
//        this.initTheme(res.first)
    }

    protected constructor(context: Context, attrs: AttributeSet, res: Pair<String, String>) : super(context, attrs) {
//        this.initTheme(res.first)
    }

    protected constructor(context: Context, attrs: AttributeSet, defStyle: Int, res: Pair<String, String>) : super(
        context,
        attrs,
        defStyle
    ) {
//        this.initTheme(res.first)
    }

    protected constructor(context: Context) : this(
        context,
        Pair(
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_style),
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_color_schema)
        )
    )

    protected constructor(context: Context, attrs: AttributeSet) : this(
        context,
        attrs,
        Pair(
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_style),
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_color_schema)
        )
    )

    protected constructor(context: Context, attrs: AttributeSet, defStyle: Int) : this(
        context,
        attrs,
        defStyle,
        Pair(
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_style),
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_color_schema)
        )
    )
}