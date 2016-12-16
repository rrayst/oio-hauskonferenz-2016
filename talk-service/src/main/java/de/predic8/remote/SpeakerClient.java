package de.predic8.remote;

import de.predic8.dto.Speaker;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@FeignClient(value = "speaker-service", fallback = SpeakerClientFallback.class)
public interface SpeakerClient {
    @RequestMapping(method = RequestMethod.GET, value = "/speakers/search/findByAbbreviation")
    Speaker findByAbbreviation(@RequestParam("abbreviation") String abbreviation);
}