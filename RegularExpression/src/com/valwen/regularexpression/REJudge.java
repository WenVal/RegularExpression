package com.valwen.regularexpression;

/**
 * 
 * @author valwen
 *
 *正则匹配
 */

public final class REJudge {
	
	
	//正则判定字符串格式
	public static final boolean isMatchPwdFormat(String s) 
	{
		return s.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])[\\d\\D]{8,12}$")?true:false;
	}
	
	/**
	 * 
	 * @param s 中文名 String
	 * @return 是否是中文名字 boolean
	 */
	public static final boolean isMatchChineseNameFormat(String s) {
		return s.matches("^[\\u4e00-\\u9fa5]{2,4}$")?true:false;
		
	} 
	
	/**
	 * 
	 * @param s QQ号 String
	 * @return QQ号是否合法 boolean
	 */
	public  static final boolean isMatchQQFormat(String s) 
	{
		return s.matches("^[1-9][0-9]{4,11}$")?true:false;
	}
	
	
	//正则判定字符串格式 型如： x{1,3}:x{1,3}:x{1,3}:x{1,3} ,x为数字
	public static final boolean isMatchIPFormat(String s)
	{
		return s.matches("^(\\d{1,3}[.]){3}\\d{1,3}$")?true:false;
	}
	
	//正则判定字符串格式 11位手机号码
	public static final boolean isMatchPhoneFormat(String s) {
		return s.matches("^[1-9][0-9]{10}$")?true:false;	
	}

}
