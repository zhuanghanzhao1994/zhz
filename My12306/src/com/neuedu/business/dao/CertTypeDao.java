package com.neuedu.business.dao;

import java.sql.SQLException;
import java.util.List;

import com.neuedu.domain.CertType;

/**
 * 证件类型表操作接口
 * @author Administrator
 *
 */
public interface CertTypeDao {
	/**
	 * 获取所有证件类型列表
	 * @return 证件类型列表
	 * @throws SQLException
	 */
	List<CertType> getCertTypeList() throws SQLException;
}
