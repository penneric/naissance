<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Login page</title>

<!-- modelAttribute="frmregister"  <>  </> <label for="">  </label>-->

<link href=<c:url value="resources/static/css/bootstrap.min.css"/> rel="stylesheet">
<link href=<c:url value="resources/static/css/login/login.css"/> rel="stylesheet">
<script src=<c:url value="resources/static/js/jquery-3.5.1.min.js"/> 	 type="text/javascript"></script>


</head>
<body>

	  	<div>  </div>
		<div id="main_content_log" class="container"> 
			<div class="row">  
				<div class="col-sm-12 font-weight-bold text-center"> 
				<h2>Login</h2>
				 </div>
			</div>

				 <form class="form-group text-left frmLogin" id="frmLog" action="#" method="POST" >
					<div class="row">
						<div class="col">
									<label for="username" >Username:</label>
									<input type="text" class="form-control" name="username" id="username" autocomplete="username" required />
					 	</div>
					 </div>
					 <div class="row">
					 	<div class="col">
							<label for="password">Password:</label><input type="password" class="form-control" name="password" id="password" required/>
						</div>		
					</div>
					
					<div class="row checkPwdDiv">
								<div class="col btnCheck">
								<input type="checkbox" id="btnCheckPwd" class="btnCheckPwd" />
								<span>view_password </span>
								 </div>
								 <div class="col pwdforgot">
						
								<a href="#">password_forgotten<a/>
								 </div>
					</div>
								
					
					<div class="row">
								<div class="col-3 btnSubmit">
						
								<input type="submit" value="sign_in" class="btn btn-primary btn-lg" />
								 
								 </div>
					</div>
				
				<div class="row">
								
					</div>
					
				</form>
  
	</div>

<footer class="main_footer"> 

<span class="cpright">Copyright@2020</span>
</footer>
<br />
<script src=<c:url value="resources/static/js/bootstrap.min.js"/>		type="text/javascript"></script>

<script src=<c:url value="resources/static/js/pages/testJquery/test1.js"/> 	 type="text/javascript"></script>
</body>
</html>
 
