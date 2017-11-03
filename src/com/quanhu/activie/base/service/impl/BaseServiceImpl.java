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
	
	public abstract	BaseDao<T>	getBaseDao();
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public void	insert(T	t)throws	Exception{
		getBaseDao().insert(t);
	};
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public void	update(T	t)throws	Exception{
		getBaseDao().update(t);
	};
	
	@Transactional(propagation=Propagation.SUPPORTS)
	public void	delete(Long	id)throws	Exception{
		getBaseDao().delete(id);
	};
	
	@Transactional(readOnly=true)
	public T		selectById(Long id){
		return	getBaseDao().selectById(id);
	};
	
	@Transactional(readOnly=true)
	public List<T>	selectByIds(Long[] ids){
		return	getBaseDao().selectByIds(ids);
	};
	
	
}
