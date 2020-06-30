package com.opensourcedev.userdataprocessorapi.service;

import com.opensourcedev.userdataprocessorapi.model.User;
import com.opensourcedev.userdataprocessorapi.repositories.CRUDRepository;
import com.opensourcedev.userdataprocessorapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class UserRepositoryImpl implements CRUDRepository {

    UserRepository userRepository;


    @Override
    public Flux<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public Mono<User> findById(String id) {
        return userRepository.findById(id);
    }

    public Mono<User> findUserByName(String name){
        return userRepository.findUserByName(name);
    }

    @Override
    public Mono<User> save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(String idToDelete) {
        userRepository.deleteById(idToDelete);
    }





    public UserRepository getUserRepository() {
        return userRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String toString() {
        return "UserRepositoryImpl{" +
                "userRepository=" + userRepository +
                '}';
    }
}
