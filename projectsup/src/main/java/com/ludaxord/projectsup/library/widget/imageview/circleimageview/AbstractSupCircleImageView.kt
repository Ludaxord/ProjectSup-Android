package com.ludaxord.projectsup.library.widget.imageview.circleimageview

import android.content.Context
import android.util.AttributeSet
import com.ludaxord.projectsup.library.widget.imageview.AbstractSupImageView

abstract class AbstractSupCircleImageView: AbstractSupImageView {

    constructor(context: Context?) : super(context)

    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs)

    constructor(context: Context?, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

}