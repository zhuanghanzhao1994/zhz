package com.neuedu.business.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.neuedu.business.dao.ProvinceDao;
import com.neuedu.business.dao.ProvinceDaoImpl;
import com.neuedu.domain.Province;
import com.neuedu.utils.DBUtils;
import com.neuedu.utils.ServiceException;

/**
 * 省份服务类（采用单例模式实现）
 */
public class ProvinceService {
	/**
	 * 类实例
	 */
	private static final ProvinceService instance = new ProvinceService();

	/**
	 * 取得实例
	 * 
	 * @return 实例对象
	 */
	public static ProvinceService getInstance() {
		return instance;
	}

	/**
	 * 构造方法
	 */
	private ProvinceService() {
	}
	
	/**
	 * 获取所有省份列表
	 * @return 省份信息列表
	 * @throws SQLException
	 */
	public List<Province> getProvinceList(){
		Connection conn = null;
		List<Province> res = null;
		try {
			conn = DBUtils.getConnection();
			ProvinceDao provinceDao = new ProvinceDaoImpl(conn);
			DBUtils.beginTransaction(conn);
			res = provinceDao.getProvinceList();
			DBUtils.commit(conn);
		} catch (SQLException e) {
			DBUtils.rollback(conn);
			throw new ServiceException("查询错误", e);
		} finally {
			DBUtils.closeConnection(conn);
		}
		
		return res;
	}
}
