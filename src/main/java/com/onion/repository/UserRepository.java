package com.onion.repository;

import com.onion.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by 161116 on 2017/6/26.
 */

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer>{
    @Modifying
    @Transactional

    @Query("update UserEntity us set us.nickname=:qNickname,us.firstName=:qFirstName, us.lastName=:qLastName, us.password=:qPassword where us.id=:qId")
    public void updateUser( @Param("qNickname") String nickname,@Param("qFirstName") String firstName,
                           @Param("qLastName") String LastName, @Param("qPassword") String password, @Param("qId") int id);
}

