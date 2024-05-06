/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.qltvspringboot.Email;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

/**
 *
 * @author khang
 */
public class MainApp {

    public static void main(final String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MailSender mailSender = (MailSender) context.getBean("mailSender2");
        System.out.println("Sending text...");
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("khangdo0107@gmail.com");
        message.setTo("lehoanggiakhuong2006@gmail.com");
        message.setSubject("Subject");
        message.setText("test send gmail using spring");
// sending message
        mailSender.send(message);
        System.out.println("Sending text done!");
        context.close();
    }
}
