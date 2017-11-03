/**
 * 
 */
package com.quanhu.activie.base.dao;

import java.io.Serializable;
import java.util.List;

/**
 * created by chenshi at 2017年10月29日 上午11:03:31
 */
public abstract interface BaseDao<T	> extends Serializable {
	
	abstract void	insert(T	t)throws	Exception;
	
	abstract void	update(T	t)throws	Exception;
	
	abstract void	delete(Long	id)throws	Exception;
	
	abstract T		selectById(Long id);
	
	abstract List<T>	selectByIds(Long[] ids);
	
}
