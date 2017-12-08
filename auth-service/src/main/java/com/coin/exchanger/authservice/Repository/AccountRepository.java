package com.coin.exchanger.authservice.Repository;

import com.coin.exchanger.authservice.Domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Created By Semih Beceren at 08-Dec-17
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByUserName(String userName);

}
