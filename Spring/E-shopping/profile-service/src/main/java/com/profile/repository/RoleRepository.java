package com.profile.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.profile.document.ERole;
import com.profile.document.Role;

@Repository
public interface RoleRepository extends MongoRepository<Role, String> 
{
	  Optional<Role> findByName(ERole name);
}
