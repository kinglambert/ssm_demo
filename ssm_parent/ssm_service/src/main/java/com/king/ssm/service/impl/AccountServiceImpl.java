package com.king.ssm.service.impl;

import com.king.ssm.dao.AccountDao;
import com.king.ssm.domain.Account;
import com.king.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    public Account findAccountById(Integer accountId) {
		 System.out.println("=====findAccountById=====");
		 System.out.println("=====findAccountById1=====");
		 System.out.println("=====findAccountById2=====");
		 System.out.println("=====findAccountById3=====");
        return accountDao.findById(accountId);
    }
}
