package com;

import org.springframework.stereotype.Component;

@Component
public class Facade {

    public String getMessage() {
        return "hello";
    }
}
