<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/Declaration/labelFormat.css"/> rel="stylesheet">

<div class="row row-cols-1">
						<div class="col-4">
							<c:if test="${utilisateur.photo == null}"> 
							<img src="${pageContext.request.contextPath}/resources/static/imgs/default_Img.jpeg" alt="mon protrait" width="100" height="90">
							</c:if>
							<c:if test="${utilisateur.photo != null}">
							<img src="${pageContext.request.contextPath}/download?repertoire=photo.folder&nomDocDBA=${utilisateur.photo}" alt="mon protrait" width="100" height="90">
							</c:if>

						</div>
						<div class="col-sm-4">
							<label for="divLab form-label" >Nom:</label> 
							<div class="divPro"> ${utilisateur.sname} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Prénom:</label> 
							<div class="divPro">${utilisateur.gname} </div>
					 	</div>
					 	
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Date de naissance:</label> 
							<fmt:formatDate type="date" value="${utilisateur.dob}"  pattern="dd/MM/yyyy" var="dutilisateur" />
							<div class="divPro">${dutilisateur} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Lieu de naissance:</label> 
							<div class="divPro">${utilisateur.pob} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Nom d'utilisateur:</label> 
							<div class="divPro form-label"> ${utilisateur.username} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label"  >Gendre:</label> 
							<div class="divPro"> 
							<c:choose>
                                       <c:when test="${utilisateur.gendre=='M'}">
                                                                          Masculin
                                       </c:when>
                                       <c:when test="${utilisateur.gendre=='F'}">
                                                                           Féminin
                                        </c:when>
                             </c:choose>

							 </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Rang:</label> 
							<div class="divPro"> ${utilisateur.position.rang} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Institution:</label> 
							<div class="divPro"> ${utilisateur.institution.nomInstitution} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Numéro de téléphone:</label> 
							<div class="divPro"> ${utilisateur.nomeroTelephone} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Email:</label> 
							<div class="divPro form-label"> ${utilisateur.email} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Domicile:</label> 
							<div class="divPro"> ${utilisateur.domicile} </div>
					 	</div>
					 			
</div>

				<div class="row divRoles">
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Roles:</label> 
							<div class="divPro">  
									<c:forEach var="role" items="${ttRoles}">
										<div>	${role.name}</div>
									</c:forEach>
						 	</div>
						</div>
				</div>
  