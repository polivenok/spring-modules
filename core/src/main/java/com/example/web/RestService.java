package com.example.web;

import com.example.service.PluginsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.inject.Inject;

@Controller
@RequestMapping("/")
public class RestService {
    @Inject
    private PluginsService pluginSerivce;

    @RequestMapping(method = RequestMethod.GET, value = "/{name}")
    @ResponseBody
    public String process(@PathVariable String name, @RequestParam(required = false) String parameter) {
        return pluginSerivce.invokePlugin(name, parameter);
    }

}
