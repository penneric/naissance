<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/sideMenuNav.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/style.bundle.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/pagelayout.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/GestionUtilisateur/tableGestion.css"/> rel="stylesheet">

		
		
		
<!-- 				<div class="row">   -->
<!-- 						<div class="col-sm-12 font-weight-bold text-center">  -->
<!-- 						<h2>Page d'enregistrement</h2> -->
<!-- 						 </div> -->
<!-- 				</div> -->
				
				<div id="mges" class="mges col-sm-12">
				
				</div>

				 <form class="form-group text-left " id="frmReg" accept-charset="utf-8" action="#" method="POST" enctype="multipart/form-data" modal="RegistrationForm">
					<div class="row">
							 	<div class="col">
									<label for="sname" >Nom:</label> <input type="text" class="form-control" name="sname" id="sname" required/>
					 			</div>
				
								<div class="col">
									<label for="gname" >Prénoms:</label> <input type="text" class="form-control" name="gname" id="gname" required/>
								 </div>
					</div>
					
					<div class="row">
							 	
							 	<div class="col">
							<label for="password">Mot de passe:</label>
							<input type="password" class="form-control" name="pword" id="pword" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}"
								 title="Doit contenir au moins un chiffre et une lettre majuscule et minuscule, et au moins 8 caractères" required/>
								 </div>

							 	<div class="col">
							<label for="pwdconf">Confirmation du mot de passe:</label>  <!-- verifyPwd(); switchDateformat(date) logoutPage(); -->
							<input type="password" class="form-control" name="pwdconf" id="pwdconf" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
							 title="Doit contenir au moins un chiffre et une lettre majuscule et minuscule, et au moins 8 caractères" required onchange="verifyPwd();"/>
								 </div>

					</div>
					
					
					<div class="row">
					
								<div class="col-3">
							<label for="dob">Date de naissance:</label>
							<input type="date" class="datepicker form-control"  name="dob" id="dob" required 
							pattern='(?:(?:0[1-9]|1[0-2])[\/\\-. ]?(?:0[1-9]|[12][0-9])|(?:(?:0[13-9]|1[0-2])[\/\\-. ]?30)|(?:(?:0[13578]|1[02])[\/\\-. ]?31))[\/\\-. ]?(?:19|20)[0-9]{2}'/>
									 </div>
							<div class="col-3">
							<label for="pob">Lieu de naissance</label>
							<input type="text" class="form-control" name="pob" id="pob" required onclick="switchDateformat();"/>
								</div>
					
							 	<div class="col">
							<label for="actionPosition">Rang:</label>

										<select name="actionPosition" id="actionPosition" class="form-control" required>
												<option value="None" >Sélectionnez un</option>
										<c:forEach items="${toutPosition}" var="tPosition">										
												<option value="${tPosition.positionId}" >${tPosition.rang}</option>			    				
												
	       						 		</c:forEach> 
										</select>
								</div>
					
					</div>
					
					
					<div class="row">
							 	 <div class="col ">
									<label for="gendre">Gendre:</label>
										<select name="gendre" id="gendre" class="form-control" required>
										
											<option value="M">Masculin</option>
											<option value="F">Féminin</option>	
										</select>
								</div>
								<div class="col">
									<label for="email" >Email: </label><input type="email" class="form-control" name="email" id="email"  required/>
								</div>
					</div>
					
					
					<div class="row">
								<div class="col">
							<label for="note">Nom d'utilisateur:</label><input type="text" class="form-control" name="username"  id="username" required/>
								 </div>
					
							 	<div class="col">
							<label for="photos">Photo:</label><input type="file" class="form-control"  name="photos" id="photos" accept="image/*" required/>
								</div>
								
					</div>	<br />
					
					
					
					<div class="row">
						<div class="col">
									<label for="actionRegion">Region:</label>

										<select name="actionRegion" id="actionRegion" class="form-control" required>
										<option value="None" >Sélectionnez une</option>
										<c:forEach items="${toutRegion}" var="tRegion">										
												<option value="${tRegion.regionId}" onclick="actionAfficheDepart( ${tRegion.regionId})">${tRegion.nomRegion}</option>			    				
												
	       						 		</c:forEach> 
										</select>
						</div>
						
						<div class="col" id="actionttDepart" >
									<label for="actionDepart">Department:</label>

										<select name="actionDepart" id="actionDepart" class="form-control" required>
												<option value="None" >Sélectionnez un</option>
										<c:forEach items="${ttDepartRegion}" var="tDepart">										
												<option value="${tDepart.departId}" onclick="actionUtilisateur('D', ${tDepart.departId})">${tDepart.nomDepart}</option>			    				
												
	       						 		</c:forEach> 
										</select>
						</div>
						
						<div class="col">
									<label for="actionArrond">Arrondissement:</label>

										<select name="actionArrond" id="actionArrond" class="form-control" required>
													<option value="None" >Sélectionnez un</option>
										<c:forEach items="${toutArrond}" var="tArrond">										
												<option value="${tArrond.arrondId}" onclick="actionUtilisateur('D', ${tArrond.arrondId})">${tArrond.nomArrond}</option>			    				
												
	       						 		</c:forEach> 
										</select>
						</div>
						
						<div class="col">
									<label for="actionInstitut">Institution:</label>

										<select name="actionInstitut" id="actionInstitut" class="form-control" required>
													<option value="None" >Sélectionnez un</option>
										<c:forEach items="${toutInstitut}" var="tInstitut">										
												<option value="${tArrond.institutionId}" >${tArrond.nomInstitution}</option>			    				
												
	       						 		</c:forEach> 
										</select>
						</div>
						
						<div class="col">
							
								<label for="localite">Localité:</label>
<%-- 								<input type="text" class="form-control" name="localite"  id="localite" value="${tArrond.institutionId}" disabled />	 --%>
								<div>
										${tArrond.institutionId}
								</div>
							</div>
						
				
					</div>
				
					<br /><hr />
					<div class="row">
						<div class="col">
						
							<label for="roles">Roles:</label>
								<div>
									<c:forEach var="role" items="${toutRoles}">
									<input type="checkbox" name="roleUt"  id="roleUt" value="${role.rolesId}" />
									${role.description}
								
								</c:forEach>
								</div>
							</div>
					
					
					
					</div>
							
				
					

					
					
					
					
					
					
					
					<br /><hr />
					<div class="row">
								<div id="subBut" class="col-12">
						
								<input type="submit" value="Enregistre" class="btn btn-success btn-xs" onClick='openNav("entete", "message	<b> message</b>	message		message","100%");'/>
								<input type="reset" value="Annuler" class="btn btn-success btn-xs" />
								 </div>
					</div>
					
					
					
	
	
	
	
	
	
	
	
	
	
	
					
				</form>
				
				
				
				
				
				
				
				
				
			
				
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/bootstrap-datepicker.min.js"/>		type="text/javascript"></script>

<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/regFormValidation.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/laison.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/jquery-3.5.1.min.js"/> 	 type="text/javascript"></script>
  