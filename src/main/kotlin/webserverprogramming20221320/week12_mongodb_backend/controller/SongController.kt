package webserverprogramming20221320.week12_mongodb_backend.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.CrossOrigin
import webserverprogramming20221320.week12_mongodb_backend.model.Song
import webserverprogramming20221320.week12_mongodb_backend.service.SongService

@RestController
@RequestMapping("/api/songs") // 제일 뒤에 슬래시 없음에 유의
//@CrossOrigin(origins = ["http://localhost:5173"]) // CORS 문제 에러
@CrossOrigin(origins = ["*"]) // CORS 문제 에러

class SongController (
    private val service: SongService
) {
    @GetMapping
    fun getAllSongs(): List<Song> = service.getAllSongs()

    @GetMapping("/{id}")
    fun getSongById(@PathVariable id: String) : Song? = service.getSongById(id)
}