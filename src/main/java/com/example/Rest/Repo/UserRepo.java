package com.example.Rest.Repo;

import com.example.Rest.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository <User, Long>  {
}
