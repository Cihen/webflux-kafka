package com.thucchien02.profileservice.repository;

import com.thucchien02.profileservice.data.Profile;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ProfileRepository extends ReactiveCrudRepository<Profile,Long> {
}
