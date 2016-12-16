package de.predic8.repository;

import de.predic8.domain.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
	Speaker findByAbbreviation(@Param("abbreviation") String abbreviation);
}
