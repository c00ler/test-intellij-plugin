package com.github.c00ler.testintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.c00ler.testintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
