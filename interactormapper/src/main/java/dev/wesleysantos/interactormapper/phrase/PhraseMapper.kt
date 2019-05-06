package dev.wesleysantos.interactormapper.phrase

import dev.wesleysantos.database.room.entity.Phrase
import dev.wesleysantos.interactormapper.Mapper
import dev.wesleysantos.interactormapper.model.PhraseViewModel
import javax.inject.Inject

interface PhraseMapper : Mapper<Phrase, PhraseViewModel>

class PhraseMapperImpl @Inject constructor( ) : PhraseMapper {
    override fun mapToPresentation(params: Phrase): PhraseViewModel =
            PhraseViewModel(params.phrase?: "")
}