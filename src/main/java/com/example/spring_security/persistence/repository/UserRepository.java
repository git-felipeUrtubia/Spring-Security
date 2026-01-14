package com.example.spring_security.persistence.repository;

import com.example.spring_security.persistence.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    // Forma 1
    Optional<UserEntity> findUserEntityByUsername(String username);

    // Forma 2
    @Query("SELECT u FROM UserEntity u WHERE u.username = ?1")
    Optional<UserEntity> findUser(String username);
}
