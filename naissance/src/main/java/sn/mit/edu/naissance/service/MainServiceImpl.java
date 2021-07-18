package sn.mit.edu.naissance.service;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;

@Service("mainService")
public class MainServiceImpl implements MainService {

	@Override
	public Date convertUtilToSql(java.util.Date uDate) {
		java.sql.Date sDate = new java.sql.Date(uDate.getTime());
        return sDate;
	}

	@Override
	public java.util.Date convertSqlToUtil(Date sDate) {
		java.util.Date uDate = new java.util.Date(sDate.getTime());
        return uDate;
	}

	@Override
	public Date stringToDate(String dateEntered) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		java.util.Date parsed = sdf.parse(dateEntered);
		return new java.sql.Date(parsed.getTime());
	}


  
}
