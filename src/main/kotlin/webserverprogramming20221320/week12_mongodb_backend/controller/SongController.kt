package webserverprogramming20221320.week12_mongodb_backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import webserverprogramming20221320.week12_mongodb_backend.model.Song
import webserverprogramming20221320.week12_mongodb_backend.service.SongService

@RestController
@RequestMapping("/api/songs") // 제일 뒤에 슬래시 없음에 유의
class SongController (
    private val service: SongService
) {
    @GetMapping
    fun getAllSongs(): List<Song> = service.getAllSongs()

    @GetMapping("/{id}")
    fun getSongById(@PathVariable id: String) : Song? = service.getSongById(id)
}