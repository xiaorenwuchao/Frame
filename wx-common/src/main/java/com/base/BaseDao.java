package com.base;

import java.util.List;

/**
 * @项目名称：common
 * @类名称：BaseDao
 * @类描述： 基础DAO
 * @创建人：YangChao
 * @联系方式：18629233301@163.com
 * @创建时间：2016年12月1日 下午5:13:37
 * @version 1.0.0
 */
public interface BaseDao<T> {
	public T selectByPrimaryKey(Integer id);

	public int deleteByPrimaryKey(Integer id);

	public int insertSelective(T t);

	public int updateByPrimaryKeySelective(T t);

	public List<T> getList(T t);

	public int getCountSelective(T t);
}
