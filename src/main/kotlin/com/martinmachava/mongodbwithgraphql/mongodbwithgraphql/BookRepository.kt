package com.martinmachava.mongodbwithgraphql.mongodbwithgraphql

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BookRepository : MongoRepository<Book, String> {
    fun findByNameLike(name: String): List<Book>
}
