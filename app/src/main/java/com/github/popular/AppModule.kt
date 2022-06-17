package com.github.popular

import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

private const val MAIN_SCHEDULER_NAME = "MainScheduler"
private const val NETWORK_SCHEDULER_NAME = "NetworkScheduler"
val appModule = module {

    single<Scheduler>(named(MAIN_SCHEDULER_NAME)) {
        AndroidSchedulers.mainThread()
    }
    single(named(NETWORK_SCHEDULER_NAME)) {
        Schedulers.io()
    }

    viewModel {
        PopularListingViewModel()
    }

}
