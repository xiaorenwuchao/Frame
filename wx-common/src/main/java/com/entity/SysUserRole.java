package com.entity;

import com.base.BaseEntity;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SysUserRole extends BaseEntity {
    @XStreamAlias("sysUserId")
    private String sysUserId;

    @XStreamAlias("sysRoleId")
    private String sysRoleId;

    @XStreamAlias("serialVersionUID")
    private static final long serialVersionUID = 1L;

    public String getSysUserId() {
        return sysUserId;
    }

    public void setSysUserId(String sysUserId) {
        this.sysUserId = sysUserId;
    }

    public String getSysRoleId() {
        return sysRoleId;
    }

    public void setSysRoleId(String sysRoleId) {
        this.sysRoleId = sysRoleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("id = ").append(id);
        sb.append(", sysUserId=").append(sysUserId);
        sb.append(", sysRoleId=").append(sysRoleId);
        sb.append("]");
        return sb.toString();
    }
}