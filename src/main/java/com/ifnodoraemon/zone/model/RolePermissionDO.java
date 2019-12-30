package com.ifnodoraemon.zone.model;

import java.util.Objects;

public class RolePermissionDO {
    private String url;
    private String roleName;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RolePermissionDO that = (RolePermissionDO) o;
        return Objects.equals(url, that.url) &&
                Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, roleName);
    }

    @Override
    public String toString() {
        return "RolePermissionDO{" +
                "url='" + url + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
