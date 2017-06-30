package com.onion.repository;

import com.onion.model.RegisterUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by 161116 on 2017/6/30.
 */
@Repository
public interface registerRepository extends JpaRepository<RegisterUserEntity,Integer> {
}
