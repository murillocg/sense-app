package br.com.techfy.senseapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.techfy.senseapp.domain.Event;

@Repository
public interface EventRepository extends MongoRepository<Event, String> {

}
