package com.example.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        PluginsService helloService = context.getBean(PluginsService.class);
        helloService.invokePlugins("Test value");
    }
}
