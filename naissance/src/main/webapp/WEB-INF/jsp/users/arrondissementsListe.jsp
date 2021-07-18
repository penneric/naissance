<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   






													<option value="None" >Sélectionnez un arrondissement</option>
										<c:forEach items="${toutArrond}" var="tArrond">										
												<option value="${tArrond.arrondId}" onclick="actionAfficheContenu( ${tArrond.arrondId}, 'select-actionInstitut', 'A')">${tArrond.nomArrond}</option>			    				
												
	       						 		</c:forEach> 