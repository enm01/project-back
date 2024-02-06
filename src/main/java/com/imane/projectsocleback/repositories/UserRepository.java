package com.imane.projectsocleback.repositories;
import com.imane.projectsocleback.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}