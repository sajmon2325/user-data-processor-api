package com.opensourcedev.userdataprocessorapi.controller;

import com.opensourcedev.userdataprocessorapi.enums.SportType;
import com.opensourcedev.userdataprocessorapi.model.LocationInformation;
import com.opensourcedev.userdataprocessorapi.model.User;
import com.opensourcedev.userdataprocessorapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.net.URI;

@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;
    private static final String rootURL = "http://localhost:8080/user/";

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Flux<User>> getAllUsers(){
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(userService.getUsers());
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Mono<User>> getUserById(@PathVariable String id){
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(userService.findById(id));
    }

    @GetMapping(value = "/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Mono<User>> getUserByName(@PathVariable String name){
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(userService.findUserByName(name));
    }

    @GetMapping(value = "/{username}/{age}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Mono<User>> getUserByUsernameAndAge(@PathVariable String username, @PathVariable int age){
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
                .body(userService.findUserByUsernameAndAge(username, age));
    }

    @GetMapping(value = "/{username}/{sportType}/{locationInformation}")
    public ResponseEntity<Flux<User>> getUserByUsernameAndSportTypeAndLocation(@PathVariable String username,
                                                                               @PathVariable SportType sportType,
                                                                               @PathVariable LocationInformation locationInformation){
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON)
                .body(userService.findAllByUsernameAndSportTypeAndLocationInformation(username, sportType, locationInformation));
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveUser(@RequestBody @Validated User user){
        userService.save(user);
        URI uri = URI.create(rootURL + user.getPublicId());
        return ResponseEntity.created(uri).body(HttpStatus.CREATED + "User has been saved!");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUserById(@PathVariable String id){
        userService.deleteById(id);
        return ResponseEntity.ok().body(HttpStatus.NO_CONTENT + "User was deleted!");
    }
}
