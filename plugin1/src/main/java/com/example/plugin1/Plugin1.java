package com.example.plugin1;

import com.example.api.PluginInterface;
import org.springframework.stereotype.Component;

@Component
public class Plugin1 implements PluginInterface {
    @Override
    public String performAction(String parameter) {
        return name() + " invoked with " + parameter;
    }

    @Override
    public String name() {
        return "plugin1";
    }
}
