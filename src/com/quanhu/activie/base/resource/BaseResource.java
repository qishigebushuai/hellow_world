/**
 * 
 */
package com.quanhu.activie.base.resource;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import com.quanhu.activie.base.service.BaseService;

/**
 * created by chenshi at 2017年10月29日 下午12:42:14
 */
@SuppressWarnings("serial")
public abstract class BaseResource<T> implements Serializable {
	public	abstract	BaseService<T>	getService();
	
	@RequestMapping("base/insert")
	public	void	insert(T t)throws	Exception{
		try {
			getService().insert(t);
		} catch (Exception e) {
			System.out.println("base/insert基类新增接口出现异常!");
			e.printStackTrace();
		}
	}
	
	@RequestMapping("base/update")
	public	void	update(T t)throws	Exception{
		try {
			getService().update(t);
		} catch (Exception e) {
			System.out.println("base/update基类修改接口出现异常!");
			e.printStackTrace();
		}
	}
	
	@RequestMapping("base/delete")
	public	void	delete(Long	id)throws	Exception{
		try {
			getService().delete(id);
		} catch (Exception e) {
			System.out.println("base/delete基类删除接口出现异常!");
			e.printStackTrace();
		}
	}
	
	@RequestMapping("base/selectById")
	public	T	selectById(Long	id)throws	Exception{
		T selectById=null;
		try {
			selectById = getService().selectById(id);
		} catch (Exception e) {
			System.out.println("base/selectById基类查详情接口出现异常!");
			e.printStackTrace();
		}
		return	selectById;
	}
	
	@RequestMapping("base/selectByIds")
	public	List<T>	selectByIds(Long[]	ids)throws	Exception{
		List<T> selectByIds=null;
		try {
			selectByIds = getService().selectByIds(ids); 
		} catch (Exception e) {
			System.out.println("base/selectByIds基类接口出现异常!");
			e.printStackTrace();
		}
		return	selectByIds;
	}
	
	
	
}
