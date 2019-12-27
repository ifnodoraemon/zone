package com.ifnodoraemon.zone.model;

/**
 * @author ifnodoraemon
 */
public class UserVO {
    private String id;
    private String username;
    private String email;

    @Override
    public String toString() {
        return "UserVO{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
