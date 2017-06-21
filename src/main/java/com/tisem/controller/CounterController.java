package com.tisem.controller;

import com.tisem.response.CounterResponse;
import com.tisem.service.CounterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/counter")
@Controller
public class CounterController {

    @Autowired
    private CounterService counterService;

    @RequestMapping(method = RequestMethod.GET)
    public String getCount(Model model) {
        model.addAttribute("value", counterService.getValue());
        return "counter";
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public CounterResponse incrementCount() {
        counterService.incrementCount();
        return CounterResponse.success();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    @ResponseBody
    public CounterResponse decrementCount() {
        counterService.decrementCount();
        return CounterResponse.success();
    }
}
