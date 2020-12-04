package com.atguigu.rabbitmq.listener;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;

/**
 * @author Hobo
 * @create 2020-12-04 19:59
 */
@Component
public class TopicListener1 implements MessageListener {
    @Override
    public void onMessage(Message message) {
        try {
            System.out.println(new String(message.getBody(), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
