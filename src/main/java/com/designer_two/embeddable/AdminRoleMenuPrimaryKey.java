package com.designer_two.embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class AdminRoleMenuPrimaryKey implements Serializable {
    private Integer roleId;
    private Integer menuId;

    public AdminRoleMenuPrimaryKey(Integer roleId) {
    }

    public AdminRoleMenuPrimaryKey(Integer roleId, Integer menuId) {
        this.roleId = roleId;
        this.menuId = menuId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminRoleMenuPrimaryKey that = (AdminRoleMenuPrimaryKey) o;
        return Objects.equals(roleId, that.roleId) &&
                Objects.equals(menuId, that.menuId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, menuId);
    }

    @Override
    public String toString() {
        return "AdminRoleMenuPrimaryKey{" +
                "roleId=" + roleId +
                ", menuId=" + menuId +
                '}';
    }
}
