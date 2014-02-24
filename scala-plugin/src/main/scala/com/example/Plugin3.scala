package com.example

import com.example.api.PluginInterface
import org.springframework.stereotype.Component

@Component
class Plugin3 extends PluginInterface{
  def name = "scala-plugin"
  def performAction(parameter: String)= s"$name with $parameter"
}