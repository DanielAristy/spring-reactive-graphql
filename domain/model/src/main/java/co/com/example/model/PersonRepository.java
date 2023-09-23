package co.com.example.model;

import reactor.core.publisher.Mono;

public interface PersonRepository {
    Mono<Person> create(Person person);
    Mono<Person> getPerson(String id);
}
