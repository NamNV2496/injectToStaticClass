package com.example.injecttostaticclass.util;

import com.example.injecttostaticclass.service.ExampleService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StaticUtils {

    // injection service to static class
    private static ExampleService exampleService;
    public static void setMyConfig(ExampleService exampleService) {
        StaticUtils.exampleService = exampleService;
    }
    // end

    public static List<Long> getValueUtil(int type) {
        return exampleService.getValue(type);
    }
}
