package co.com.example.graphqlapi;

import co.com.example.Person;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class ApiMutations implements GraphQLMutationResolver {

    @MutationMapping
    public Person createPerson(@Argument Person person) {
        return Person.builder()
                .id(UUID.randomUUID().toString())
                .name(person.getName())
                .lastName(person.getLastName())
                .age(person.getAge())
                .build();
    }
}