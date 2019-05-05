package dev.wesleysantos.interactormapper.phrase

import dev.wesleysantos.database.gen.Phrases
import dev.wesleysantos.interactormapper.Mapper
import dev.wesleysantos.repository.model.PhraseViewModel
import javax.inject.Inject

interface PhraseMapper : Mapper<Phrases, PhraseViewModel>

class PhraseMapperImpl @Inject constructor( ) : PhraseMapper {
    override fun mapToPresentation(params: Phrases): PhraseViewModel =
            PhraseViewModel(params.phrase)
}