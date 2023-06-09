package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    GirlRepository girlRepository;
    public Girl findGirlById(int id) {
        Girl girl = girlRepository.fingById(id);
        girl.setName(girl.getName().toUpperCase());
        return  girl;
    }
}
