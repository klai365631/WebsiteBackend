package team.skyprojava.websitebackend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import team.skyprojava.websitebackend.entity.User;

import java.util.Optional;

/**
 * Repository UserRepository (users/пользователь).
 */

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);

}
