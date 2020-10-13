package io.bridge.springtest;

import io.bridge.springtest.model.GreatVO;
import io.bridge.springtest.service.ITestService;
import io.bridge.springtest.web.TestControlloer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


@SpringBootTest(classes = SpringtestApplication.class)
class SpringtestApplicationTests {

    @MockBean
    private ITestService testService;

    @Autowired
    private TestControlloer testControlloer;

    @BeforeEach
    private void setUp() {
        GreatVO greatVO = new GreatVO();
        greatVO.setName("mockname");
        greatVO.setId(999);
        Mockito.when(testService.getGreat()).thenReturn(greatVO);
    }

    @Test
    void contextLoads() {
//        TestControlloer mock = Mockito.mock(TestControlloer.class);

//        GreatVO greatVO1 = mock.test();
//        assertThat(greatVO,equalTo(greatVO1));
        GreatVO greatVO1 = testControlloer.test();
        assertThat("id is wrong.", greatVO1.getId(), equalTo(999));
    }

}
