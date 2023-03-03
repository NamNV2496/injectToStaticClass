package com.example.injecttostaticclass.controller;

import com.example.injecttostaticclass.util.StaticUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
public class ExampleController {

    @GetMapping("/getValue")
    public List<Long> getValue(int type) {
        return StaticUtils.getValueUtil(type);
    }
}
