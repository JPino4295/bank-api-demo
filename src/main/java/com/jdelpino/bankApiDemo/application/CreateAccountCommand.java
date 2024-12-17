package main.java.com.jdelpino.bankApiDemo.application;

import lombok.NonNull;
import lombok.Getter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class CreateAccountCommand {
    @NonNull
    @Getter private final String id;
}
