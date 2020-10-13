package io.bridge.springtest.web;

import io.bridge.springtest.model.GreatVO;
import io.bridge.springtest.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControlloer {

    @Autowired
    private ITestService testService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public GreatVO test(){
        return testService.getGreat();
    }
}
