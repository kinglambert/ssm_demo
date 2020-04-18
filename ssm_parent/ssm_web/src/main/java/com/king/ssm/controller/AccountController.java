package com.king.ssm.controller;

import com.king.ssm.domain.Account;
import com.king.ssm.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/account")
public class AccountController {
    @Autowired
    private AccountService accountService;

    @RequestMapping("/viewAccount")
    public String viewAccount(HttpServletRequest request,Model model){
        String id = request.getParameter("id");
        Account account = accountService.findAccountById(Integer.parseInt(id));
        model.addAttribute("account", account);
        return "account_list";
    }
}
