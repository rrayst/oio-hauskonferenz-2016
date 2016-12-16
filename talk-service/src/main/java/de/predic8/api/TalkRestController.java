package de.predic8.api;

import de.predic8.dto.FullTalk;
import de.predic8.remote.SpeakerClient;
import de.predic8.repository.TalkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

/**
 * @author Oliver Weiler (weiler@predic8.de)
 */
@RestController
public class TalkRestController {
    @Autowired
    private TalkRepository talkRepository;
    @Autowired
    private SpeakerClient speakerClient;

    @GetMapping("/talks")
    public List<FullTalk> index() {
        return talkRepository
                .findAll()
                .stream()
                .map(t -> new FullTalk(
                        t.getTitle(),
                        t.getDate(),
                        t.getSpeakers()
                                .stream()
                                .map(speakerClient::findByAbbreviation)
                                .collect(toList())
                ))
                .collect(toList());
    }
}