package com.user.management.controller;

import com.user.management.service.RemoteUserService;
import com.user.management.user.User;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/proxy/users")
public class UserProxyController {
    private final RemoteUserService service;

    public UserProxyController(RemoteUserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> all() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    public User byId(@PathVariable String id) {
        return service.getById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public User create(@RequestBody User user) {
        System.out.println("Creating user: " + service.create(user));
        return service.create(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable String id, @RequestBody User user) {
        return service.update(id, user);
    }

    @PatchMapping("/{id}")
    public User patch(@PathVariable String id, @RequestBody User user) {
        return service.patch(id, user);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}