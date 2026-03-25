package com.thucchien02.accountservice.repository;

import com.thucchien02.accountservice.data.Account;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AccountRepository extends ReactiveCrudRepository<Account,String> {
}
