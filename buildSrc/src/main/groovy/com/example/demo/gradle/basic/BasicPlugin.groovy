package com.example.demo.gradle.basic

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by ksb on 2017. 12. 22..
 */
class BasicPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.extensions.add("basic", BasicPluginExtension)

        project.task("basicTask", type: BasicTask) {
            group = "Custom Plugins"
            description = "Prints a message."
        }

    }

}
