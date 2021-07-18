<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   


											<option value="None" >Sélectionnez un département</option>
										<c:forEach items="${ttDepartRegion}" var="tDepart">										
											<option value="${tDepart.departId}" onclick="actionAfficheContenu(${tDepart.departId},'select-actionArrond', 'D');">${tDepart.nomDepart}</option>			    				
												
	       						 		</c:forEach> 