package com.example.plugin2;

import com.example.api.PluginInterface;
import org.springframework.stereotype.Component;

@Component
public class Plugin2 implements PluginInterface {
    @Override
    public String performAction(String parameter) {
        return "plugin 2 invoked with " + parameter;
    }
}
