# asyncapiFromJava

This is just a small demo project that shows the usage of asyncapi-plugin-maven/

https://github.com/Pakisan/jasyncapi/tree/master/asyncapi-plugin/asyncapi-plugin-maven

which leads in version 1.0.0-EAP-1 to following Exception:

    org.apache.maven.lifecycle.LifecycleExecutionException: Failed to execute goal com.asyncapi:asyncapi-maven-plugin:1.0.0-EAP-1:generate (default) on project asyncapiFromJava: Can't generate schema: Can't load class: de.sidion.aim.asyncapi.StreetlightsAsyncAPI
       at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:215)
       at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
    ...
    Caused by: com.asyncapi.plugin.core.generator.exception.AsyncAPISchemaGenerationException: Can't load class: de.sidion.aim.asyncapi.StreetlightsAsyncAPI
        at com.asyncapi.plugin.core.io.AsyncAPISchemaLoader.loadClasses (AsyncAPISchemaLoader.kt:64)
        at com.asyncapi.plugin.core.io.AsyncAPISchemaLoader.load (AsyncAPISchemaLoader.kt:37)
        at com.asyncapi.plugin.core.generator.strategy.JsonGenerationStrategy.generate (JsonGenerationStrategy.kt:37)
        at com.asyncapi.plugin.core.AsyncAPISchemaGenerator.generate (AsyncAPISchemaGenerator.kt:66)
        at com.asyncapi.plugin.maven.SchemaGeneratorMojo.execute (SchemaGeneratorMojo.kt:77)
        at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo (DefaultBuildPluginManager.java:137)
        at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:210)
        at org.apache.maven.lifecycle.internal.MojoExecutor.execute (MojoExecutor.java:156)
        ...
    Caused by: java.lang.ClassNotFoundException: de.sidion.aim.asyncapi.StreetlightsAsyncAPI
        at java.net.URLClassLoader.findClass (URLClassLoader.java:433)
        at java.lang.ClassLoader.loadClass (ClassLoader.java:586)
