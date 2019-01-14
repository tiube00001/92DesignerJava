package com.designer_two.entity;

import com.designer_two.embeddable.AdminRoleUsersPrimaryKey;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "admin_role_users", schema = "92sj", catalog = "")
public class AdminRoleUsersEntity {

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private AdminRoleUsersPrimaryKey id;

    @Basic
    @EmbeddedId
    public AdminRoleUsersPrimaryKey getId() {
        return id;
    }

    public void setId(AdminRoleUsersPrimaryKey id) {
        this.id = id;
    }


    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at", nullable = true)
    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminRoleUsersEntity that = (AdminRoleUsersEntity) o;
        return Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, updatedAt, id);
    }

    @Override
    public String toString() {
        return "AdminRoleUsersEntity{" +
                "createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", id=" + id +
                '}';
    }
}
