package io.github.lscolombo.spotifysuggestions.services.spotifypublic.responses.pojos

import com.wrapper.spotify.model_objects.specification.Track

class Track(trackSimplified: Track) {

    private fun Int.milisecondsToMinutesAndSeconds(): String = (this / 1000 / 60).toString().plus(":").plus((this / 1000 % 60).toString())

    val spotifyId: String = trackSimplified.id
    val spotifyUri: String = trackSimplified.uri
    val name: String = trackSimplified.name
    val artist: String = if (trackSimplified.artists.size > 1) trackSimplified.artists.joinToString(", ") else trackSimplified.artists[0].toString()
    val duration: String? = trackSimplified.durationMs.milisecondsToMinutesAndSeconds()

}