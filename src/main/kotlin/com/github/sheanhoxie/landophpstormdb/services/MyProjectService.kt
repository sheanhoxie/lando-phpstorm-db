package com.github.sheanhoxie.landophpstormdb.services

import com.intellij.openapi.project.Project
import com.github.sheanhoxie.landophpstormdb.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
