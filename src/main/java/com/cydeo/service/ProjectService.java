package com.cydeo.service;

import com.cydeo.controller.ProjectController;
import com.cydeo.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO,String>{
    void complete(ProjectDTO project);
}
