package com.example.injecttostaticclass.config;

import com.example.injecttostaticclass.service.ExampleService;
import com.example.injecttostaticclass.util.StaticUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class StaticContextInitializer {
    @Autowired
    ExampleService exampleService;

    @Autowired
    private ApplicationContext context;

    @PostConstruct
    public void init() {
        StaticUtils.setMyConfig(exampleService);
    }
}
