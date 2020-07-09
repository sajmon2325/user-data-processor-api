package com.opensourcedev.userdataprocessorapi.service;

import com.opensourcedev.userdataprocessorapi.enums.SportType;
import com.opensourcedev.userdataprocessorapi.model.LocationInformation;
import com.opensourcedev.userdataprocessorapi.model.User;
import com.opensourcedev.userdataprocessorapi.repositories.UserRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Getter
@Setter
@Service
public class UserRepositoryImpl implements UserService {

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
    public Mono<User> findUserByUsernameAndAge(String username, Integer age) {
        return userRepository.findUserByUsernameAndAge(username, age);
    }

    @Override
    public Flux<User> findAllByUsernameAndSportTypeAndLocationInformation(String username,
                                                                          SportType sportType,
                                                                          LocationInformation locationInformation) {
        return userRepository
                .findAllByUsernameAndSportTypeAndLocationInformation(username, sportType,locationInformation);
    }

    @Override
    public Mono<User> save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteById(String idToDelete) {
        userRepository.deleteById(idToDelete);
    }





    @Override
    public String toString() {
        return "UserRepositoryImpl{" +
                "userRepository=" + userRepository +
                '}';
    }
}
