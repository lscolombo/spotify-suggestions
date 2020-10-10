package io.github.lscolombo.spotifysuggestions.services.spotifypublic.responses

import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL
import com.wrapper.spotify.model_objects.specification.PlaylistSimplified
import io.github.lscolombo.spotifysuggestions.services.spotifypublic.responses.pojos.User

@Suppress("unused")
@JsonInclude(NON_NULL)
class PlaylistResponse(playlistSimplified: PlaylistSimplified) {

    val spotifyId: String = playlistSimplified.id
    val name: String = playlistSimplified.name
    val image: String? = playlistSimplified.images?.get(0)?.url
    val owner: User = User(playlistSimplified.owner)

}