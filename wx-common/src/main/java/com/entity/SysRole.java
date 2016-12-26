package com.entity;

import com.base.BaseEntity;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SysRole extends BaseEntity {
    @XStreamAlias("name")
    private String name;

    @XStreamAlias("available")
    private String available;

    @XStreamAlias("serialVersionUID")
    private static final long serialVersionUID = 1L;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("id = ").append(id);
        sb.append(", name=").append(name);
        sb.append(", available=").append(available);
        sb.append("]");
        return sb.toString();
    }
}