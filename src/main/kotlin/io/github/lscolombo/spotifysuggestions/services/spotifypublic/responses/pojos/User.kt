package io.github.lscolombo.spotifysuggestions.services.spotifypublic.responses.pojos

import com.wrapper.spotify.model_objects.specification.User

class User(user: User) {
    val spotifyId: String = user.id
    val displayName: String = user.displayName
    val image: String? = user.images?.get(0)?.url
    val email: String? = user.email
    val followers: Int = user.followers.total
}