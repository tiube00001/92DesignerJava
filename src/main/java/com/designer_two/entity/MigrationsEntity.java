package com.designer_two.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "migrations", schema = "92sj", catalog = "")
public class MigrationsEntity {
    private int id;
    private String migration;
    private int batch;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "migration", nullable = false, length = 255)
    public String getMigration() {
        return migration;
    }

    public void setMigration(String migration) {
        this.migration = migration;
    }

    @Basic
    @Column(name = "batch", nullable = false)
    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MigrationsEntity that = (MigrationsEntity) o;
        return id == that.id &&
                batch == that.batch &&
                Objects.equals(migration, that.migration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, migration, batch);
    }
}
