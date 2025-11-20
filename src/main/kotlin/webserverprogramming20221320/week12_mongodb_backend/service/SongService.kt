package webserverprogramming20221320.week12_mongodb_backend.service

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import webserverprogramming20221320.week12_mongodb_backend.model.Song
import webserverprogramming20221320.week12_mongodb_backend.repository.SongRepository

@Service
class SongService(
    private val repository: SongRepository
) {
    fun getAllSongs(): List<Song> = repository.findAll()

    fun getSongById(id: String): Song? = repository.findById(id).orElse(null)
}