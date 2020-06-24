package com.marty.behaviortracker

import android.app.Application
import timber.log.Timber

class BehaviorTrackerApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeTimber()
    }

    private fun initializeTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}
