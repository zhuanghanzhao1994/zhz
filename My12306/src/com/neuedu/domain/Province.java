package com.neuedu.domain;

/**
 * 省实体类
 */
public class Province {
	/**
	 * ID
	 */
	private Integer id;

	/**
	 * 省份标识
	 */
	private String provinceId;

	/**
	 * 省份名称
	 */
	private String province;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "Province [id=" + id + ", provinceId=" + provinceId
				+ ", province=" + province + "]";
	}

}
