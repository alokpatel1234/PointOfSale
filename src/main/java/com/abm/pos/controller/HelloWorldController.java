package com.abm.pos.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *Created by asp5045 on 11/22/16.
 */


@RestController
@RequestMapping("")
@CrossOrigin(origins = {"*"})
public class HelloWorldController {

    @RequestMapping(value = "/Hello", method = RequestMethod.GET)
    public String getWebMenu() {

        return "Helle";
    }
}
