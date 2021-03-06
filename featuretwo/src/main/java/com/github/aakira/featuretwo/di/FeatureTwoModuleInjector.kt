package com.github.aakira.featuretwo.di

import com.github.aakira.daggerinstantapps.di.AppComponent
import com.github.aakira.daggerinstantapps.di.BaseModuleInjector
import com.github.aakira.daggerinstantapps.di.DaggerComponent
import dagger.android.AndroidInjector

object FeatureTwoModuleInjector : BaseModuleInjector() {

    override fun moduleInjector(daggerComponent: DaggerComponent): AndroidInjector<out BaseModuleInjector> {
        return DaggerFeatureTwoComponent.builder()
                .appComponent(daggerComponent as AppComponent)
                .build()
    }
}