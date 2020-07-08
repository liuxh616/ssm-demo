package com.fengfang.dao;

import com.fengfang.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description TODO
 * @Author liuxh
 * @Date 2020/7/7 17:26
 **/
@Repository
public interface IAccountDao {

    /**
     * 获取所有用户数据
     * @return
     */
    @Select("select * from account")
    public List<Account> findAll();

    /**
     * 保存用户数据
     * @param account
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void  saveAccount(Account account);

}
