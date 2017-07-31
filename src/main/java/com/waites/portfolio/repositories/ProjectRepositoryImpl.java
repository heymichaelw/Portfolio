package com.waites.portfolio.repositories;

import com.waites.portfolio.interfaces.ProjectRepository;
import com.waites.portfolio.models.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Project> findAll(){
        return jdbcTemplate.query("SELECT * FROM portfolio", new ProjectMapper());
    }

    private static class ProjectMapper implements RowMapper<Project> {

        @Override
        public Project mapRow(ResultSet resultSet, int i) throws SQLException {
            Project project = new Project(resultSet.getInt("id"),
                    resultSet.getString("title"),
                    resultSet.getString("description"),
                    resultSet.getString("language"),
                    resultSet.getString("imageURL"),
                    resultSet.getString("repoURL"));
            return project;
        }
    }

}
