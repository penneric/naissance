<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 

<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/sideMenuNav.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/style.bundle.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/pagelayout.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/GestionUtilisateur/tableGestion.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/Declaration/labelFormat.css"/> rel="stylesheet">



     					
					 <div class="row">
						<div class="col-sm-12 font-weight-bold text-center"> 
						<h3>Information de l'enfant</h3>
					</div>
					</div>
						 
						 
					<div class="row">
							 	<div class="col-6">
									<label for="snameEnfant" >Nom de l'enfant:</label>
									<div class="divPro"> ${declareNaissance.nomEnfant} </div>
					 			</div>
				
								<div class="col-6">
									<label for="gnameEnfant" >Prénoms de l'enfant:</label> 
									<div class="divPro">${declareNaissance.prenomEnfant} </div>
								 </div>
								
						</div>
						 <div class="row">
						 	<div class="col-6">
								 <label for="dobEnfant">Date de naissance de l'enfant:</label>
								<fmt:formatDate type="date" value="${declareNaissance.dateNaissanceEnfant}" pattern="dd/MM/yyyy" var="dEnfant" />
							<div class="divPro">${dEnfant}</div>
							</div>
							 
							<div class="col-6">
							<label for="pobEnfant">Lieu de naissance de l'enfant</label>
								<div class="divPro">${declareNaissance.lieuNaissanceEnfant} </div>
							</div>
							
						</div>
							
					
						 <div class="row">
						 		<div class="col-6">
									<label for="gendreEnfant">Gendre de l'enfant:</label>
							<div class="divPro"> 
							<c:choose>
                                       <c:when test="${declareNaissance.gendreEnfant=='M'}">
                                                                          Masculin
                                       </c:when>
                                       <c:when test="${declareNaissance.gendreEnfant=='F'}">
                                                                           Féminin
                                        </c:when>
                             </c:choose>

							 </div>
								</div>
						</div>
					<br /><hr />
					

					
					
					<div class="row font-weight-bold text-center"> 
						<div class="col">
						<h3>Information de la Mere</h2>
						</div>
						<div class="col">
						<h3>Information du Pere</h3>
						</div>
					</div><hr />
					
					<div class="row">
							<div class="col">
								<label for="snameMere" >Nom de la Mere:</label>
								<div class="divPro"> ${declareNaissance.nomMere} </div>
					 		</div>
							<div class="col">
									<label for="snamePere" >Nom du Pere:</label> 
									<div class="divPro"> ${declareNaissance.nomPere} </div>
					 		</div>
					</div>
					
					<div class="row">
							<div class="col-6">
								 <label for="dobMere">Date de naissance de la Mere:</label>
									<fmt:formatDate type="date" value="${declareNaissance.dateNaissanceMere}" pattern="dd/MM/yyyy" var="dMere" />
									<div class="divPro"> ${dMere} </div>
								</div>
							
							<div class="col-6">
								 <label for="dobPere">Date de naissance du Pere:</label>
									<fmt:formatDate type="date" value="${declareNaissance.dateNaissancePere}" pattern="dd/MM/yyyy" var="dPere" />
								<div class="divPro"> ${dPere} </div>
								</div>
					</div>
				
					<div class="row">
							<div class="col">
								<label for="pobMere" >Lieu de Naissance de la Mere:</label> 
								<div class="divPro"> ${declareNaissance.lieuNaissanceMere} </div>
					 		</div>
							<div class="col">
									<label for="pobPere" >Lieu de Naissance du Pere:</label>
								<div class="divPro"> ${declareNaissance.lieuNaissancePere} </div>
					 		</div>	
					
					</div>
					
					<div class="row">
							<div class="col">
								<label for="domicileMere" >Domicile de la Mere:</label>
								<div class="divPro"> ${declareNaissance.domicileMere} </div>
					 		</div>
							<div class="col">
									<label for="domicilePere" >Domicile du Pere:</label>
									<div class="divPro"> ${declareNaissance.domicilePere} </div>
					 		</div>	
					
					</div>
					
					
					<div class="row">
							<div class="col">
								<label for="profMere" >Profession de la Mere:</label> 
								<div class="divPro"> ${declareNaissance.professionMere} </div>
					 		</div>
							<div class="col">
									<label for="profPere" >Profession du Pere:</label> 
									<div class="divPro"> ${declareNaissance.professionPere} </div>
					 		</div>	
					
					</div>
					
					<div class="row">
							<div class="col">
								<label for="nationaliteMere" >Nationalité de la Mere:</label> 
								<div class="divPro"> ${declareNaissance.nationaliteMere} </div>
					 		</div>
							<div class="col">
									<label for="nationalitePere" >Nationalité du Pere:</label> 
									<div class="divPro"> ${declareNaissance.nationalitePere} </div>
					 		</div>	
					
					</div>
					
					<div class="row">
							<div class="col">
								<label for="docRefMere" >Document de reference de la Mere:</label> 
								<input type="file" class="form-control" name="docRefMere" id="docRefMere" />
					 		</div>
							<div class="col">
									<label for="docRefPere" >Document de reference du Pere:</label> 
									<input type="file" class="form-control" name="docRefPere" id="docRefPere" />
					 		</div>	
					
					</div>
					<hr />
					
					
					<div class="row">
							<div class="col">
								<label for="nomeroRefDeclaration" >N° de Ref. de Declaration:</label> 
								<div class="divPro"> ${declareNaissance.nomeroRefDeclaration} </div>
					 		</div>
					 		<div class="col">
								 <label for="dateSignatureAutoriteCompetent">Date de délivrance de Declaration:</label>
									<fmt:formatDate type="date" value="${declareNaissance.dateSignAutoriteCompetent}" pattern="dd/MM/yyyy" var="dDAC" /> 
							<div class="divPro"> ${dDAC} </div>
							</div>
							<div class="col">
									<label for="nomAutoriteCompetent" >Nom de l'Authorité Compentent:</label> 
									<div class="divPro"> ${declareNaissance.nomAutoriteCompetent} </div>
					 		</div>	
					
					</div>
					
					
					
					<br /><hr />
					
					<div class="row">
								<div id="subBut" class="col-12">
						
								<input type="submit" value="Modifier" class="btn btn-success btn-xs" onClick="actionDeclarationNaissance('M',${declareNaissance.declarId});"/>
								<input type="submit" value="Confirmer" class="btn btn-success btn-xs" onClick="validerAfficherTouteDeclaration(${declareNaissance.declarId});"/>
								 </div>
					</div>
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					 
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/bootstrap-datepicker.min.js"/>		type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/declaration/declarationControl.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/regFormValidation.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/laison.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/jquery-3.5.1.min.js"/> 	 type="text/javascript"></script>
