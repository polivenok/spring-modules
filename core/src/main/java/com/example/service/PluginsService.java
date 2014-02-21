package com.example.service;

import com.example.api.PluginInterface;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;

@Component
public class PluginsService {

    @Inject
    private List<PluginInterface> plugins;

    public void invokePlugins(String parameter) {
        for (PluginInterface plugin : plugins) {
            System.out.println(String.format("Invoked %s plugin. Returned %s", plugin.getClass().getName(), plugin.performAction(parameter)));
        }

    }

}
