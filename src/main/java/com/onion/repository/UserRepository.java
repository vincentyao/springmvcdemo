package com.onion.repository;
import com.onion.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 161116 on 2017/6/26.
 */
public interface UserRepository extends JpaRepository<UserEntity,Integer>{
}
