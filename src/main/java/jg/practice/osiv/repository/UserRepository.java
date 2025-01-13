package jg.practice.osiv.repository;

import jg.practice.osiv.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
