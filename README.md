Project demonstrates modular (plugin based) polyglot (java, scala, groovy) architecture based on maven using spring.

All plugins implementations are spring components and resides in several maven modules and can be easily enabled or disabled, they can also be combined in various maven profiles.

Project consists of following modules:

  * API. Defines interface ofr plugins.
  * Plugin1. Implementation of API in Java.
  * Plugin2. Another implementation of API in Java.
  * Scala-plugin. Implementation of API in scala.
  * Groovy-plugin. Implementation of API in groovy.
  * Core. Web spring project with REST API. Loads all plugins specified in dependencies and provides simple REST API to invoke plugins by name.

Common module can be introduced to share common logic used in all plugins.

Archetype for creating custom third party plugin (with only binary maven dependencies on API and Core module) can be provided, and using maven overlays newly created plugin may be added to core module.

