package de.predic8.remote;

import de.predic8.dto.Speaker;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@Component
public class SpeakerClientFallback implements SpeakerClient {
    @Override
    public Speaker findByAbbreviation(@RequestParam("abbreviation") String abbreviation) {
        return new Speaker("n/a", "n/a");
    }
}
