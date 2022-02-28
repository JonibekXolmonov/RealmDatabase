package com.example.androiddatabase

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        initRealm()
    }

    private fun initRealm() {
        Realm.init(this)
        val config = RealmConfiguration.Builder()
            .allowWritesOnUiThread(true)
            .deleteRealmIfMigrationNeeded()
            .build()

        Realm.setDefaultConfiguration(config)
    }
}