package com.opensourcedev.userdataprocessorapi.model;

import com.opensourcedev.userdataprocessorapi.enums.SportType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

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

    @NotBlank(message = "id is mandatory field")
    String publicId;

    @NotBlank(message = "username  is mandatory field")
    @Size(min = 5, max = 20)
    String username;

    @NotBlank(message = "name of the user is mandatory")
    @Size(min = 3, max = 20)
    String name;

    @NotBlank(message = "surname of the user is mandatory")
    @Size(min = 3, max = 20)
    String surname;

    @Min(15)
    Integer age;

    @Min(120)
    Long height;

    @Min(35)
    Long weight;

    SportType sportType;
    LocationInformation locationInformation;

}
