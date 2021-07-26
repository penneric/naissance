<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

		
				<div class="row profileTop">  
						<div class="col-sm-9 font-weight-bold text-center"> 
							<h2>Mon profile</h2>
						 </div>
						 <div class="col-sm-3">
						 	<select class="form-control form-select">
						 	<option>Mon compte </option>
						 	<option onclick="selectOptionProfile('M');">Modifier Profile</option>
						 	<option onclick="selectOptionProfile('C');">Changer mot de passe</option>
						 	</select>
						 </div>
				</div>
				
				<div id="mges" class="mges col-sm-12">
				
				</div> 
		
				
					<div class="row row-cols-1">
						<div class="col-4">
							<c:if test="${usagerConnecter.photo == null}"> 
							<img src="${pageContext.request.contextPath}/resources/static/imgs/default_Img.jpeg" alt="mon protrait" width="100" height="90">
							</c:if>
							<c:if test="${usagerConnecter.photo != null}">
							<img src="${pageContext.request.contextPath}/download?repertoire=photo.folder&nomDocDBA=${usagerConnecter.photo}" alt="mon protrait" width="100" height="90">
							</c:if>
						</div>
						<div class="col-sm-4">
							<label for="divLab form-label" >Nom:</label> 
							<div class="divPro"> ${usagerConnecter.sname} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Prénom:</label> 
							<div class="divPro">${usagerConnecter.gname} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label"  >Gendre:</label> 
							<div class="divPro"> 
							<c:choose>
                                       <c:when test="${usagerConnecter.gendre=='M'}">
                                                                          Masculin
                                       </c:when>
                                       <c:when test="${connectedUser.gendre=='F'}">
                                                                           Féminin
                                        </c:when>
                             </c:choose>

							 </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Rang:</label> 
							<div class="divPro"> ${usagerConnecter.position.rang} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Institution:</label> 
							<div class="divPro"> ${usagerConnecter.institution.nomInstitution} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Numéro de téléphone:</label> 
							<div class="divPro"> ${usagerConnecter.nomeroTelephone} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Email:</label> 
							<div class="divPro form-label"> ${usagerConnecter.email} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Domicile:</label> 
							<div class="divPro"> ${usagerConnecter.domicile} </div>
					 	</div>
					 			
				</div>

				<div class="row divRoles">
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Roles:</label> 
							<div class="divPro">  
									<c:forEach var="role" items="${rolesUtilisateur}">
									${role.name}
									</c:forEach>
						 	</div>
						</div>
				</div>
  

  
  
  





