package com.king.ssm.test;

import com.king.ssm.domain.Account;
import com.king.ssm.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {
    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring/applicationContext-service.xml");
        AccountService accountService = ac.getBean(AccountService.class);
        Account account = accountService.findAccountById(3);
        System.out.println(account);
    }
}
