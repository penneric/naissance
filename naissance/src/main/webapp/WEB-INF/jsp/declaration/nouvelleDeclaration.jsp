<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/sideMenuNav.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/style.bundle.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/pagelayout.css"/> rel="stylesheet">
<link href=<c:url value="${pageContext.request.contextPath}/resources/static/css/GestionUtilisateur/tableGestion.css"/> rel="stylesheet">

		
				<div id="mges" class="mges col-sm-12">
				
				</div>

				 <form class="form-group text-left " id="frmDeclarationNaissance" accept-charset="utf-8" action="#" method="POST" enctype="multipart/form-data" modal="">
					
					
					 <div class="row">
						<div class="col-sm-12 font-weight-bold text-center"> 
						<h3>Information de l'enfant</h3>
					</div>
					</div>
						 
						 
					<div class="row">
							 	<div class="col-6">
									<label for="snameEnfant" >Nom de l'enfant:</label>
									<input type="text" class="form-control" name="snameEnfant" id="snameEnfant" required/>
					 			</div>
				
								<div class="col-6">
									<label for="gnameEnfant" >Prénoms de l'enfant:</label> 
									<input type="text" class="form-control" name="gnameEnfant" id="gnameEnfant" required/>
								 </div>
								
						</div>
						 <div class="row">
						 	<div class="col-6">
								 <label for="dobEnfant">Date de naissance de l'enfant:</label>
									<input type="text" class="datepicker01 form-control"  name="dobEnfant" id="dobEnfant" required 
									placeholder="dd/mm/YYYY"/>
							</div>
							 
							<div class="col-6">
							<label for="pobEnfant">Lieu de naissance de l'enfant</label>
							<input type="text" class="form-control" name="pobEnfant" id="pobEnfant" required "/>
							</div>
							
						</div>
							
					
						 <div class="row">
						 		<div class="col-6">
									<label for="gendreEnfant">Gendre de l'enfant:</label>
										<select name="gendreEnfant" id="gendreEnfant" class="form-control" required>
											<option value="">selection un</option>
											<option value="M">Masculin</option>
											<option value="F">Féminin</option>	
										</select>
								</div>
						</div>
					<br /><hr />
					
					<div class="row">
							<div class="col">
								<label for="nomeroRefDeclaration" >N° de Reference de Declaration:</label> 
								<input type="text" class="form-control" name="nomeroRefDeclaration" id="nomeroRefDeclaration" required/>
					 		</div>
					 		<div class="col">
								 <label for="dateSignatureAutoriteCompetent">Date de délivrance de Declaration:</label>
									<input type="text" class="datepicker01 form-control"  name="dateSignatureAutoriteCompetent" id="dateSignatureAutoriteCompetent" required 
									placeholder="dd/mm/YYYY" />
							</div>
							<div class="col">
									<label for="nomAutoriteCompetent" >Nom de l'Authorité Compentent:</label> 
									<input type="text" class="form-control" name="nomAutoriteCompetent" id="nomAutoriteCompetent" required />
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
								<input type="text" class="form-control" name="snameMere" id="snameMere" required/>
					 		</div>
							<div class="col">
									<label for="snamePere" >Nom du Pere:</label> 
									<input type="text" class="form-control" name="snamePere" id="snamePere"  />
					 		</div>
					</div>
					
					<div class="row">
							<div class="col-6">
								 <label for="dobMere">Date de naissance de la Mere:</label>
									<input type="text" class="datepicker01 form-control"  name="dobMere" id="dobMere" required 
									placeholder="dd/mm/YYYY" />
								</div>
							
							<div class="col-6">
								 <label for="dobPere">Date de naissance du Pere:</label>
									<input type="text" class="datepicker01 form-control"  name="dobPere" id="dobPere"  
									placeholder="dd/mm/YYYY" />
								</div>
					</div>
				
					<div class="row">
							<div class="col">
								<label for="pobMere" >Lieu de Naissance de la Mere:</label> <input type="text" class="form-control" name="pobMere" id="pobMere" required/>
					 		</div>
							<div class="col">
									<label for="pobPere" >Lieu de Naissance du Pere:</label> <input type="text" class="form-control" name="pobPere" id="pobPere" />
					 		</div>	
					
					</div>
					
					<div class="row">
							<div class="col">
								<label for="domicileMere" >Domicile de la Mere:</label> <input type="text" class="form-control" name="domicileMere" id="domicileMere" required/>
					 		</div>
							<div class="col">
									<label for="domicilePere" >Domicile du Pere:</label> <input type="text" class="form-control" name="domicilePere" id="domicilePere" />
					 		</div>	
					
					</div>
					
					
					<div class="row">
							<div class="col">
								<label for="profMere" >Profession de la Mere:</label> <input type="text" class="form-control" name="profMere" id="profMere" required/>
					 		</div>
							<div class="col">
									<label for="profPere" >Profession du Pere:</label> <input type="text" class="form-control" name="profPere" id="profPere" />
					 		</div>	
					
					</div>
					
					<div class="row">
							<div class="col">
								<label for="nationaliteMere" >Nationalité de la Mere:</label> <input type="text" class="form-control" name="nationaliteMere" id="nationaliteMere" required/>
					 		</div>
							<div class="col">
									<label for="nationalitePere" >Nationalité du Pere:</label> <input type="text" class="form-control" name="nationalitePere" id="nationalitePere" />
					 		</div>	
					
					</div>
					
					<div class="row">
							<div class="col">
								<label for="docRefMere" >Document de reference de la Mere:</label> <input type="file" class="form-control" name="docRefMere" id="docRefMere" />
					 		</div>
							<div class="col">
									<label for="docRefPere" >Document de reference du Pere:</label> <input type="file" class="form-control" name="docRefPere" id="docRefPere" />
					 		</div>	
					
					</div>
					<hr />
					
					
					<div class="row">
								<div id="subBut" class="col-12">
						
								<input type="submit" value="Enregistre" class="btn btn-success btn-xs" onClick="dataNouvelleDeclaration(-2);"/>
								<input type="reset" value="Annuler" class="btn btn-success btn-xs" />
								 </div>
					</div>
					
					
					
	
	
	
	
	
	
	
	
	
	
	
					
				</form>
				
				
				
				
				
				
				
				
				
			
				
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/bootstrap-datepicker.min.js"/>		type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/declaration/declarationControl.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/regFormValidation.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/utility/laison.js"/> 	 type="text/javascript"></script>
<script src=<c:url value="${pageContext.request.contextPath}/resources/static/js/jquery-3.5.1.min.js"/> 	 type="text/javascript"></script>
  