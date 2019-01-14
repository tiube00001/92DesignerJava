package com.designer_two.embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class PasswordResetsPrimaryKey implements Serializable {

    @Column(name = "email")
    private String email;
    @Column(name = "token")
    private String token;

    public PasswordResetsPrimaryKey() {
    }

    public PasswordResetsPrimaryKey(String email, String token) {
        this.email = email;
        this.token = token;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordResetsPrimaryKey that = (PasswordResetsPrimaryKey) o;
        return Objects.equals(email, that.email) &&
                Objects.equals(token, that.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, token);
    }

    @Override
    public String toString() {
        return "PasswordResetsPrimaryKey{" +
                "email='" + email + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
