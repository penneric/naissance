<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/pagelayout.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/GestionUtilisateur/tableGestion.css"/> rel="stylesheet">


				
				<div id="mges" class="mges col-sm-12">
				
				</div>

				 <form class="form-group text-left " id="forme_modifier_utilisateur">
					
					<div class="row">
						
						<div class="col-6">
									<label for="sname" >Nom:</label> <div>  ${utilisateur.sname} </div>
									
					 	</div>
					
					<div class="col-2" id="photoUtilisateur">
							<c:if test="${utilisateur.photo == null}"> 
								<img src="${pageContext.request.contextPath}/resources/static/imgs/default_Img.jpeg" 
									alt="mon protrait" width="100" height="90" ondblclick="ajouteButtonImg();">
							</c:if>
							<c:if test="${utilisateur.photo != null}">
								<img src="${pageContext.request.contextPath}/download?repertoire=photo.folder&nomDocDBA=${utilisateur.photo}" 
									alt="mon protrait" width="100" height="90" ondblclick="ajouteButtonImg();">
							</c:if>
						</div>
						<div id="telechargePhoto" class="col-4" onchange="mettreAjourNouvellePhoto();">
									 
						</div>
						
						
				</div>
					<div class="row">
							 		
				
								<div class="col-6">
									<label for="gname" >Prénoms:</label> <div> ${utilisateur.gname} </div> 
									
								 </div>
								 <div class="col-2">
										<label for="isEnable">&nbsp;</label>
										<div>Actif</div>
										<c:choose>
											<c:when test="${utilisateur.isEnabled}">
											<input type="checkbox" name="isEnable"  id="isEnable" class="form-check" checked readonly/>
											</c:when>
										</c:choose>
	
									</div>
					</div>
					
					<div class="row">
					
								<div class="col-3">
							<label for="dob">Date de naissance:</label>
							
							<fmt:formatDate type="date" value="${utilisateur.dob}" pattern="dd/MM/yyyy" var="today" />
							<input type="text" class="datepicker01 form-control"  name="dob" id="dob" required value="${today}"
							placeholder="dd/mm/YYYY" readonly  />
							
									 </div>
							<div class="col-3">
								<label for="pob">Lieu de naissance</label> <div> ${utilisateur.pob} </div> 	
								</div>

								
								<div class="col-3">
									<label for="gendre">Gendre:</label>
									<select name="gendre" id="gendre" class="form-control" required>
									<c:choose>
				                       <c:when test="${utilisateur.gendre=='M'}">
				                               <option value="M" selected>Masculin</option >
				                               
				                       </c:when>
				                       <c:when test="${utilisateur.gendre=='F'}">
				                      			 
				                                  <option value="F" selected>Féminin</option>	
				                        </c:when>
         				 		</c:choose>
										</select>
								</div>
								
							
								
								<div class="col-3">
										<label for="position">Rang:</label><div>${utilisateur.position.rang}</div>	
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
								
								
									<div class="col-6">
							<label for="note">Nom d'utilisateur:</label>
							<input type="text" class="form-control" name="username"  id="username" Readonly value="${utilisateur.username}"/>
								 </div>	
							
					</div>	<br />
					
					
					
					<div class="row">
						<div class="col">
						<label for="actionRegion">Region:</label>
							<div>${utilisateur.institution.arrondissement.departement.region.nomRegion}</div>			
						</div>
						<div class="col" id="actionttDepart" >
									<label for="actionDepart">Department:</label> 
								<div>${utilisateur.institution.arrondissement.departement.nomDepart}</div>			
						</div>
						
						<div class="col">
									<label for="actionArrond">Arrondissement:</label>
								<div> ${utilisateur.institution.arrondissement.nomArrond}</div>
										
						</div>
						
						<div class="col">
									<label for="institution">Institution:</label>
							<div> ${utilisateur.institution.nomInstitution} </div>
										
						</div>
						
						<div class="col">
							
								<label for="localite">Localité:</label>

								<div id="villeInstitution">
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
												${trole.name} ,  
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
									<button class="btn btn-success btn-xs" onClick="modifierInfosBasicUtilisateur();">Modifier</button>
								 </div>
					</div>
					
					
					
	
	
	
	
	
	
	
	
	
	
	
					
				</form>
				
				
				
				
				
				
				
				
				
			
				
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/bootstrap-datepicker.min.js"/>		type="text/javascript"></script>

<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/regFormValidation.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/laison.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/jquery-3.5.1.min.js"/> 	 type="text/javascript"></script>
  