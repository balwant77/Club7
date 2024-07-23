package com.Club7.Repository;

import com.Club7.Entity.UserRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserRegistration,Long> {
}
