package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Girl {

    //Section @Autoried, @Qualifier
    //@Autowired
//    Outfit outfit;
//
////    public Girl() {
////    }
//    public Girl(@Qualifier("naked") Outfit outfit) {
//        this.outfit = outfit;
//    }
//
//    public Outfit getOutfit() {
//        return outfit;
//    }
//
//    public void setOutfit(Outfit outfit) {
//        this.outfit = outfit;
//    }

    private int id;
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
