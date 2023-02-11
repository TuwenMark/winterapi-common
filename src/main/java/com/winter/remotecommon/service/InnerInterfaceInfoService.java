package com.winter.remotecommon.service;

import com.winter.remotecommon.pojo.InterfaceInfo;

/**
 * @author m1869
 * @description 针对表【interface_info(接口信息表)】的数据库操作Service
 * @createDate 2022-11-06 16:52:03
 */
public interface InnerInterfaceInfoService {

	/**
	 * 通过接口路径和请求方式查询是否存在此接口
	 *
	 * @param url    接口路径
	 * @param method 请求方式
	 * @return 接口信息
	 */
	InterfaceInfo getInterfaceInfo(String url, String method);
}
