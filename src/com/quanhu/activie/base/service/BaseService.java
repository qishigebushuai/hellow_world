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

	 void	insert(T	t)throws	Exception;
	
	 void	update(T	t)throws	Exception;
	
	 void	delete(Long	id)throws	Exception;
	
	 T		selectById(Long id);
	
	 List<T>	selectByIds(Long[] ids);
}
