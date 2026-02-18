package com.example.boilerplate.engine;

import com.example.boilerplate.api.AppService;

public final class DefaultAppService implements AppService {
    @Override
    public String run(String input) {
        return "ok:" + (input == null ? "" : input);
    }
}
