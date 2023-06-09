package com.example.spring;

import org.springframework.stereotype.Repository;

@Repository
public class GirlRepository {
    public Girl fingById(int id) {
        return new Girl(id, "Anh", 2);
    }
}
