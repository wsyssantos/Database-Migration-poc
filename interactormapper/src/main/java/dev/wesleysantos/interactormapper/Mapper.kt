package dev.wesleysantos.interactormapper

interface Mapper<in PARAMS, out VIEWMODEL>{
    fun mapToPresentation(params : PARAMS) : VIEWMODEL
}