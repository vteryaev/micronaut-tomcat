package com.example;

import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisCommands;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller
public class SimpleController {

    private static final String COUNTER = "counter";

    @Inject
    StatefulRedisConnection<String, String> redisConnection;

    @Get("/")
    public String index() {
        RedisCommands<String, String> commands = redisConnection.sync();
        return "Page hit " + commands.incr(COUNTER) + " times";
    }

}
