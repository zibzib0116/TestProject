package com.example.bank_card

import android.app.Application
import com.example.bank_card.Network.apiModule
import com.example.bank_card.Repositories.repositoryModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class BankApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@BankApplication)
            modules(listOf(apiModule, repositoryModule))
        }
    }
}