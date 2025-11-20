package webserverprogramming20221320.week12_mongodb_backend.repository

import org.springframework.data.mongodb.repository.MongoRepository
import webserverprogramming20221320.week12_mongodb_backend.model.Song

interface SongRepository : MongoRepository<Song, String> {
    fun findBySinger(singer: String): List<Song>

}