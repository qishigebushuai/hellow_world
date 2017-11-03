/**
 * 
 */
package com.quanhu.activie.base.service;

import java.io.Serializable;
import java.util.List;

import com.quanhu.activie.base.dao.BaseDao;

/**
 * created by chenshi at 2017年10月29日 下午12:23:53
 */
public abstract interface BaseService<T> extends Serializable {

	abstract	BaseDao<T>	getBaseDao();
	
	abstract void	insert(T	t)throws	Exception;
	
	abstract void	update(T	t)throws	Exception;
	
	abstract void	delete(Long	id)throws	Exception;
	
	abstract T		selectById(Long id);
	
	abstract List<T>	selectByIds(Long[] ids);
}
