package com.onion.model;

import javax.persistence.*;

/**
 * Created by 161116 on 2017/6/29.
 */
@Entity
@Table(name = "register_user", schema = "springdemo", catalog = "")
public class RegisterUserEntity {
    private Integer id;
    private String loginName;
    private String passWord;

    @Id
    @Basic
    @Column(name = "id", nullable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "loginName", nullable = false, length = 32)
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "passWord", nullable = false, length = 32)
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RegisterUserEntity that = (RegisterUserEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (loginName != null ? !loginName.equals(that.loginName) : that.loginName != null) return false;
        if (passWord != null ? !passWord.equals(that.passWord) : that.passWord != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (loginName != null ? loginName.hashCode() : 0);
        result = 31 * result + (passWord != null ? passWord.hashCode() : 0);
        return result;
    }
}
