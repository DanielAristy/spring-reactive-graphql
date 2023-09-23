package co.com.example.graphqlapi;

import co.com.example.model.Person;
import co.com.example.usecase.PersonUseCase;
import graphql.kickstart.tools.GraphQLMutationResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
public class ApiMutations implements GraphQLMutationResolver {

    private final PersonUseCase personUseCase;

    @MutationMapping
    public Mono<Person> createPerson(@Argument Person person) {
        return personUseCase.save(person);
    }
}