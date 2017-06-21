package com.tisem;

import com.tisem.service.CounterService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WebApplication.class)
public class CounterServiceTest {

    @Autowired
    private CounterService counterService;

    private int value;

    @Before
    public void setUp() {
        value = counterService.getValue();
    }

    @Test
    public void incrementService() {
        counterService.incrementCount();
        Assert.assertSame(++value, counterService.getValue());
    }

    @Test
    public void decrementService() {
        counterService.decrementCount();
        Assert.assertSame(--value, counterService.getValue());
    }
}
