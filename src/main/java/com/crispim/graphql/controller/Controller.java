package com.crispim.graphql.controller;

import com.crispim.graphql.records.Author;
import com.crispim.graphql.records.Book;
import com.crispim.graphql.records.Publisher;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;

import java.util.List;

@org.springframework.stereotype.Controller
public class Controller {

    @QueryMapping
    public Author authorById(@Argument String id){
        return Author.getById(id);
    }

    @QueryMapping
    public Book bookId(@Argument String id){
        return Book.getById(id);
    }

    @QueryMapping
    public List<Book> allBooks() {
        return Book.getAllBooks();
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }

    @SchemaMapping
    public Publisher publisher(Book book) {
        return Publisher.getById(book.publisherId());
    }
}