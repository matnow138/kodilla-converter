package com.kodilla.kodillaconverter.controller;

import com.kodilla.kodillaconverter.domain.MyCustomClass;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/custom/")
public class CustomController {

    @PostMapping(path="add")
    public void acceptCustomTextType(@RequestBody MyCustomClass customClass){
        System.out.println(customClass.getFieldOne());
        System.out.println(customClass.getFieldTwo());
        System.out.println(customClass.getFieldThree());
    }
}
