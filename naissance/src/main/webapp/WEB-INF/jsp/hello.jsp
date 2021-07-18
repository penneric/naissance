<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>




 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>home page</title>

<!--  -->

<link href=<c:url value="resources/static/css/bootstrap.min.css"/> rel="stylesheet">
<link href="resources/static/css/bootstrap-datepicker.min.css" rel="stylesheet"/> 




</head>
<body>
<div class="container">
<div class="row">
		    <div class="col-sm-6">
		      	<h2>Column 1</h2>
				<h3> This is my first title on the project lab </h3>
			</div>
		
			<div class="col-sm-6">
				<h2>Column 2</h2>
				<h1> This is my second title on the project lab </h1>
			</div>
		 	<div class="form-group">
                        <label for="prodDesc">Product Description</label>
                        <textarea class="form-control" name="prodDesc" cols="60" rows="3"></textarea>
             </div>
             		 <a	class="btn	btn-primary	 btn-sm"	href="register"	role="button">	Bootstrap button</a>
</div>



<table class="table">
	   <thead>
		    <tr>
			     <th scope="col">#</th>
			     <th scope="col">First name</th>
			     <th scope="col">Last name</th>
			     <th scope="col">Email</th>
		    </tr>
	   </thead>
   <tbody>
	    <tr>
		     <th scope="row">1</th>
		     <td>Admin</td>
		     <td>Tutorial</td>
		     <td>admin@presprint.cm</td>
	    </tr>
	    <tr>
		     <th scope="row">2</th>
		     <td>Support</td>
		     <td>Tutorial</td>
		     <td>support@presprint.cm</td>
		</tr>
   </tbody>
  </table>
  
 				 <form class="form-group text-left" id="frmReg" action="#" method="POST" >
					<div class="row">
							 	<div class="col">
									<label for="sname" >Surname:</label> <input type="text" class="form-control" name="sname" id="sname" />
					 			</div>
				
								<div class="col">
									<label for="gname" >Given Name:</label> <input type="text" class="form-control" name="gname" id="gname" />
								 </div>
					</div>
					<div class="row">
							 	<div class="col">
							<label for="email" >Email: </label><input type="email" class="form-control" name="email" id="email" />
									</div>
					 
								<div class="col">
							<label for="password">Password:</label><input type="password" class="form-control" name="password" id="password"/>
								 </div>
					</div>
					<div class="row">
							 	<div class="col">
							<label for="profession">Profession:</label><input type="text" class="form-control" name="profession" id="profession"/>
								</div>
					
								<div class="col">
							<label for="note">Note:</label><input type="text" class="form-control" name="note"  id="note"/>
								 </div>
					</div>
					<div class="row">
							 	<div class="col">
							<label for="gender">Gender:</label><input type="text" class="form-control"  name="gender" id="gender"/>
								</div>
					</div>
					<div class="row">
								<div class="col">
							<label for="birthday">Birthday:</label><input type="date" class="form-control"  name="birthday" id="birthday" />
									 </div>
					
							 	<div class="col">
							<label for="married">Married:</label><input type="text" class="form-control"  name="married" id="married"/>
								</div>
					</div>
					<div class="row">
								<div class="col-12">
						
								<input type="submit" value="Save Changes" class="btn btn-primary btn-lg" />
								 </div>
					</div>
				
					 </div>
				</form>
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  </div>
<div></div>








		
<script src=<c:url value="resources/static/js/bootstrap.min.js"/>		type="text/javascript"></script>
<script src=<c:url value="resources/static/js/jquery.min.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="resources/static/js/pages/testJquery/test1.js"/> 	 type="text/javascript"></script>

</body>
</html>
