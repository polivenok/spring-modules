package com.example.plugin2;

import com.example.api.PluginInterface;
import org.springframework.stereotype.Component;

@Component
public class Plugin2 implements PluginInterface {
    @Override
    public String performAction(String parameter) {
        return name() + " invoked with " + parameter;
    }

    @Override
    public String name() {
        return "plugin2";
    }
}
