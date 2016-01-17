package com.shildon.knight.transaction;

/**
 * 事务管理接口。
 * @author shildon<shildondu@gmail.com>
 * @date Jan 15, 2016 9:04:08 PM
 *
 */
public interface TransactionManager {
	
	// 开启事务
	public void begin();
	
	// 提交事务
	public void commit();
	
	// 回滚事务
	public void rollBack();

}