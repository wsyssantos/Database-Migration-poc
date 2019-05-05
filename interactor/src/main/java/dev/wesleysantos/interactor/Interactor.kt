package dev.wesleysantos.interactor

interface Interactor<in P, out R> {
    operator fun invoke(params: P) : R
}