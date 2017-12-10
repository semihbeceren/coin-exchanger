package com.coin.exchanger.authservice.api;

import com.coin.exchanger.authservice.user.User;

import java.util.Optional;

/**
 * @author Semih Beceren
 */
public interface UserService {
    Optional<User> findByUsername(String username);
}
