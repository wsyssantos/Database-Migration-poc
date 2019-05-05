package dev.wesleysantos.interactor.di

import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

@Module
class SchedulerModule {

    @Provides
    @ObserveOn
    fun bindObserveScheduler() : Scheduler = AndroidSchedulers.mainThread()

    @Provides
    @SubscribeOn
    fun bindSubscribeScheduler() : Scheduler = Schedulers.io()
}