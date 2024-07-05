package com.evilcorp.testcontainer.repository;

import com.evilcorp.testcontainer.entity.UserProfileEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserProfileRepository extends CrudRepository<UserProfileEntity, Long> {

}
