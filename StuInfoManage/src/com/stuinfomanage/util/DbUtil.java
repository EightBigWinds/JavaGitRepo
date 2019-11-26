package com.stuinfomanage.util;

import java.sql.*;

public class DbUtil {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/db_studentinfo?serverTimezone=GMT%2B8";	//���ݿ��ַ
	private String dbUserName = "root";	   //�û���
	private String dbPassword = "szj990611";	//����
	private String jdbcName = "com.mysql.cj.jdbc.Driver";	//���ݿ�����
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception
	 */
	public Connection getCon()throws Exception{
		Class.forName(jdbcName);
		Connection con = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}
	
	/**
	 * �ر����ݿ�����
	 * @param con
	 * @throws Exception
	 */
	public void closeCon(Connection con) throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) {
		DbUtil dbUtil=new DbUtil();
		try {
			dbUtil.getCon();
			System.out.println("���ݿ����ӳɹ�");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
