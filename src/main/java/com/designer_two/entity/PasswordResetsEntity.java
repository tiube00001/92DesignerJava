package com.designer_two.entity;

import com.designer_two.embeddable.PasswordResetsPrimaryKey;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "password_resets", schema = "92sj", catalog = "")
public class PasswordResetsEntity implements Serializable {

    private PasswordResetsPrimaryKey id;

    @Basic
    @Id
    public PasswordResetsPrimaryKey getId() {
        return id;
    }

    public void setId(PasswordResetsPrimaryKey id) {
        this.id = id;
    }

    private Timestamp createdAt;

    @Basic
    @Column(name = "created_at", nullable = true)
    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordResetsEntity that = (PasswordResetsEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdAt);
    }

    @Override
    public String toString() {
        return "PasswordResetsEntity{" +
                "id=" + id +
                ", createdAt=" + createdAt +
                '}';
    }
}
