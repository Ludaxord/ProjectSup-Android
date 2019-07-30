package com.ludaxord.projectsup.library.widget.webview

import android.content.Context
import android.util.AttributeSet
import android.webkit.WebView

abstract class AbstractSupWebView : WebView {
    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)
}