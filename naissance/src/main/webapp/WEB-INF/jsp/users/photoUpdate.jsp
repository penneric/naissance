<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

							<c:if test="${utilisateur.photo == null}"> 
								<img src="${pageContext.request.contextPath}/resources/static/imgs/default_Img.jpeg" 
									alt="mon protrait" width="100" height="90" ondblclick="ajouteButtonImg();">
							</c:if>
							<c:if test="${utilisateur.photo != null}">
								<img src="${pageContext.request.contextPath}/download?repertoire=photo.folder&nomDocDBA=${utilisateur.photo}" 
									alt="mon protrait" width="100" height="90" ondblclick="ajouteButtonImg();">
							</c:if>
						
							<div id="telechargePhoto" class="col-4" onchange="alert('picture loaded');">
									 
						</div>		 