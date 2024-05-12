package com.example.goc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.goc.Entity.Users;


public interface UserRepository extends JpaRepository<Users, Long> {
}
