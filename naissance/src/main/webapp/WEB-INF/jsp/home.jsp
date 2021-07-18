<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="Templateform" content="This is a template">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Page D'accueil</title>

<!-- modelAttribute="frmregister"  <>  </> <label for="">  </label>-->

<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/bootstrap-datepicker.min.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/bootstrap.min.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/sweetalert.min.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/sideMenuNav.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/style.bundle.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/pagelayout.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/GestionUtilisateur/tableGestion.css"/> rel="stylesheet">



</head>
<body>

	<header id="main_header" class="main_header" > 
			<jsp:include page="header.jsp" />	
	 </header>
	 
	 
	  <div id="main_menu" class="main_menu" >   
		 <jsp:include page="sideMenu.jsp" />
	  </div>
	  
	  
	  	
        
	  
	<!-- <p> </p> 	<div>  </div> -->
	
		<div id="main_content" class="container-fluid main_content"> 
		
		
		
		<jsp:include page="users/profile.jsp" />
		
	
		
			
		</div>
		
		
		<!-- Start The Modal  with Title-->
        <div id="myModal" class="modal " >
         Modal content 
          <div class="modal-content modal-dialog">
             <div class="modal-header">
                <h4 id="title" class="modal-title" style="color: white;">Modal Header</h4>
                <button type="button" class="close" data-dismiss="modal">x</button>
             </div>
            <div id="contenu" class="modal-body">
                <p>Some text in the Modal Body</p>
            </div>
          </div>
        </div>
        <!-- End The Modal with Title -->
		
<footer id="main_footer" class="main_footer"> 
<jsp:include page="footer.jsp" />	
</footer>





<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/bootstrap-datepicker.min.js"/>		type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/declaration/declarationControl.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/regFormValidation.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/laison.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/jquery-3.5.1.min.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/bootstrap.min.js"/>		type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/sweetalert.min.js"/>		type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/popper-1.16.0.min.js"/>		type="text/javascript"></script>
</body>
</html>
 

 
