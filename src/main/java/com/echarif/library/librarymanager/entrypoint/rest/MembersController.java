package com.echarif.library.librarymanager.entrypoint.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MembersController {

    @GetMapping("/members")
    public void searchMembers(){

    }

    @GetMapping("/memberById")
    public void searchMemberById(){

    }

    @GetMapping("/memberByName")
    public void searchMemberByName(){

    }
}
