package com.auth.JWT.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.JWT.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    /**
     * findByName method is used to retrieve a user by their username.
     * It returns an Optional of UserInfo, which will be empty if no user is found.
     */
    

	Optional<User> findByEmail(String username);
}
