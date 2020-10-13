package io.bridge.springtest.service.impl;

import io.bridge.springtest.model.GreatVO;
import io.bridge.springtest.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestService implements ITestService {
    @Override
    public GreatVO getGreat() {

        GreatVO greatVO = new GreatVO();
        greatVO.setId(10);
        greatVO.setName("myGirl-modify11");
        return greatVO;
    }
}
