package scot.carricksoftware.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scot.carricksoftware.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
