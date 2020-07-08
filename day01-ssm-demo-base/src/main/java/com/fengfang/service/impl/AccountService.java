package com.fengfang.service.impl;

import com.fengfang.dao.IAccountDao;
import com.fengfang.domain.Account;
import com.fengfang.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/7/7 17:27
 **/
@Service("accountService")
public class AccountService implements IAccountService {

    @Autowired
    private IAccountDao accountDao;

    /**
     * 业务层，获取所有账户信息
     * @return
     */
    @Override
    public List<Account> findAll() {
        System.out.println("业务层：获取所有账户信息");
        List<Account> accounts = accountDao.findAll();
        return accounts;
    }

    /**
     * 业务层保存账户信息方法
     * @param account
     */
    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层：保存账户信息");
        accountDao.saveAccount(account);
    }
}
