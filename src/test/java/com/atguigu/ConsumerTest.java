package com.atguigu;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Hobo
 * @create 2020-12-04 19:21
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring-rabbitmq-consumer.xml")
public class ConsumerTest {


    @Test
    public void test(){
        while (true){

        }
    }

}
