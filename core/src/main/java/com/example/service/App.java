package com.example.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        PluginsService pluginsService = context.getBean(PluginsService.class);
        pluginsService.invokePlugins("Test value");
        System.out.println(pluginsService.invokePlugin("plugin1", "Some value"));
    }
}
