package com.projectauth.authify_app.repository;

import com.projectauth.authify_app.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity>findByEmail(String email);

    Boolean existsByEmail(String email);

}
