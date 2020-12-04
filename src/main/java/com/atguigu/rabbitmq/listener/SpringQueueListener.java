package com.atguigu.rabbitmq.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;


import java.io.UnsupportedEncodingException;

/**
 * @author Hobo
 * @create 2020-12-04 19:15
 */
@Component
public class SpringQueueListener implements MessageListener {
    @Override
    public void onMessage(Message message) {
        try {
            String msg = new String(message.getBody(),"UTF-8");
            System.out.println("msg = " + msg);
        } catch (UnsupportedEncodingException e) {

        }
    }
}
