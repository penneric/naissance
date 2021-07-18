<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/sideMenuNav.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/style.bundle.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/pagelayout.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/GestionUtilisateur/tableGestion.css"/> rel="stylesheet">

		
		
		
<!-- 				<div class="row">   -->
<!-- 						<div class="col-sm-12 font-weight-bold text-center">     -->
<!-- 						<h2>Page d'enregistrement</h2>                                       -->
<!-- 						 </div> -->
<!-- 				</div> -->
				
				<div id="mges" class="mges col-sm-12">
				
				</div>

				 <form class="form-group text-left " id="forme_nouveau_utilisateur" accept-charset="utf-8" action="#" method="POST" enctype="multipart/form-data" modal="RegistrationForm">
					<div class="row">
							 	<div class="col">
									<label for="sname" >Nom:</label> 
									<input type="text" class="form-control" name="sname" id="sname" value="${utilisateur.sname}" required/>
					 			</div>
				
								<div class="col">
									<label for="gname" >Prénoms:</label> 
									<input type="text" class="form-control" name="gname" id="gname" value="${utilisateur.gname}" />
								 </div>
					</div>
					
					<div class="row">
					
								<div class="col-3">
							<label for="dob">Date de naissance:</label>
							
							<fmt:formatDate type="date" value="${utilisateur.dob}" pattern="dd/MM/yyyy" var="today" />
							<input type="text" class="datepicker01 form-control"  name="dob" id="dob" required value="${today}"
							placeholder="dd/mm/YYYY"  />
							
									 </div>
							<div class="col-3">
							<label for="pob">Lieu de naissance</label>
							<input type="text" class="form-control" name="pob" id="pob" required value="${utilisateur.pob}"/>
								</div>
					
							 	
								
								<div class="col ">
									<label for="gendre">Gendre:</label>
									<select name="gendre" id="gendre" class="form-control" required>
									<c:choose>
				                       <c:when test="${utilisateur.gendre=='M'}">
				                               <option value="M" selected>Masculin</option >
				                               <option value="F">Féminin</option>
				                       </c:when>
				                       <c:when test="${utilisateur.gendre=='F'}">
				                      			 <option value="M">Masculin</option>
				                                  <option value="F" selected>Féminin</option>	
				                        </c:when>
         				 		</c:choose>
										</select>
								</div>
								
							
								
								<div class="col">
										<label for="position">Rang:</label>

										<select name="position" id="position" class="form-control" required>
											
												<c:set var="userRang" value="${utilisateur.position.rang}">	</c:set>
												<option value="None" >Sélectionnez un</option>
											<c:forEach items="${toutPosition}" var="tPosition">		
											<c:choose>
												<c:when test="${tPosition.rang == userRang}"></c:when>
											</c:choose>							
													  <option value="${tPosition.positionId}" selected>${tPosition.rang}</option>	 				
												
	       						 			</c:forEach> 
	       						 		</select>
								</div>
					
					</div>
		
					

					<div class="row">
							 	 <div class="col ">
									<label for="domicile">Domicile:</label>
										<input type="text" name="domicile"  id="domicile" class="form-control" value="${utilisateur.domicile}"/>
								</div>
								<div class="col ">
									<label for="nomeroTelephone">Nomero de Téléphone:</label>
										<input type="number" name="nomeroTelephone"  id="nomeroTelephone" class="form-control" value="${utilisateur.nomeroTelephone}" />
								</div>
						</div>			
					<div class="row">
								<div class="col-6">
									<label for="email" >Email: </label>
									<input type="email" class="form-control" name="email" id="email"  required value="${utilisateur.email}"/>
								</div>
								
								
									<div class="col-3">
							<label for="note">Nom d'utilisateur:</label>
							<input type="text" class="form-control" name="username"  id="username" Readonly value="${utilisateur.username}"/>
								 </div>	
								 <div class="col-3">
							<label for="pword">mot de passe:</label>
							<input type="password" class="form-control" name="pword"  id="pword" Readonly value="${utilisateur.password}"/>
								 </div>	
					</div>
					
					
					<div class="row">
								<div class="col">
									<label for="photos">Photo:</label>
									<input type="file" class="form-control"  name="photos" id="photos" accept="image/*" />
								</div>
					
							 <div class="col">
										<label for="isEnable">&nbsp;</label>
										<div>Actif</div>
										<c:choose>
											<c:when test="${utilisateur.isEnabled}">
											<input type="checkbox" name="isEnable"  id="isEnable" class="form-check" checked/>
											</c:when>
											<c:otherwise>
											<input type="checkbox" name="isEnable"  id="isEnable" class="form-check"/>
											</c:otherwise>
											
										</c:choose>
											
										
										
								</div>
								
					</div>	<br />
					
					
					
					<div class="row">
						<div class="col">
									<label for="actionRegion">Region:</label>

										<select name="actionRegion" id="actionRegion" class="form-control form-select" required>
											<c:set var="userRegion" value="${utilisateur.institution.arrondissement.departement.region.nomRegion}"></c:set>
										<option value="None" >Sélectionnez une région</option>
										<c:forEach items="${toutRegion}" var="tRegion">		
										<c:choose>
											<c:when test="${tRegion.nomRegion == userRegion}"></c:when>
										</c:choose>								
												<option value="${tRegion.regionId}" selected onclick="actionAfficheContenu( ${tRegion.regionId}, 'select-actionDepart', 'R');">${tRegion.nomRegion}</option>			    				
												
	       						 		</c:forEach> 
										</select>
						</div>
						
						
						
						<div class="col" id="actionttDepart" >
									<label for="actionDepart">Department:</label> 

										<select name="actionDepart" id="select-actionDepart" class="form-control form-select" required>
										<c:set var="usersDepart" value="${utilisateur.institution.arrondissement.departement.nomDepart}"></c:set>
										
										
												<option value="None" >Sélectionnez un département</option>
										<c:forEach items="${toutDepart}" var="tDepart">	
											<c:choose>
												<c:when test="${tDepart.nomDepart == usersDepart}"></c:when>
											</c:choose>									
												<option value="${tDepart.departId}" selected onclick="actionAfficheContenu(${tDepart.departId},'select-actionArrond', 'D');">${tDepart.nomDepart}</option>			    				
												
	       						 		</c:forEach> 
										</select>
						</div>
						
						<div class="col">
									<label for="actionArrond">Arrondissement:</label>

										<select name="select-actionArrond" id="select-actionArrond" class="form-control" required>
										<c:set var="userDepart" value="${utilisateur.institution.arrondissement.nomArrond}"></c:set>
													<option value="None" >Sélectionnez un arrondissement</option>
										<c:forEach items="${toutArrond}" var="tArrond">	
										<c:choose>
											<c:when test="${tArrond.nomArrond == userDepart}"></c:when>
										</c:choose>									
												<option value="${tArrond.arrondId}" Selected onclick="actionAfficheContenu( ${tArrond.arrondId}, 'select-actionInstitut', 'A');">${tArrond.nomArrond}</option>			    				
												
	       						 		</c:forEach> 
										</select>
						</div>
						
						<div class="col">
									<label for="institution">Institution:</label>

										<select name="institution" id="select-actionInstitut" class="form-control" required>
										<c:set var="userDepart" value="${utilisateur.institution.nomInstitution}"></c:set>
													<option value="None" >Sélectionnez une Institution</option>
										<c:forEach items="${toutInstit}" var="tInstitut">	
										<c:choose>
											<c:when test="${tInstitut.nomInstitution == userDepart}"></c:when>
										</c:choose>									
												<option value="${tInstitut.institutionId}" selected onclick="actionAfficheContenu( ${tInstitut.institutionId}, 'villeInstitution', 'I');" >${tInstitut.nomInstitution}</option>			    				
												
	       						 		</c:forEach> 
										</select>
						</div>
						
						<div class="col">
							
								<label for="localite">Localité:</label>

								<div id="villeInstitution"">
										${utilisateur.institution.localite}
								</div>
							</div>
						
				
					</div>
				
					<br /><hr />
					<div class="row">
						<div class="col">
						
							<label for="roles">Roles:</label>
								<div>
								<c:forEach var="trole" items="${ttRoles}">
									
										<c:forEach var="uRole" items="${ttUsersRoles}">
											<c:choose>
												<c:when test="${trole.name == uRole.name}">
												<input type="checkbox" name="roles"  id="roles" value="${trole.rolesId}" checked  class="form-check" />
												${trole.name}
												</c:when>
												<c:otherwise>
												<input type="checkbox" name="roles"  id="roles" value="${trole.rolesId}"  class="form-check" />
												${trole.name}
												</c:otherwise>
											</c:choose>
											
									</c:forEach>
									
								</c:forEach>
								</div>
							</div>
					
					
					
					</div>

					<div> 
						<input type="hidden" name="usersId" id="usersId" value="${utilisateur.usersId}">
					
					
					</div>
					
					
					
					<br /><hr />
					<div class="row">
								<div id="subBut" class="col-12">
						
								<input type="submit" value="Modifier" class="btn btn-success btn-xs" onClick="modifierUtilisateur();"/>
								
								 </div>
					</div>
					
					
					
	
	
	
	
	
	
	
	
	
	
	
					
				</form>
				
				
				
				
				
				
				
				
				
			
				
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/bootstrap-datepicker.min.js"/>		type="text/javascript"></script>

<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/regFormValidation.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/laison.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/jquery-3.5.1.min.js"/> 	 type="text/javascript"></script>
  