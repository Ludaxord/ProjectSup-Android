package com.ludaxord.projectsup.library.widget.calendarview.elements.adapter

import android.app.AlertDialog
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.ludaxord.projectsup.R
import com.ludaxord.projectsup.library.utilities.themes.Theme
import com.ludaxord.projectsup.library.widget.calendarview.elements.models.Schedule
import com.ludaxord.projectsup.library.widget.interfaces.IAdapter
import java.util.*

class SupEventsAdapter(private val context: Context) : BaseAdapter(), IAdapter {

    private lateinit var inflater: LayoutInflater
    private lateinit var _scheduleEvents: ArrayList<Schedule>
    private lateinit var _dialog: AlertDialog
    private lateinit var color: com.ludaxord.projectsup.library.utilities.colors.Color
    private lateinit var theme: Theme

    private var layout: Int? = null

    constructor(
        context: Context, scheduleEvents: ArrayList<Schedule>, dialog: AlertDialog,
        theme: Theme,
        color: com.ludaxord.projectsup.library.utilities.colors.Color
    ) : this(context) {
        inflater = LayoutInflater.from(context)
        _scheduleEvents = scheduleEvents
        _dialog = dialog
        this.theme = theme
        this.color = color
        sortByDate(_scheduleEvents)
    }

    constructor(
        context: Context,
        scheduleEvents: ArrayList<Schedule>,
        dialog: AlertDialog,
        theme: Theme,
        color: com.ludaxord.projectsup.library.utilities.colors.Color,
        layout: Int?
    ) : this(context, scheduleEvents, dialog, theme, color) {
        this.layout = layout
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = setView(convertView, parent)
        val item = setItem(position) as Schedule

        setFonts(view, theme, color, false)

        return view
    }

    override fun getItem(position: Int): Any {
        return _scheduleEvents[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return _scheduleEvents.count()
    }

    override fun setItem(position: Int): Any {
        val event = getItem(position) as Schedule
        return event
    }

    override fun setView(convertView: View?, parent: ViewGroup?): View {
        var view = convertView

        if (view == null) {
            view = if (layout == null) {
                inflater.inflate(R.layout.sup_events_adapter, parent, false)
            } else {
                inflater.inflate(layout!!, parent, false)
            }
        }

        return view!!
    }

    private fun sortByDate(list: ArrayList<Schedule> = _scheduleEvents) {
        list.sortWith(Comparator { o1, o2 -> o1.beginDate!!.compareTo(o2.beginDate!!) })
    }

}