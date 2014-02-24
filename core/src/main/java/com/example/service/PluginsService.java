package com.example.service;

import com.example.api.PluginInterface;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class PluginsService {

    @Inject
    private List<PluginInterface> plugins;

    private Map<String, PluginInterface> pluginsMap = new HashMap<>();

    @PostConstruct
    public void init(){
        for (PluginInterface plugin : plugins) {
            pluginsMap.put(plugin.name(), plugin);
        }
    }

    public void invokePlugins(String parameter) {
        for (PluginInterface plugin : plugins) {
            System.out.println(String.format("Invoked %s plugin. Returned %s", plugin.name(), plugin.performAction(parameter)));
        }
    }

    public String invokePlugin(String name, String parameter) {
        if(pluginsMap.containsKey(name)){
            return pluginsMap.get(name).performAction(parameter);
        } else {
            throw new IllegalArgumentException("No plugin with name [" + name + "] registered");
        }

    }


}
