package com.example

import com.example.api.PluginInterface
import org.springframework.stereotype.Component

@Component
class Plugin4 implements PluginInterface {

    @Override
    String performAction(String parameter) {
        return name() + " with $parameter"
    }

    @Override
    String name() {
        return "groovy-plugin"
    }
}
