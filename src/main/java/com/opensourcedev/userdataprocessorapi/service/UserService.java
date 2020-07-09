package com.opensourcedev.userdataprocessorapi.service;

import com.opensourcedev.userdataprocessorapi.enums.SportType;
import com.opensourcedev.userdataprocessorapi.model.LocationInformation;
import com.opensourcedev.userdataprocessorapi.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService extends CRUDService{

    Mono<User> findUserByName(String name);
    Mono<User> findUserByUsernameAndAge(String username, Integer age);
    Flux<User> findAllByUsernameAndSportTypeAndLocationInformation(String username,
                                                                   SportType sportType,
                                                                   LocationInformation locationInformation);
}
