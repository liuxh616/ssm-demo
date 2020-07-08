package com.fengfang.test;

import com.fengfang.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/7/7 11:29
 **/
public class SpringTest {
    @Test
    public void  testServiceRun(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        IAccountService  accountService = (IAccountService)context.getBean("accountService");
        accountService.findAll();
    }
}
