package com.opensourcedev.userdataprocessorapi.repositories;

import com.opensourcedev.userdataprocessorapi.enums.SportType;
import com.opensourcedev.userdataprocessorapi.model.LocationInformation;
import com.opensourcedev.userdataprocessorapi.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {

    Mono<User> findUserByName(String name);
    Mono<User> findUserByUsernameAndAge(String username, Integer age);
    Flux<User> findAllByUsernameAndSportTypeAndLocationInformation(String username,
                                                                   SportType sportType,
                                                                   LocationInformation locationInformation);

}
