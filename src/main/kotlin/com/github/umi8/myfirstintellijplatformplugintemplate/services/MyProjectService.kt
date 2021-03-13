package com.github.umi8.myfirstintellijplatformplugintemplate.services

import com.github.umi8.myfirstintellijplatformplugintemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
