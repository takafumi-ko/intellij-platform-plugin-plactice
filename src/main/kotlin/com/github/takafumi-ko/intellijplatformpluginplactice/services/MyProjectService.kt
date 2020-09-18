package com.github.takafumi-ko.intellijplatformpluginplactice.services

import com.intellij.openapi.project.Project
import com.github.takafumi-ko.intellijplatformpluginplactice.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
