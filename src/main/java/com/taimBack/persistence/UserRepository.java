package com.taimBack.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.taimBack.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	List<User> findAll();

	@Query("SELECT u FROM User u WHERE u.userName=:username")
	User findByUserName(String username);

}
