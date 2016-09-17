package com.neuedu.business.dao;

import java.sql.SQLException;
import java.util.List;

import com.neuedu.domain.City;

/**
 * 城市表操作接口
 * @author Administrator
 *
 */
public interface CityDao {
	/**
	 * 根据省份标识获取所有城市信息列表
	 * @param proID
	 * @return
	 * @throws SQLException
	 */
	List<City> getCityListByProID(String proID) throws SQLException;
}
