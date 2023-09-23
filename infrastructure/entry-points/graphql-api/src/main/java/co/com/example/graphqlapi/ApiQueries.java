package co.com.example.graphqlapi;

import co.com.example.model.Person;
import co.com.example.usecase.PersonUseCase;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
public class ApiQueries implements GraphQLQueryResolver {

    private final PersonUseCase personUseCase;

    @QueryMapping
    public Mono<Person> getPerson(@Argument String id) {
        return personUseCase.getPerson(id);
    }
}