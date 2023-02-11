package com.winter.remotecommon.service;


import com.winter.remotecommon.pojo.User;

/**
 * 公共用户服务
 *
 * @author yupi
 */
public interface InnerUserService {
	/**
	 * 通过accessKey查看用户是否存在
	 *
	 * @param accessKey AK
	 * @return 用户信息
	 */
	User getInvoker(String accessKey);
}
