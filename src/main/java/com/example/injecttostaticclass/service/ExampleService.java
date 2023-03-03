package com.example.injecttostaticclass.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ExampleService {
    public List<Long> getValue(int type) {
        switch (type) {
            case 1:
                return List.of(0L);
            case 2:
                return List.of(0L, 12L);
            case 3:
                return List.of(0L, 12L, 123L);
            default:
                return Collections.emptyList();
        }
    }
}
