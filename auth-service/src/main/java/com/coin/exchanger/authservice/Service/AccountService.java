package com.coin.exchanger.authservice.Service;

/**
 * Created By Semih Beceren at 08-Dec-17
 */

import com.coin.exchanger.authservice.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements UserDetailsService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        return accountRepository.findByUserName(userName)
                .map(account -> new User(account.getName(), account.getPassword(), AuthorityUtils.createAuthorityList("ROLE_ADMION")))
                .orElseThrow(() -> new UsernameNotFoundException("Kullanıcı " + userName + " bulunamadı."));
    }
}
