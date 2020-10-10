package io.github.lscolombo.spotifysuggestions.services.spotifypublic.services

import io.github.lscolombo.spotifysuggestions.services.spotifypublic.responses.PlaylistResponse
import io.github.lscolombo.spotifysuggestions.services.spotifypublic.responses.pojos.Track
import org.springframework.stereotype.Service


@Service
class SearchSpotifyConsumerService: AbstractSpotifyConsumerService() {
    fun searchPlaylist(keyword: String, offset: Int? = 0): List<PlaylistResponse> {
        val searchPlaylistsRequest = spotifyApi.searchPlaylists(keyword)
                .limit(30)
                .offset(offset)
                .build()
        val playlistSimplifiedPaging = searchPlaylistsRequest.execute()
        return playlistSimplifiedPaging.items.map { PlaylistResponse(it) }
    }

    fun searchTrack(keyword: String, offset: Int? = 0): List<Track> {
        val searchTracksRequest = spotifyApi.searchTracks(keyword)
                .limit(30)
                .offset(offset)
                .build()
        return searchTracksRequest.execute().items.map { Track(it) }
    }
}