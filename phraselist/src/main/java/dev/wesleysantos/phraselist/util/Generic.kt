package dev.wesleysantos.phraselist.util

import kotlin.random.Random

private const val ALLOWED_CHARACTERS = "0123456789qwertyuiopasdfghjklzxcvbnm"

fun getRandomString(sizeOfRandomString: Int): String {
    val sb = StringBuilder(sizeOfRandomString)
    for (i in 0 until sizeOfRandomString)
        sb.append(ALLOWED_CHARACTERS[Random.nextInt(ALLOWED_CHARACTERS.length)])
    return sb.toString()
}

fun getRandomString() : String =
    getRandomString(Random.nextInt(0, 15))
