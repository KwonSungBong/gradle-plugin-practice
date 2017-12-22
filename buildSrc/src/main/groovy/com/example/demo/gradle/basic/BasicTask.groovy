package com.example.demo.gradle.basic

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

/**
 * Created by ksb on 2017. 12. 22..
 */
class BasicTask extends DefaultTask {

    @TaskAction
    def taskAction() {
        println "basic task"
//        println project.buildSrcPluginExtension.message
    }

}
