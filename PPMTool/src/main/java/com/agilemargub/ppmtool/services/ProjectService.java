package com.agilemargub.ppmtool.services;

import com.agilemargub.ppmtool.domain.Project;
import com.agilemargub.ppmtool.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project) {
        //TODO: more logic
        return projectRepository.save(project);
    }
}
