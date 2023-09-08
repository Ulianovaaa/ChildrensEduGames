package com.izzzya.childrensedugames

import android.content.Context
import android.content.SharedPreferences

class SharedPrefs(context: Context) {
    init {
        sharedPref = context.getSharedPreferences(PREFERENCES, Context.MODE_PRIVATE)

    }

    companion object{
        private var sharedPref: SharedPreferences? = null
        const val PREFERENCES = "prefs"
        const val ONB_COMPLETE: Boolean = false

        fun setOnb(t: Boolean){
            sharedPref?.edit()
                ?.putBoolean("ONB_COMPLETE", t)
                ?.apply()
        }

        fun getOnb(): Boolean? {
            return sharedPref?.getBoolean("ONB_COMPLETE",false)

        }
    }
}