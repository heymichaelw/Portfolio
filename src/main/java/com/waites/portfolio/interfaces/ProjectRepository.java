package com.waites.portfolio.interfaces;

import com.waites.portfolio.models.Project;

import java.util.List;

public interface ProjectRepository {
    List<Project> findAll();
}
