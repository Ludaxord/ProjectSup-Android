package com.ludaxord.projectsup.library.utilities.languages.languageoptions

import com.ludaxord.projectsup.R
import com.ludaxord.projectsup.library.utilities.languages.Language

class Polish : Language() {

    override fun getLanguageCredentials(): HashMap<String, String> {
        val languageMap = HashMap<String, String>()

        getFullDayNames().forEach { (t, u) -> languageMap[t] = u }
        getShortDayNames().forEach { (t, u) -> languageMap[t] = u }

        return languageMap
    }

    override fun getFullDayNames(): HashMap<String, String> {
        return hashMapOf(
            resources.getString(R.string.key_language_full_monday) to resources.getString(R.string.language_pl_full_day_name_monday),
            resources.getString(R.string.key_language_full_tuesday) to resources.getString(R.string.language_pl_full_day_name_tuesday),
            resources.getString(R.string.key_language_full_wednesday) to resources.getString(R.string.language_pl_full_day_name_wednesday),
            resources.getString(R.string.key_language_full_thursday) to resources.getString(R.string.language_pl_full_day_name_thursday),
            resources.getString(R.string.key_language_full_friday) to resources.getString(R.string.language_pl_full_day_name_friday),
            resources.getString(R.string.key_language_full_saturday) to resources.getString(R.string.language_pl_full_day_name_saturday),
            resources.getString(R.string.key_language_full_sunday) to resources.getString(R.string.language_pl_full_day_name_sunday)
        )
    }

    override fun getShortDayNames(): HashMap<String, String> {
        return hashMapOf(
            resources.getString(R.string.key_language_short_monday) to resources.getString(R.string.language_pl_short_day_name_monday),
            resources.getString(R.string.key_language_short_tuesday) to resources.getString(R.string.language_pl_short_day_name_tuesday),
            resources.getString(R.string.key_language_short_wednesday) to resources.getString(R.string.language_pl_short_day_name_wednesday),
            resources.getString(R.string.key_language_short_thursday) to resources.getString(R.string.language_pl_short_day_name_thursday),
            resources.getString(R.string.key_language_short_friday) to resources.getString(R.string.language_pl_short_day_name_friday),
            resources.getString(R.string.key_language_short_saturday) to resources.getString(R.string.language_pl_short_day_name_saturday),
            resources.getString(R.string.key_language_short_sunday) to resources.getString(R.string.language_pl_short_day_name_sunday)
        )
    }
}