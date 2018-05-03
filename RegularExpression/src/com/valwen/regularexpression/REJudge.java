package com.valwen.regularexpression;

/**
 * 
 * @author valwen
 *
 *����ƥ��
 */

public final class REJudge {
	
	
	//�����ж��ַ�����ʽ
	public static final boolean isMatchPwdFormat(String s) 
	{
		return s.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d])[\\d\\D]{8,12}$")?true:false;
	}
	
	/**
	 * 
	 * @param s ������ String
	 * @return �Ƿ����������� boolean
	 */
	public static final boolean isMatchChineseNameFormat(String s) {
		return s.matches("^[\\u4e00-\\u9fa5]{2,4}$")?true:false;
		
	} 
	
	/**
	 * 
	 * @param s QQ�� String
	 * @return QQ���Ƿ�Ϸ� boolean
	 */
	public  static final boolean isMatchQQFormat(String s) 
	{
		return s.matches("^[1-9][0-9]{4,11}$")?true:false;
	}
	
	
	//�����ж��ַ�����ʽ ���磺 x{1,3}:x{1,3}:x{1,3}:x{1,3} ,xΪ����
	public static final boolean isMatchIPFormat(String s)
	{
		return s.matches("^(\\d{1,3}[.]){3}\\d{1,3}$")?true:false;
	}
	
	//�����ж��ַ�����ʽ 11λ�ֻ�����
	public static final boolean isMatchPhoneFormat(String s) {
		return s.matches("^[1-9][0-9]{10}$")?true:false;	
	}

}
