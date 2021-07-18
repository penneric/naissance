<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/Declaration/labelFormat.css"/> rel="stylesheet">


							<div class="col-sm-4">
									Information de l'enfant
							</div>
					<div class="row form-group">
					
							<div class="col-sm-4">
							<label for="divLab form-label" >Nom de l'enfant:</label> 
							<div class="divPro"> ${declarerNais.nomEnfant} </div>
					 		</div>
							
							<div class="col-sm-4">
							<label for="divLab form-label" >Prénoms de l'enfant:</label> 
							<div class="divPro">${declarerNais.prenomEnfant} </div>
					 		</div>
					 		
							<div class="col-sm-4">
							<label for="divLab form-label" >Date de naissance de l'enfant:</label> 
							<fmt:formatDate type="date" value="${declarerNais.dateNaissanceEnfant}" pattern="dd/MM/yyyy" var="dEnfant" />
							<div class="divPro">${dEnfant}</div>
					 		</div>
					 		
					 		
					 		<div class="col-sm-4">
							<label for="divLab form-label" >Lieu de naissance de l'enfant</label> 
							<div class="divPro">${declarerNais.lieuNaissanceEnfant} </div>
					 		</div>
						
						
								
								<div class="col-sm-4">
							<label for="divLab form-label"  >Gendre de l'enfant:</label> 
							<div class="divPro"> 
							<c:choose>
                                       <c:when test="${declarerNais.gendreEnfant=='M'}">
                                                                          Masculin
                                       </c:when>
                                       <c:when test="${declarerNais.gendreEnfant=='F'}">
                                                                           Féminin
                                        </c:when>
                             </c:choose>

							 </div>
					 	</div>
					
					</div>
						<hr />
						
						<div class="col-sm-4">
									Information de la Mere
						</div>
						
						
					<div class="row form-group">
					
						<div class="col-sm-4">
							<label for="divLab form-label" >Nom de la Mere:</label> 
							<div class="divPro"> ${declarerNais.nomMere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Date de naissance de la Mere:</label> 
							<fmt:formatDate type="date" value="${declarerNais.dateNaissanceMere}" pattern="dd/MM/yyyy" var="dMere" />
							<div class="divPro"> ${dMere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Lieu de naissance de la Mere:</label> 
							<div class="divPro"> ${declarerNais.lieuNaissanceMere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Domicile de la Mere:</label> 
							<div class="divPro"> ${declarerNais.domicileMere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Profession de la Mere:</label> 
							<div class="divPro"> ${declarerNais.professionMere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Nationalité de la Mere:</label> 
							<div class="divPro"> ${declarerNais.nationaliteMere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Document de Reference de la Mere:</label> 
							<div class="divPro"> ${declarerNais.docRefMere} </div>
					 	</div>
					
					
					
					</div>	
					 	<hr />
					 	
						<div class="col-sm-4">
									Information du Pere
						</div>
						
						
					<div class="row form-group">
					
						<div class="col-sm-4">
							<label for="divLab form-label" >Nom du Pere:</label> 
							<div class="divPro"> ${declarerNais.nomPere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Date de naissance du Pere:</label> 
							<fmt:formatDate type="date" value="${declarerNais.dateNaissancePere}" pattern="dd/MM/yyyy" var="dPere" />
							<div class="divPro"> ${dPere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Lieu de naissance du Pere:</label> 
							<div class="divPro"> ${declarerNais.lieuNaissancePere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Domicile du Pere:</label> 
							<div class="divPro"> ${declarerNais.domicilePere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Profession du Pere:</label> 
							<div class="divPro"> ${declarerNais.professionPere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Nationalité du Pere:</label> 
							<div class="divPro"> ${declarerNais.nationalitePere} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Document de Reference du Pere:</label> 
							<div class="divPro"> ${declarerNais.docRefPere} </div>
					 	</div>
					
					
					
					</div>	 	

					 	
					 
<hr />
						
						
					<div class="row form-group">
					
						<div class="col-sm-4">
							<label for="divLab form-label" >N° de Reference de Declaration:</label> 
							<div class="divPro"> ${declarerNais.nomeroRefDeclaration} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Nom Autorité Competent:</label> 
							<div class="divPro"> ${declarerNais.nomAutoriteCompetent} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Date de Signature d'Autorité Competent:</label>
							<fmt:formatDate type="date" value="${declarerNais.dateSignAutoriteCompetent}" pattern="dd/MM/yyyy" var="dDAC" /> 
							<div class="divPro"> ${dDAC} </div>
					 	</div>
					 	<div class="col-sm-4">
							<label for="divLab form-label" >Statue:</label> 
							<div class="divPro"> ${declarerNais.statueDeclaration} </div>
					 	</div>
					 	
					
					
					</div>		
					 	
					 	
					 	
					 	
					 	
					 	
					 	
					 	
					 	
					 	