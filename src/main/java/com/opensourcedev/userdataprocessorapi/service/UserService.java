package com.opensourcedev.userdataprocessorapi.service;

import com.opensourcedev.userdataprocessorapi.model.User;
import reactor.core.publisher.Mono;

public interface UserService extends CRUDService{

    Mono<User> findUserByName(String name);
}
