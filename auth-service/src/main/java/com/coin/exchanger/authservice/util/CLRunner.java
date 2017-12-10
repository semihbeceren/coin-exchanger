package com.coin.exchanger.authservice.util;

import com.coin.exchanger.authservice.authority.Authority;
import com.coin.exchanger.authservice.authority.AuthorityRepository;
import com.coin.exchanger.authservice.user.User;
import com.coin.exchanger.authservice.user.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.stream.Stream;

/**
 * @author Semih Beceren
 */
@Component
@Profile("development")
public class CLRunner implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final UserRepository userRepository;
    private final AuthorityRepository authorityRepository;


    @Autowired
    public CLRunner(UserRepository userRepository, AuthorityRepository authorityRepository) {
        this.userRepository = userRepository;
        this.authorityRepository = authorityRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Authority authority = new Authority();
        authority.setAuthority("ROLE_ADMIN");
        authorityRepository.save(authority);

        Stream.of(new User("semih.beceren@hotmail.com", new BCryptPasswordEncoder().encode("123456"), "Semih", "Beceren", Collections.singleton(authority)),
                new User("sedat.camli@hotmail.com", new BCryptPasswordEncoder().encode("123456"), "Sedat", "Çamlı", Collections.singleton(authority)))
                .forEach(user -> logger.info(userRepository.save(user).toString()));
    }
}