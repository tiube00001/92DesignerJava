package com.designer_two.entity;

import com.designer_two.embeddable.AdminUserPermissionsPrimaryKey;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "admin_user_permissions", schema = "92sj", catalog = "")
public class AdminUserPermissionsEntity {

    private Timestamp createdAt;
    private Timestamp updatedAt;

    private AdminUserPermissionsPrimaryKey id;

    @Basic
    @EmbeddedId
    public AdminUserPermissionsPrimaryKey getId() {
        return id;
    }

    public void setId(AdminUserPermissionsPrimaryKey id) {
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
        if (!super.equals(o)) return false;
        AdminUserPermissionsEntity that = (AdminUserPermissionsEntity) o;
        return createdAt.equals(that.createdAt) &&
                updatedAt.equals(that.updatedAt) &&
                id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), createdAt, updatedAt, id);
    }

    @Override
    public String toString() {
        return "AdminUserPermissionsEntity{" +
                "createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", id=" + id +
                '}';
    }
}
