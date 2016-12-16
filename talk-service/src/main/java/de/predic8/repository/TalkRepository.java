package de.predic8.repository;

import de.predic8.domain.Talk;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
public interface TalkRepository extends JpaRepository<Talk, Long> {
}