package com.wangshu.utils;

import org.apache.commons.codec.digest.DigestUtils;
/**
 * 
 * @author 王澍
 *
 */
public class Md5Utils {
	
	/**
	 * 加盐
	 */
	private static String  saltString="asdgsfdfdfsdfgssggfddgfdfg";
	
	/**
	 * 对密码进行加密
	 * @param pwd
	 * @return
	 */
	public static String md5(String pwd) {
		//对密码进行加密
		return DigestUtils.md5Hex(pwd + saltString);
	}
}
