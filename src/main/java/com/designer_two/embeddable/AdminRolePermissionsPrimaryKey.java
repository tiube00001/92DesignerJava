package com.designer_two.embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AdminRolePermissionsPrimaryKey implements Serializable {
    private int roleId;
    private int permissionId;

    @Override
    public String toString() {
        return "AdminRolePermissionsPrimaryKey{" +
                "roleId=" + roleId +
                ", permissionId=" + permissionId +
                '}';
    }

    public AdminRolePermissionsPrimaryKey() {
    }

    public AdminRolePermissionsPrimaryKey(int roleId, int permissionId) {
        this.roleId = roleId;
        this.permissionId = permissionId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public int getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(int permissionId) {
        this.permissionId = permissionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminRolePermissionsPrimaryKey that = (AdminRolePermissionsPrimaryKey) o;
        return roleId == that.roleId &&
                permissionId == that.permissionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, permissionId);
    }
}
