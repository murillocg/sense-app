package br.com.techfy.senseapp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.techfy.senseapp.domain.Event;
import br.com.techfy.senseapp.repository.EventRepository;

@SpringBootApplication
public class SenseAppApplication implements CommandLineRunner {

    @Autowired
    private EventRepository eventRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(SenseAppApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Event eventA = new Event();
        eventA.setName("Porto Imigração 14/07 - Duca Leindecker");
        eventA.setDescription("Sábado é na Imigração com Duca Leindecker!");
        eventA.setAttendingCount(504);
        eventA.setInterestedCount(2500);
        LocalDate tomorrow = LocalDate.of(2018, 07, 15);
        eventA.setStartTime(LocalDateTime.of(tomorrow, LocalTime.of(15, 00)));
        eventA.setEndTime(LocalDateTime.of(tomorrow, LocalTime.of(21, 00)));
        
        eventRepository.save(eventA);
        
    }
	
	
}
