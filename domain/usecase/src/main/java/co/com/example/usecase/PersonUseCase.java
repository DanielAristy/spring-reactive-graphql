package co.com.example.usecase;

import co.com.example.model.Person;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RequiredArgsConstructor
public class PersonUseCase {

    public Mono<Person> save(Person person) {
        return Mono.just(Person.builder()
                .id(UUID.randomUUID().toString())
                .name(person.getName())
                .lastName(person.getLastName())
                .age(person.getAge())
                .build());
    }

    public Mono<Person> getPerson(String id) {
        return Mono.just(Person.builder()
                .id(id)
                .name("David")
                .lastName("Palacio")
                .age(20)
                .build());
    }
}
