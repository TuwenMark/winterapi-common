package com.winter.remotecommon.service;

/**
 * @author Admin
 * @description 针对表【user_interface_invoke(用户接口信息调用表)】的数据库操作Service
 * @createDate 2022-11-28 22:45:38
 */
public interface InnerUserInterfaceInvokeService {

	Boolean validInvoke(Long userId, Long interfaceId);

	/**
	 * 接口调用统计
	 *
	 * @param userId      用户ID
	 * @param interfaceId 接口ID
	 * @return 是否调用成功
	 */
	void invokeCount(Long userId, Long interfaceId);

}
