package main.java.com.jdelpino.bankApiDemo.application;

import main.java.com.jdelpino.bankApiDemo.context.Account;
import main.java.com.jdelpino.bankApiDemo.context.AccountId;
import main.java.com.jdelpino.bankApiDemo.application.CreateAccountCommand;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class AccountCreator {
    public Account run(CreateAccountCommand command) {
        Account account = new Account(new AccountId(command.getId()));
        
        return account;
    }
    
}
