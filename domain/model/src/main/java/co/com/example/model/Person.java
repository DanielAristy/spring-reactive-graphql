package co.com.example.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Person {
    public  String id;
    private String name;
    private String lastName;
    private Integer age;
}
