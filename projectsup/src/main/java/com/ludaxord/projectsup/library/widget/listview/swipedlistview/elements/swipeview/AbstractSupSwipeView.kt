package com.ludaxord.projectsup.library.widget.listview.swipedlistview.elements.swipeview

import android.content.Context
import android.util.AttributeSet
import android.widget.RelativeLayout

abstract class AbstractSupSwipeView : RelativeLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

}