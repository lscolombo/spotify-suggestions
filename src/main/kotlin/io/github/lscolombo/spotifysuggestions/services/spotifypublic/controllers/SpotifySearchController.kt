package io.github.lscolombo.spotifysuggestions.services.spotifypublic.controllers

import io.github.lscolombo.spotifysuggestions.services.spotifypublic.responses.PlaylistResponse
import io.github.lscolombo.spotifysuggestions.services.spotifypublic.services.SearchSpotifyConsumerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("search")
class SpotifySearchController(private val searchSpotifyConsumerService: SearchSpotifyConsumerService) {

    @GetMapping("playlists")
    fun getPlaylistsByKeyword(@RequestParam("keyword") keyword: String): ResponseEntity<List<PlaylistResponse>> {
        return ResponseEntity.ok(searchSpotifyConsumerService.searchPlaylist(keyword))
    }
}