package com.simplemobiletools.voicerecorder.helpers

import android.content.Context
import com.simplemobiletools.commons.helpers.BaseConfig
import com.simplemobiletools.voicerecorder.R

class Config(context: Context) : BaseConfig(context) {
    companion object {
        fun newInstance(context: Context) = Config(context)
    }

    var hideNotification: Boolean
        get() = prefs.getBoolean(HIDE_NOTIFICATION, false)
        set(hideNotification) = prefs.edit().putBoolean(HIDE_NOTIFICATION, hideNotification).apply()

    var saveRecordingsFolder: String
        get() = prefs.getString(SAVE_RECORDINGS, "$internalStoragePath/${context.getString(R.string.app_name)}")!!
        set(saveRecordingsFolder) = prefs.edit().putString(SAVE_RECORDINGS, saveRecordingsFolder).apply()
}
