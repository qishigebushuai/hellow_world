/**
 * 
 */
package com.quanhu.activie.base.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * created by chenshi at 2017年10月29日 上午10:50:55
 */
public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = -5529596488497998577L;
	
	private	Long	id;
	
	private	String	createUserId;
	
	private	String	lastUpdateUserId;
	
	private	Date	createDate;
	
	private	Date	lastUpdateDate;
	
	private	Byte	revison;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId.trim();
	}

	public String getLastUpdateUserId() {
		return lastUpdateUserId;
	}

	public void setLastUpdateUserId(String lastUpdateUserId) {
		this.lastUpdateUserId = lastUpdateUserId.trim();
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Byte getRevison() {
		return revison;
	}

	public void setRevison(Byte revison) {
		this.revison = revison;
	}
	
}
