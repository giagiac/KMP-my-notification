package org.giacomo.mynotification

import AppInitializer
import android.app.Application

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        AppInitializer.onApplicationStart()
    }
}