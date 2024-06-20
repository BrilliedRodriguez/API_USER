package com.api.crud.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.api.crud.models.UserModel;

@Service
@Repository

public interface IUserRepository extends JpaRepository<UserModel, Long> {

public static final IUserRepository userRepository = null;

ArrayList<UserModel> findAll();

@SuppressWarnings("unchecked")
UserModel save(UserModel user);

Optional<UserModel> findById(Long id);

}
