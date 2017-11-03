/**
 * 
 */
package com.quanhu.activie.base.service.impl;

import java.util.List;

import com.quanhu.activie.base.dao.BaseDao;
import com.quanhu.activie.base.service.BaseService;

/**
 * created by chenshi at 2017年10月29日 下午12:26:05
 */
@SuppressWarnings("serial")
public abstract class BaseServiceImpl<T>	implements	BaseService<T> {
	
	public BaseDao<T>	getBaseDao(){
		return	null;
	};
	
	public void	insert(T	t)throws	Exception{
		getBaseDao().insert(t);
	};
	
	public void	update(T	t)throws	Exception{
		getBaseDao().update(t);
	};
	
	public void	delete(Long	id)throws	Exception{
		getBaseDao().delete(id);
	};
	
	public T		selectById(Long id){
		return	getBaseDao().selectById(id);
	};
	
	public List<T>	selectByIds(Long[] ids){
		return	getBaseDao().selectByIds(ids);
	};
	
	
}
