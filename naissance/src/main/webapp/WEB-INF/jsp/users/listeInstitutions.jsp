<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   


									<option value="None" >Sélectionnez une Institution</option>
										<c:forEach items="${toutInstitut}" var="tInstitut">										
												<option value="${tInstitut.institutionId}" onclick="actionAfficheContenu( ${tInstitut.institutionId}, 'villeInstitution', 'I');">${tInstitut.nomInstitution}</option>			    				
												
	       						 		</c:forEach> 