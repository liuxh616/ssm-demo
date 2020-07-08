package com.fengfang.test;

import com.fengfang.dao.IAccountDao;
import com.fengfang.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/7/7 15:44
 **/
public class MybatisTest {
    @Test
    public void runMybatisTest() throws IOException {
        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml.bak");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        IAccountDao accountDao = session.getMapper(IAccountDao.class);
        List<Account> accounts= accountDao.findAll();
        for(Account account :accounts){
            System.out.println(account);
        }
        session.close();
        inputStream.close();
    }

    @Test
    public void  testSaveAccount() throws IOException{

        //加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml.bak");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = factory.openSession();
        IAccountDao accountDao = session.getMapper(IAccountDao.class);
        Account account = new Account();
        account.setName("刘德华");
        account.setMoney(500d);
        accountDao.saveAccount(account);
        //提交事务
        session.commit();
        session.close();
        inputStream.close();
    }
}
