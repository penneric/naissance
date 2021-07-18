package sn.mit.edu.naissance.service;

import java.text.ParseException;

public interface MainService {
	
	public java.sql.Date convertUtilToSql(java.util.Date uDate);
	public java.util.Date convertSqlToUtil(java.sql.Date sDate);
	 public java.sql.Date stringToDate(String dateEntered)  throws ParseException ;

}
