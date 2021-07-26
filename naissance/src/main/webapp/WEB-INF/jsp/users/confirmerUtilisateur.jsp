<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/Declaration/labelFormat.css"/> rel="stylesheet">



<div class="row row-cols-1">
						<div class="col-4">
						<c:if test="${utilisateurCreer.photo == null}"> 
						<img src="${pageContext.request.contextPath}/resources/static/imgs/default_Img.jpeg" alt="mon protrait" width="100" height="90">
						</c:if>
						<c:if test="${utilisateurCreer.photo != null}">
						<img src="${pageContext.request.contextPath}/download?repertoire=photo.folder&nomDocDBA=${utilisateurCreer.photo}" alt="mon protrait" width="100" height="90">
						</c:if>

						</div>
						<div class="col-sm-4">
							<label for="divLab form-label" >Nom:</label> 
							<div class="divPro"> ${utilisateurCreer.sname} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Prénom:</label> 
							<div class="divPro">${utilisateurCreer.gname} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Date de naissance:</label> 
							<fmt:formatDate type="date" value="${utilisateurCreer.dob}" pattern="dd/MM/yyyy" var="dUser" />
							<div class="divPro">${dUser} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Lieu de naissanace:</label> 
							<div class="divPro">${utilisateurCreer.pob} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Nom d'utilisateur:</label> 
							<div class="divPro">${utilisateurCreer.username} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label"  >Gendre:</label> 
							<div class="divPro"> 
							<c:choose>
                                       <c:when test="${utilisateurCreer.gendre=='M'}">
                                                                          Masculin
                                       </c:when>
                                       <c:when test="${utilisateurCreer.gendre=='F'}">
                                                                           Féminin
                                        </c:when>
                             </c:choose>

							 </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Rang:</label> 
							<div class="divPro"> ${utilisateurCreer.position.rang} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Institution:</label> 
							<div class="divPro"> ${utilisateurCreer.institution.nomInstitution} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Numéro de téléphone:</label> 
							<div class="divPro"> ${utilisateurCreer.nomeroTelephone} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Email:</label> 
							<div class="divPro form-label"> ${utilisateurCreer.email} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Domicile:</label> 
							<div class="divPro"> ${utilisateurCreer.domicile} </div>
					 	</div>
					 			
				</div>

				<div class="row divRoles">
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Roles:</label> 
							<div class="divPro">  
									<c:forEach var="role" items="${ttRoles}">
									${role.name}
									</c:forEach>
						 	</div>
						</div>
				</div>
				
					<div> 
						<input type="hidden" name="usersId" id="usersId" value="${utilisateurCreer.usersId}">
					</div>
				
				
				
					<br /><hr />
					
					<div class="row">
								<div id="subBut" class="col-12">
						
								<input type="submit" value="Modifier" class="btn btn-success btn-xs" onClick="actionUtilisateur('M', ${utilisateurCreer.usersId} );"/>
								<input type="submit" value="Confirmer" class="btn btn-success btn-xs" onClick="confirmerUtilisateur(${utilisateurCreer.usersId});"/>
								 </div>
					</div>
  