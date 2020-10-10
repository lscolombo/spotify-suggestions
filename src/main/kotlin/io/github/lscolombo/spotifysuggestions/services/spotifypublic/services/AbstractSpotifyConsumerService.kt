package io.github.lscolombo.spotifysuggestions.services.spotifypublic.services

import com.wrapper.spotify.SpotifyApi
import com.wrapper.spotify.exceptions.SpotifyWebApiException
import com.wrapper.spotify.requests.authorization.AbstractAuthorizationRequest
import com.wrapper.spotify.requests.data.AbstractDataRequest
import java.io.IOException
import java.text.ParseException

abstract class AbstractSpotifyConsumerService() {

    private val clientId = "faddfeb447424c6abde574626ee14cef"
    private val clientSecret = "d31dddba23b748c9b8dee33269e62a1e"

    val spotifyApi: SpotifyApi = SpotifyApi.Builder()
            .setClientId(clientId)
            .setClientSecret(clientSecret)
            .build()
    private val clientCredentialsRequest = spotifyApi.clientCredentials()
            .build()

    init {
        val clientCredentials = clientCredentialsRequest.execute()
        spotifyApi.accessToken = clientCredentials.accessToken
        println("Expires in: " + clientCredentials.expiresIn)
    }
}