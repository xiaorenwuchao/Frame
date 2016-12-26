package com.entity;

import com.base.BaseEntity;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SysRolePermission extends BaseEntity {
    @XStreamAlias("sysRoleId")
    private String sysRoleId;

    @XStreamAlias("sysPermissionId")
    private String sysPermissionId;

    @XStreamAlias("serialVersionUID")
    private static final long serialVersionUID = 1L;

    public String getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(String sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    public String getSysPermissionId() {
        return sysPermissionId;
    }

    public void setSysPermissionId(String sysPermissionId) {
        this.sysPermissionId = sysPermissionId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("id = ").append(id);
        sb.append(", sysRoleId=").append(sysRoleId);
        sb.append(", sysPermissionId=").append(sysPermissionId);
        sb.append("]");
        return sb.toString();
    }
}