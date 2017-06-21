package com.tisem.service;

import com.tisem.dao.CounterDao;
import com.tisem.entity.Counter;
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
        int val = getValue() + 1;
        Counter counter = counterDao.findById(1);
        counter.setValue(val);
        counterDao.save(counter);
    }

    public void decrementCount() {
        int val = getValue() - 1;
        counterDao.save(new Counter(1, val));
    }
}
