package com.annotations;

import org.springframework.stereotype.Component;

@Component
public class WebDevTeacher implements ITeacher {
    @Override
    public String getHomeWork() {
        return "Create your server backend context!";
    }
}
