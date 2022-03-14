package com.github.whatskd.plugindemo.services

import com.intellij.openapi.project.Project
import com.github.whatskd.plugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
