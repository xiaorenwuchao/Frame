package com.base;

import java.io.InputStream;
import java.io.Serializable;
import java.io.Writer;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

/**
 * @项目名称：common
 * @类名称：BaseEntity
 * @类描述： 所有实体类的父类。可将公共的属性所有类序列化集中在此类中
 * @创建人：YangChao
 * @联系方式：18629233301@163.com
 * @创建时间：2016年12月1日 下午5:14:42
 * @version 1.0.0
 */
public abstract class BaseEntity implements Serializable {
	public static final long serialVersionUID = 1L;

	public Integer id;
	/**
	 * 扩展xstream，使其支持CDATA块
	 * 
	 * @date 2013-05-19
	 */
	private XStream xstream = new XStream(new XppDriver() {
		public HierarchicalStreamWriter createWriter(Writer out) {
			return new PrettyPrintWriter(out) {
				// 对所有xml节点的转换都增加CDATA标记
				boolean cdata = true;

				public void startNode(String name, @SuppressWarnings("rawtypes") Class clazz) {
					super.startNode(name, clazz);
				}

				protected void writeText(QuickWriter writer, String text) {
					if (cdata) {
						writer.write("<![CDATA[");
						writer.write(text);
						writer.write("]]>");
					} else {
						writer.write(text);
					}
				}
			};
		}
	});

	/**
	 * 
	 * @Title: getXML
	 * @Description: 对象转换成xml
	 * @return
	 * @author YangChao
	 * @date 2016年12月3日 上午10:08:01
	 */
	public String getXML() {
		xstream.alias("xml", this.getClass());
		xstream.processAnnotations(this.getClass()); // 通过注解方式的，一定要有这句话
		return xstream.toXML(this);
	}

	/**
	 * 
	 * @Title: toBean
	 * @Description: 将传入xml文本转换成Java对象
	 * @param xmlStr
	 * @return
	 * @author YangChao
	 * @date 2016年12月3日 下午7:03:33
	 */
	public BaseEntity toBean(String xmlStr) {
		xstream.alias("xml", this.getClass());
		xstream.processAnnotations(this.getClass()); // 通过注解方式的，一定要有这句话
		return (BaseEntity) xstream.fromXML(xmlStr);
	}

	/**
	 * 
	 * @Title: toBean
	 * @Description: 转换成Java对象
	 * @param is
	 * @return
	 * @author YangChao
	 * @date 2016年12月3日 下午7:29:56
	 */
	public BaseEntity toBean(InputStream is) {
		xstream.alias("xml", this.getClass());
		xstream.processAnnotations(this.getClass()); // 通过注解方式的，一定要有这句话
		return (BaseEntity) xstream.fromXML(is);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public XStream getXstream() {
		return xstream;
	}

}
