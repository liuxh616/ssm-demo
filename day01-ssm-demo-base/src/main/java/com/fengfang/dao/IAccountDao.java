package com.fengfang.dao;

import com.fengfang.domain.Account;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/7/7 17:26
 **/
public interface IAccountDao {

    /**
     * 获取所有用户数据
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存用户数据
     * @param account
     */
    public void  saveAccount(Account account);

}
