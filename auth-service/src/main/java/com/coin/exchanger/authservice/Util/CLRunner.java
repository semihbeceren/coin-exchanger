package com.coin.exchanger.authservice.Util;

import com.coin.exchanger.authservice.Domain.Account;
import com.coin.exchanger.authservice.Repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class CLRunner implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private AccountRepository accountRepository;

    @Autowired
    public CLRunner(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        Stream.of(new Account("Semih", "Beceren", "semih", new BCryptPasswordEncoder().encode("123456")),
                new Account("Sedat", "Çamlı", "sedat", new BCryptPasswordEncoder().encode("123456")))
                .forEach(account -> accountRepository.save(account));

        accountRepository.findAll().forEach(account -> logger.info(account.toString()));
    }
}
