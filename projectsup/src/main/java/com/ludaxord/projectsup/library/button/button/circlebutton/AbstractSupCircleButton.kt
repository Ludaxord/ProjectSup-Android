package com.ludaxord.projectsup.library.button.button.circlebutton

import android.content.Context
import android.util.AttributeSet
import com.ludaxord.projectsup.library.button.button.AbstractSupButton
import com.ludaxord.projectsup.library.utilities.Defaults.DEFAULT_CORNER_ROUND_FLOAT

abstract class AbstractSupCircleButton : AbstractSupButton {

    internal var corners: Float = 0.0f
    internal var cornerList: List<Float> = emptyList()

    protected constructor(context: Context, res: Pair<String, String>, corners: Float) : super(context, res) {
        this.res = res
        this.corners = corners
        setInitializer()
    }

    protected constructor(context: Context, attrs: AttributeSet, res: Pair<String, String>, corners: Float) : super(
        context,
        attrs,
        res
    ) {
        this.res = res
        this.corners = corners
        setInitializer()
    }

    protected constructor(
        context: Context,
        attrs: AttributeSet,
        defStyle: Int,
        res: Pair<String, String>,
        corners: Float
    ) : super(
        context,
        attrs,
        defStyle,
        res
    ) {
        this.res = res
        this.corners = corners
        setInitializer()
    }

    protected constructor(context: Context, res: Pair<String, String>, cornerList: List<Float>) : super(context, res) {
        this.res = res
        this.cornerList = cornerList
        setInitializer()
    }

    protected constructor(
        context: Context,
        attrs: AttributeSet,
        res: Pair<String, String>,
        cornerList: List<Float>
    ) : super(
        context,
        attrs,
        res
    ) {
        this.res = res
        this.cornerList = cornerList
        setInitializer()
    }

    protected constructor(
        context: Context,
        attrs: AttributeSet,
        defStyle: Int,
        res: Pair<String, String>,
        cornerList: List<Float>
    ) : super(
        context,
        attrs,
        defStyle,
        res
    ) {
        this.res = res
        this.cornerList = cornerList
        setInitializer()
    }

    protected constructor(context: Context) : this(
        context,
        Pair(
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_style),
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_color_schema)
        ),
        DEFAULT_CORNER_ROUND_FLOAT
    )

    protected constructor(context: Context, attrs: AttributeSet) : this(
        context,
        attrs,
        Pair(
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_style),
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_color_schema)
        ),
        DEFAULT_CORNER_ROUND_FLOAT
    )

    protected constructor(context: Context, attrs: AttributeSet, defStyle: Int) : this(
        context,
        attrs,
        defStyle,
        Pair(
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_style),
            context.getString(com.ludaxord.projectsup.R.string.key_sup_default_color_schema)
        ),
        DEFAULT_CORNER_ROUND_FLOAT
    )

    override fun setDefaultViewUtils() {
        super.setDefaultViewUtils()
        setDefaultCorners()
    }

    private fun setInitializer() {
        setDefaultViewUtils()
    }

    private fun setDefaultCorners() {
        if (cornerList.isNotEmpty()) {
            setCornersFromList(cornerList)
        } else {
            setCornersFromFloat(corners)
        }
    }

    protected fun setCornersFromList(cornerList: List<Float>) {
        this.setCorners(cornerList)
    }

    protected fun setCornersFromFloat(corners: Float) {
        this.setCorners(corners)
    }

}