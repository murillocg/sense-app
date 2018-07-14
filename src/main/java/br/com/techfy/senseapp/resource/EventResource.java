package br.com.techfy.senseapp.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.techfy.senseapp.domain.Event;
import br.com.techfy.senseapp.repository.EventRepository;

@RestController
@RequestMapping("/api")
public class EventResource {

    @Autowired
    private EventRepository eventRepository;
    
    @GetMapping("/events")
    public List<Event> getAll() {
        return eventRepository.findAll();
    }
    
}
