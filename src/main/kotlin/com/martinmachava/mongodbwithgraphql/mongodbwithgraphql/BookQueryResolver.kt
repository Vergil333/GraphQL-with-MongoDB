package com.martinmachava.mongodbwithgraphql.mongodbwithgraphql

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import org.springframework.stereotype.Component

@Component
class BookQueryResolver(private val bookDao: BookDao) : GraphQLQueryResolver {
    fun book(id: String) = bookDao.findBookById(id)

    fun booksByName(name: String) = bookDao.findBooksByName(name)
}
