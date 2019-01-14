package com.designer_two.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AdminUserPermissionsPrimaryKey implements Serializable {

    @Column(name = "user_id")
    private int userId;

    @Column(name = "permission_id")
    private int permissionId;

    public AdminUserPermissionsPrimaryKey() { }

    public AdminUserPermissionsPrimaryKey(int userId, int permissionId) {
        this.userId = userId;
        this.permissionId = permissionId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public String toString() {
        return "AdminUserPermissionsPrimaryKey{" +
                "userId=" + userId +
                ", permissionId=" + permissionId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminUserPermissionsPrimaryKey that = (AdminUserPermissionsPrimaryKey) o;
        return userId == that.userId &&
                permissionId == that.permissionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, permissionId);
    }
}
