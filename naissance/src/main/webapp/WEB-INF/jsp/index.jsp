<%@ page language="java" contentType="text/html; charset=UTF-8"  pageEncoding="UTF-8"%>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix = "fn"  uri = "http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>index</title>
	<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/bootstrap.min.css"/> rel="stylesheet">
	<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/login/login.css"/> rel="stylesheet">
	<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/jquery-3.5.1.min.js"/> 	 type="text/javascript"></script>
</head>
<body>
	  	<div>  </div>
		<div id="main_content_log" class="container"> 
			<div class="row">  
				<div class="col-sm-12 font-weight-bold text-center"> 
				<h2>Page de Connexion </h2>
				 </div>
			</div>

				 <form class="form-group text-left frmLogin" id="frmLog" action="/seConnecter" method="POST" >
						
						<c:if test="${param.error != null}">
							 <div  class="alert alert-danger">
								<strong>Échec de la connexion.</strong>
							  		<c:if test="${session[SPRING_SECURITY_LAST_EXCEPTION] != null}">
									<span >
											<c:if test="${session[SPRING_SECURITY_LAST_EXCEPTION].message}">
												<span > Références non valides</span>
											</c:if>
										</span>
									</c:if>  
									
								</div>
						</c:if>
						
							<c:if test="${param.logout != null}">
									<div  class="alert alert-success">
											Vous avez été déconnecté(e).
									</div>
							</c:if>
								
							
					<div class="row">
						<div class="col form-label-group">
									<!-- Nom d'utilisateur -->
									<label for="username" ></label>
									<input type="text" class="form-control" name="username" id="username" placeholder="Nom d'utilisateur" autofocus="autofocus" required />
					 	</div>
					 </div>
					 <div class="row">
					 	<div class="col form-label-group">
							<!--Mot de passe:  -->
							<label for="password"></label>
							<input type="password" class="form-control" name="password" id="password" placeholder="Mot de passe" id="password" required/>
						</div>		
					</div>
					
					<div class="row checkPwdDiv form-group">
								<div class="col btnCheck">
								<input type="checkbox" id="btnCheckPwd" class="btnCheckPwd" />
								<span>Voir le mot de passe </span>
								 </div>
								 
								 <div class="col pwdforgot">
								<a href="#">Mot de passe Oublié<a/>
								 </div>
					</div>
								
					
					<div class="row">
								<div class="col-3 " id="btnSubmit">
						
								<input type="submit" value="Se connecter" class="  btn btn-primary btn-lg" />
								 
								 </div>
					</div>
				
				<div class="row">
								
				</div>
					
				</form>
  
	</div>











<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/bootstrap.min.js"/>		type="text/javascript"></script>

<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/login/login.js"/> 	 type="text/javascript"></script>
</body>
</html>