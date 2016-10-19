package cn.com.wito.auth.service.gencode;

import java.util.Date;

import cn.com.wito.common.utils.date.DateUtil;

/**
 * 资源ID生成器
 * 
 * @author wujia<1438019595@qq.com>
 * 
 */
public final class CodeConstructor {

	private CodeConstructor() {

	}

	/**
	 * 得到角色Code
	 * 
	 * @return
	 */
	public static String getRoleCode() {
		String nowTime = null;
		synchronized (CodeConstructor.class) {
			nowTime = DateUtil.format(new Date(),
					DateUtil.MILLISECOND_PATTERN_2);
		}
		return nowTime;
	}

	/**
	 * 生成一个唯一的资源编码
	 * 
	 * @return
	 */
	public static String getResourceCode() {
		String nowTime = null;
		synchronized (CodeConstructor.class) {
			nowTime = DateUtil.format(new Date(),
					DateUtil.MILLISECOND_PATTERN_2);
		}
		return nowTime;
	}

	/**
	 * 生成用户code
	 * 
	 * @return
	 */
	public static String getUserCode() {
		String nowTime = null;
		synchronized (CodeConstructor.class) {
			nowTime = DateUtil.format(new Date(),
					DateUtil.MILLISECOND_PATTERN_2);
		}
		return nowTime;
	}

	/**
	 * 生成活动 code
	 * 
	 * @return
	 */
	public static String getSubjectCode() {
		String nowTime = null;
		synchronized (CodeConstructor.class) {
			nowTime = DateUtil.format(new Date(),
					DateUtil.MILLISECOND_PATTERN_2);
		}
		return nowTime;
	}

	/**
	 * 生成系统资源 code
	 * 
	 * @return
	 */
	public static String getAdResourceCode() {
		String nowTime = null;
		synchronized (CodeConstructor.class) {
			nowTime = DateUtil.format(new Date(),
					DateUtil.MILLISECOND_PATTERN_2);
		}
		return nowTime;

	}

	/**
	 * 生成系统计划 code
	 * 
	 * @return
	 */
	public static String getAdSysPlanCode() {
		String nowTime = null;
		synchronized (CodeConstructor.class) {
			nowTime = DateUtil.format(new Date(),
					DateUtil.MILLISECOND_PATTERN_2);
		}
		return nowTime;
	}

	/**
	 * 生成门店的code
	 * 
	 * @return
	 */
	public static String getStoreCode() {
		String nowTime = null;
		synchronized (CodeConstructor.class) {
			nowTime = DateUtil.format(new Date(),
					DateUtil.MILLISECOND_PATTERN_2);
		}
		return nowTime;
	}

	/**
	 * 生成售货机机器的code
	 * 
	 * @return
	 */
	public static String getMachineCode() {
		String nowTime = null;
		synchronized (CodeConstructor.class) {
			nowTime = DateUtil.format(new Date(),
					DateUtil.MILLISECOND_PATTERN_2);
		}
		return nowTime;
	}
}
