package com.fengfang.service;

import com.fengfang.domain.Account;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/7/7 17:27
 **/
public interface IAccountService {

    public List<Account> findAll();


    public void  saveAccount(Account account);
}
