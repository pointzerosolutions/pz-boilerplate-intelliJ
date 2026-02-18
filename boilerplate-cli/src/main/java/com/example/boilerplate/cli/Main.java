package com.example.boilerplate.cli;

import com.example.boilerplate.api.AppService;
import com.example.boilerplate.engine.DefaultAppService;

public final class Main {
    public static void main(String[] args) {
        AppService svc = new DefaultAppService();
        String in = args.length > 0 ? args[0] : "hello";
        System.out.println(svc.run(in));
    }
}
