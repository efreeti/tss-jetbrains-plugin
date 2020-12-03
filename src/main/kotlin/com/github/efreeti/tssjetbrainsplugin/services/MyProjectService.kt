package com.github.efreeti.tssjetbrainsplugin.services

import com.intellij.openapi.project.Project
import com.github.efreeti.tssjetbrainsplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
