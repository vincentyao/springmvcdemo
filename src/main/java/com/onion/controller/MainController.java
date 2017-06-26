package com.onion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.onion.model.UserEntity;
import com.onion.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowire;

/**
 * Created by dzkan on 2016/3/8.
 */
@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        return "index";
    }
}

