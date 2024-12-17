package main.java.com.jdelpino.bankApiDemo.context;

import lombok.Getter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class AccountId {
    @Getter private final String value;
}
