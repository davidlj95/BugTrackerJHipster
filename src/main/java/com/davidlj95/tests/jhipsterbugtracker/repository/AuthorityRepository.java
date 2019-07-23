package com.davidlj95.tests.jhipsterbugtracker.repository;

import com.davidlj95.tests.jhipsterbugtracker.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
