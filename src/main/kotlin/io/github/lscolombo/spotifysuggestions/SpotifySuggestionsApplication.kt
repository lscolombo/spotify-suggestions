package io.github.lscolombo.spotifysuggestions

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["io.github.lscolombo"])
class SpotifySuggestionsApplication

fun main(args: Array<String>) {
    runApplication<SpotifySuggestionsApplication>(*args)
}
