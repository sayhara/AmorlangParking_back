package com.parkinglot.get;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    //Object findByService_id(String username);

    boolean existsByToken(String token);

    Object findByToken(String token);
}