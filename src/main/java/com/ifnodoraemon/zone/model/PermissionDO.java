package com.ifnodoraemon.zone.model;

import java.util.Objects;

public class PermissionDO {
    private Long id;
    private String url;
    private String name;
    private String description;
    private Long pid;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PermissionDO that = (PermissionDO) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(url, that.url) &&
                Objects.equals(name, that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(pid, that.pid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, url, name, description, pid);
    }

    @Override
    public String toString() {
        return "PermissionDO{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", pid=" + pid +
                '}';
    }
}
