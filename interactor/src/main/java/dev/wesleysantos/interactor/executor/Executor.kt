package dev.wesleysantos.interactor.executor

import dev.wesleysantos.interactor.Interactor
import dev.wesleysantos.interactor.di.ObserveOn
import dev.wesleysantos.interactor.di.SubscribeOn
import io.reactivex.*
import javax.inject.Inject

interface Executor {
    fun <PARAMS, RESPONSE> execute(interactor: Interactor<PARAMS, Flowable<RESPONSE>>, params: PARAMS) : Flowable<RESPONSE>
    fun <PARAMS, RESPONSE> execute(interactor: Interactor<PARAMS, Observable<RESPONSE>>, params: PARAMS) : Observable<RESPONSE>
    fun <PARAMS, RESPONSE> execute(interactor: Interactor<PARAMS, Single<RESPONSE>>, params: PARAMS): Single<RESPONSE>
    fun <PARAMS> execute(interactor: Interactor<PARAMS, Completable>, params: PARAMS): Completable
}

class ExecutorImpl @Inject constructor(
    @ObserveOn private val observeOn: Scheduler,
    @SubscribeOn private val subscribeOn: Scheduler
) : Executor {

    override fun <PARAMS, RESPONSE> execute(interactor: Interactor<PARAMS, Flowable<RESPONSE>>,
                                            params: PARAMS): Flowable<RESPONSE> {
        return interactor(params)
            .observeOn(observeOn)
            .subscribeOn(subscribeOn)
    }

    override fun <PARAMS, RESPONSE> execute(interactor: Interactor<PARAMS, Observable<RESPONSE>>,
                                            params: PARAMS): Observable<RESPONSE> {
        return interactor(params)
            .observeOn(observeOn)
            .subscribeOn(subscribeOn)
    }

    override fun <PARAMS, RESPONSE> execute(interactor: Interactor<PARAMS, Single<RESPONSE>>,
                                            params: PARAMS): Single<RESPONSE> {
        return interactor(params)
            .observeOn(observeOn)
            .subscribeOn(subscribeOn)
    }

    override fun <PARAMS> execute(interactor: Interactor<PARAMS, Completable>,
                                  params: PARAMS): Completable {
        return interactor(params)
            .observeOn(observeOn)
            .subscribeOn(subscribeOn)
    }
}