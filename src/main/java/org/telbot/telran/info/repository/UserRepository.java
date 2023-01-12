package org.telbot.telran.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.telbot.telran.info.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}