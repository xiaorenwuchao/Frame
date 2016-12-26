package com.entity;

import com.base.BaseEntity;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SysUser extends BaseEntity {
    @XStreamAlias("usercode")
    private String usercode;

    @XStreamAlias("username")
    private String username;

    @XStreamAlias("password")
    private String password;

    @XStreamAlias("salt")
    private String salt;

    @XStreamAlias("locked")
    private String locked;

    @XStreamAlias("serialVersionUID")
    private static final long serialVersionUID = 1L;

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getLocked() {
        return locked;
    }

    public void setLocked(String locked) {
        this.locked = locked;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("id = ").append(id);
        sb.append(", usercode=").append(usercode);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", locked=").append(locked);
        sb.append("]");
        return sb.toString();
    }
}