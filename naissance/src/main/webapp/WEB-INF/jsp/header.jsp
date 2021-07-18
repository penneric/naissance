<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
    
    
    <div class="row">
			<div class="col-10 main_title1">
	   		<h2>Système de Gestion d&apos;Etat Civil (Acte de naissance)</h2>
	   		
	   		</div>
	   		<div class="col-1 ">
	   			${usagerConnecter.username}
	   		</div>
	   		<div class="col-1 ">
		   		<a title="Déconnexion" href="${pageContext.request.contextPath}/logout">
		   		<img src="${pageContext.request.contextPath}/resources/static/imgs/close.jpeg" class="rounded btnClose" > </a>
	  		</div>
				 
			
		</div>
