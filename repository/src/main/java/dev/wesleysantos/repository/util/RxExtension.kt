package dev.wesleysantos.repository.util

import io.reactivex.Completable
import io.reactivex.Single

fun <T> createSingleWithTry(singleElement: T) : Single<T> =
    Single.create { emitter ->
        try {
            emitter.onSuccess(singleElement)
        } catch (t: Throwable) {
            emitter.onError(t)
        }
    }

fun <T> createSingleWithTry(singleAction: () -> T) : Single<T> =
    Single.create { emitter ->
        try {
            emitter.onSuccess(singleAction.invoke())
        } catch (t: Throwable) {
            emitter.onError(t)
        }
    }

fun createCompletableWithTry(action: () -> Unit) : Completable =
        Completable.create { emitter ->
            try {
                action.invoke()
                emitter.onComplete()
            } catch (t: Throwable) {
                emitter.onError(t)
            }
        }