package com.martinmachava.mongodbwithgraphql.mongodbwithgraphql

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "book")
data class Book(@Id val id: String, val name: String)
