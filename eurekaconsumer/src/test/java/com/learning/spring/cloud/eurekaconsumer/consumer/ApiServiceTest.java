package com.learning.spring.cloud.eurekaconsumer.consumer;

import com.learning.spring.cloud.eurekaconsumer.EurekaConsumerApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest(classes = EurekaConsumerApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ApiServiceTest {

    @Autowired
    private ApiService apiService;

    @Test
    public void test() {
        try {
            System.out.println(apiService.index());
            int i = 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
