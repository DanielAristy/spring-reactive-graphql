package co.com.example.graphqlapi;

import co.com.example.Person;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ApiQueries implements GraphQLQueryResolver {

    @QueryMapping
    public Person getPerson(@Argument String id) {
        return Person.builder()
                .id(id)
                .name("Daniel")
                .lastName("Aristy")
                .age(22)
                .build();
    }
}