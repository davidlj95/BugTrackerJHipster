package com.davidlj95.tests.jhipsterbugtracker.repository;

import com.davidlj95.tests.jhipsterbugtracker.domain.Project;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Project entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
