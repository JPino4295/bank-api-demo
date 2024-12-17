package main.java.com.jdelpino.bankApiDemo.context;

import main.java.com.jdelpino.bankApiDemo.context.AccountId;
import lombok.Getter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import com.google.gson.JsonObject;

@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Account {
    @Getter private final AccountId id;

    public String toPrimitives() {
        JsonObject primitives = new JsonObject();

        primitives.addProperty("id", this.id.getValue());

        return primitives.toString();
    }
}
