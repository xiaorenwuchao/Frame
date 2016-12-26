package com.entity;

import com.base.BaseEntity;
import com.thoughtworks.xstream.annotations.XStreamAlias;

public class WxClientMessage extends BaseEntity {
	@XStreamAlias("ToUserName")
	private String toUserName;

	@XStreamAlias("FromUserName")
	private String fromUserName;

	@XStreamAlias("CreateTime")
	private String createTime;

	@XStreamAlias("MsgType")
	private String msgType;

	@XStreamAlias("Content")
	private String content;

	@XStreamAlias("MsgId")
	private String msgId;

	@XStreamAlias("PicUrl")
	private String picUrl;

	@XStreamAlias("MediaId")
	private String mediaId;

	@XStreamAlias("Format")
	private String format;

	@XStreamAlias("ThumbMediaId")
	private String thumbMediaId;

	@XStreamAlias("Location_X")
	private String locationX;

	@XStreamAlias("Location_Y")
	private String locationY;

	@XStreamAlias("Scale")
	private String scale;

	@XStreamAlias("Label")
	private String label;

	@XStreamAlias("Title")
	private String title;

	@XStreamAlias("Description")
	private String description;

	@XStreamAlias("Url")
	private String url;

	@XStreamAlias("serialVersionUID")
	private static final long serialVersionUID = 1L;

	public WxClientMessage() {
		super();
	}

	public WxClientMessage(String toUserName, String fromUserName, String createTime, String msgType, String content,
			String msgId, String picUrl, String mediaId, String format, String thumbMediaId, String locationX,
			String locationY, String scale, String label, String title, String description, String url) {
		super();
		this.toUserName = toUserName;
		this.fromUserName = fromUserName;
		this.createTime = createTime;
		this.msgType = msgType;
		this.content = content;
		this.msgId = msgId;
		this.picUrl = picUrl;
		this.mediaId = mediaId;
		this.format = format;
		this.thumbMediaId = thumbMediaId;
		this.locationX = locationX;
		this.locationY = locationY;
		this.scale = scale;
		this.label = label;
		this.title = title;
		this.description = description;
		this.url = url;
	}

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getThumbMediaId() {
		return thumbMediaId;
	}

	public void setThumbMediaId(String thumbMediaId) {
		this.thumbMediaId = thumbMediaId;
	}

	public String getLocationX() {
		return locationX;
	}

	public void setLocationX(String locationX) {
		this.locationX = locationX;
	}

	public String getLocationY() {
		return locationY;
	}

	public void setLocationY(String locationY) {
		this.locationY = locationY;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("id = ").append(id);
		sb.append(", toUserName=").append(toUserName);
		sb.append(", fromUserName=").append(fromUserName);
		sb.append(", createTime=").append(createTime);
		sb.append(", msgType=").append(msgType);
		sb.append(", content=").append(content);
		sb.append(", msgId=").append(msgId);
		sb.append(", picUrl=").append(picUrl);
		sb.append(", mediaId=").append(mediaId);
		sb.append(", format=").append(format);
		sb.append(", thumbMediaId=").append(thumbMediaId);
		sb.append(", locationX=").append(locationX);
		sb.append(", locationY=").append(locationY);
		sb.append(", scale=").append(scale);
		sb.append(", label=").append(label);
		sb.append(", title=").append(title);
		sb.append(", description=").append(description);
		sb.append(", url=").append(url);
		sb.append("]");
		return sb.toString();
	}
}