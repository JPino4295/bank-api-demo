package main.java.com.jdelpino.bankApiDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import main.java.com.jdelpino.bankApiDemo.application.AccountCreator;
import main.java.com.jdelpino.bankApiDemo.application.CreateAccountCommand;

import main.java.com.jdelpino.bankApiDemo.context.Account;

@RestController
public class CreateAccountController {

	@GetMapping("/")
	public String index() {
		CreateAccountCommand command = new CreateAccountCommand("1");
		AccountCreator creator = new AccountCreator();

		Account account = creator.run(command);
		

		return account.toPrimitives();
	}
	

}