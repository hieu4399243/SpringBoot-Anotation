package com.example.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bikini")
@Scope("prototype")
public class Bikini implements Outfit {

    @Override
    public void wear() {
        System.out.println("Đã mặc bikini");
    }
}
