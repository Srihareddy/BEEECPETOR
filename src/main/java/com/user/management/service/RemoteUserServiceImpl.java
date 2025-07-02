package com.user.management.service;

import com.user.management.user.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class RemoteUserServiceImpl implements RemoteUserService {

    private final RestTemplate restTemplate;
    private final String baseUrl;

    public RemoteUserServiceImpl(RestTemplate restTemplate,
                                 @Value("${external.api.base-url}") String baseUrl) {
        this.restTemplate = restTemplate;
        this.baseUrl = baseUrl;
    }

    @Override
    public List<User> getAll() {
        ResponseEntity<User[]> resp = restTemplate.getForEntity(baseUrl + "/", User[].class);
        return Arrays.asList(resp.getBody());
    }

    @Override
    public User getById(String id) {
        return restTemplate.getForObject(baseUrl + "/" + id, User.class);
    }

    @Override
    public User create(User user) {
        HttpEntity<User> req = new HttpEntity<>(user);
        ResponseEntity<User> resp = restTemplate.exchange(
                baseUrl + "/", HttpMethod.POST, req, User.class);
        return resp.getBody();
    }

    @Override
    public User update(String id, User user) {
        HttpEntity<User> req = new HttpEntity<>(user);
        ResponseEntity<User> resp = restTemplate.exchange(
                baseUrl + "/" + id, HttpMethod.PUT, req, User.class);
        return resp.getBody();
    }

    @Override
    public User patch(String id, User user) {
        HttpEntity<User> req = new HttpEntity<>(user);
        ResponseEntity<User> resp = restTemplate.exchange(
                baseUrl + "/" + id, HttpMethod.PATCH, req, User.class);
        return resp.getBody();
    }

    @Override
    public void delete(String id) {
        restTemplate.delete(baseUrl + "/" + id);
    }
}
