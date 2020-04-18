package com.king.ssm.dao;

import com.king.ssm.domain.Account;


public interface AccountDao {

    Account findById(Integer accountId);
}
