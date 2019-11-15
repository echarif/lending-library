package com.echarif.library.librarymanager.entrypoint.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookLendingController {

    @GetMapping("/lendingByIsbn")
    public void searchLendingByBookISBN(){

    }

    @GetMapping("/lendingByBookName")
    public void searchLendingByBookName(){

    }

    @GetMapping("/lendingByMemberName")
    public void searchLendingByMemberName(){

    }

    @GetMapping("/lendingByMemberId")
    public void searchLendingByMemberId(){

    }

    @GetMapping("/lending")
    public void searchAllLending(){

    }
}
