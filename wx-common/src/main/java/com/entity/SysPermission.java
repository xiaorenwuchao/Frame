package com.entity;

import com.base.BaseEntity;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class SysPermission extends BaseEntity {
    @XStreamAlias("id")
    private Long id;

    @XStreamAlias("name")
    private String name;

    @XStreamAlias("type")
    private String type;

    @XStreamAlias("url")
    private String url;

    @XStreamAlias("percode")
    private String percode;

    @XStreamAlias("parentid")
    private Long parentid;

    @XStreamAlias("parentids")
    private String parentids;

    @XStreamAlias("sortstring")
    private String sortstring;

    @XStreamAlias("available")
    private String available;

    @XStreamAlias("serialVersionUID")
    private static final long serialVersionUID = 1L;

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getParentids() {
        return parentids;
    }

    public void setParentids(String parentids) {
        this.parentids = parentids;
    }

    public String getSortstring() {
        return sortstring;
    }

    public void setSortstring(String sortstring) {
        this.sortstring = sortstring;
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
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", url=").append(url);
        sb.append(", percode=").append(percode);
        sb.append(", parentid=").append(parentid);
        sb.append(", parentids=").append(parentids);
        sb.append(", sortstring=").append(sortstring);
        sb.append(", available=").append(available);
        sb.append("]");
        return sb.toString();
    }
}