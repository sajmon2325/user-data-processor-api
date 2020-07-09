package com.opensourcedev.userdataprocessorapi.model;

import com.opensourcedev.userdataprocessorapi.enums.SportType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class User {

    @Id
    String id;
    String username;
    String name;
    String surname;
    Integer age;
    Long height;
    Long weight;
    SportType sportType;
    LocationInformation locationInformation;

}
