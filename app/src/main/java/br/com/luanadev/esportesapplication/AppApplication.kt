package br.com.luanadev.esportesapplication

import android.app.Application
import br.com.luanadev.esportesapplication.di.daoModule
import br.com.luanadev.esportesapplication.di.testeDatabaseModule
import br.com.luanadev.esportesapplication.di.uiModule
import br.com.luanadev.esportesapplication.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class AppApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@AppApplication)
            modules(
                listOf(
                    testeDatabaseModule,
                    daoModule,
                    uiModule,
                    viewModelModule
                )
            )
        }
    }
}