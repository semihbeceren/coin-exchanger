package com.coin.exchanger.authservice.authority;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Semih Beceren
 */
@Repository
public interface AuthorityRepository extends CrudRepository<Authority, Long> {
    Authority findByAuthority(String authority);
}
