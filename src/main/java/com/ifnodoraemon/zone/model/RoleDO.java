package com.ifnodoraemon.zone.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Objects;

public class RoleDO implements GrantedAuthority {
    private Long id;
    private String name;


    @Override
    public String getAuthority() {
        return getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleDO roleDO = (RoleDO) o;
        return id.equals(roleDO.id) &&
                name.equals(roleDO.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "RoleDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
