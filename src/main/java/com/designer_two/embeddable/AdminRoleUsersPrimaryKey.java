package com.designer_two.embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AdminRoleUsersPrimaryKey implements Serializable {
    private int roleId;
    private int userId;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public AdminRoleUsersPrimaryKey() {
    }

    public AdminRoleUsersPrimaryKey(int roleId, int userId) {
        this.roleId = roleId;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "AdminRoleUsersPrimaryKey{" +
                "roleId=" + roleId +
                ", userId=" + userId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminRoleUsersPrimaryKey that = (AdminRoleUsersPrimaryKey) o;
        return roleId == that.roleId &&
                userId == that.userId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, userId);
    }
}
