package com.example.demo.gradle.greeting

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by ksb on 2017. 12. 22..
 */
class GreetingPlugin implements Plugin<Project> {

    void apply(Project project) {
        project.task('helloTask') {
            group = "Greeting Plugins"
            doLast {
                println "Hello from the GreetingPlugin"
            }
        }

        def extension = project.extensions.create('greeting', GreetingPluginExtension)
        project.task('helloMessageTask') {
            group = "Greeting Plugins"
            doLast {
                println "${extension.message} from ${extension.greeter}"
            }
        }
    }

}