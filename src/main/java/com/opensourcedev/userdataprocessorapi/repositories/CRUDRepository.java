package com.opensourcedev.userdataprocessorapi.repositories;

import com.opensourcedev.userdataprocessorapi.model.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CRUDRepository {

    Flux<User> getUsers();

    Mono<User> findById(String id);

    Mono<User> save(User user);

    void deleteById(String idToDelete);
}
