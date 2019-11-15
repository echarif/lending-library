package com.echarif.library.librarymanager.entrypoint.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping(value = "/books")
    public void searchBooks(){

    }

    @GetMapping(value = "/bookByIsbn")
    public void searchBookByISBN(){

    }

    @GetMapping(value = "/bookbyTitle")
    public void searchBookByTitle(){

    }

    @GetMapping(value = "/bookByAuthor")
    public void searchBookByAuthor(){

    }
}
