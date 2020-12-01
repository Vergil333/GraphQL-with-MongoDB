package com.martinmachava.mongodbwithgraphql.mongodbwithgraphql

import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class BookDao(private val bookRepository: BookRepository) {
    fun findBookById(id: String) = bookRepository.findById(id)

    fun findBooksByName(name: String) = bookRepository.findByNameLike(name)

    @PostConstruct
    private fun init() {
        bookRepository.deleteAll()
        bookRepository.saveAll(listOf(
                Book("1", "Lord of the Rings, part 1"),
                Book("2", "Lord of the Rings, part 2"),
                Book("3", "Lord of the Rings, part 3"),
                Book("4", "Lord of the Rings, part 4"),
                Book("5", "Harry Potter, part 1"),
                Book("6", "Harry Potter, part 2"),
                Book("7", "Harry Potter, part 3"),
                Book("8", "Harry Potter, part 4"),
                Book("9", "Harry Potter, part 5"),
        ))
    }

}
