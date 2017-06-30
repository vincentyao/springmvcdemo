package com.onion.controller;

import com.onion.model.RegisterUserEntity;
import com.onion.repository.UserRepository;
import com.onion.repository.registerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 161116 on 2017/6/29.
 */
@Controller
public class register {
    @Autowired
    registerRepository registerRepository;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String registerUser(@ModelAttribute("register") RegisterUserEntity registerUserEntity) {


        System.out.print("the post loginName is:" + registerUserEntity.getLoginName());

        registerRepository.saveAndFlush(registerUserEntity);
        return "redirect:/admin/users";
    }
}
