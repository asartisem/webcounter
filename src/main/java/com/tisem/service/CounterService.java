package com.tisem.service;

import com.tisem.dao.CounterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CounterService {

    @Autowired
    private CounterDao counterDao;

    public int getValue() {
        return counterDao.findById(1).getValue();
    }

    public void incrementCount() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        counterDao.incrementValue();
    }

    public void decrementCount() {
        counterDao.decrementValue();
    }
}
