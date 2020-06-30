package com.opensourcedev.userdataprocessorapi.repositories;

import com.opensourcedev.userdataprocessorapi.model.User;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveMongoRepository<User, String> {

    Mono<User> findUserByName(String name);
}
