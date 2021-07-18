<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>



<div class="row">
	<div class="col-sm-9">
	</div>
</div>
<div class="row">

	<div class="col-sm-9">
	
	<h3>Liste des Dossiers Déclarer</h3>
	
	</div>
	<div class="col-sm-3">
			
			<input type="submit" id="nouvDeclarationNais" class="btn  btn-success btn-xs" value="Nouvelle Déclaration" onClick="nouvelleDeclaration()">
	</div>
</div>
<div class="row">
	<div class="col-sm-12">
	</div>
</div>
<div class="row table-responsive-md">
		
					<table id= "afficheTableGestion" class="table success afficheTableGestion">
						 <thead class="thead-light" >
						<tr class="enteteTableGestion">
							<th>Réference</th>
							<th>Nom de l'enfant</th>
							<th>Prénom de l'enfant</th>
							<th>Date de déclaration de Naissance</th>
							<th>Statue</th>
							<th>Action</th>
					
						</tr>
						 </thead>
						 
						  <tbody class="table-hover">
						  
						  
						  			<c:set var="i" value="1" /> 
						  			
							    	<c:forEach items="${ttDeclarNais}" var="declareNais"> 
							    		<tr> 
							    			
							    			<td>${declareNais.nomeroRefDeclaration}</td> 
							    			<td>${declareNais.nomEnfant}</td> 
							    			<td>${declareNais.prenomEnfant}</td> 
							    			<td>${declareNais.dateSignAutoriteCompetent}</td> 
							    			<td>${declareNais.statueDeclaration}</td> 
							    			<td>
							    				<select name="actionUtilisateur">
							    						<option value="">Sélectionnez un</option>
							    						<option value="${declareNais.declarId}"  onclick="actionDeclarationNaissance('D', ${declareNais.declarId})">Détails</option>
							    						<option value="${declareNais.declarId}"  onclick="actionDeclarationNaissance('M', ${declareNais.declarId} )">Modifier</option>
<%-- 							    						<option value="${declareNais.declarId}"  onclick="actionDeclarationNaissance('V', ${declareNais.declarId} )">Valider</option> --%>
							    						<option value="${declareNais.declarId}" onclick="actionDeclarationNaissance('S', ${declareNais.declarId})">Supprimer</option>
							    						<option value="${declareNais.declarId}"  onclick="actionDeclarationNaissance('H', ${declareNais.declarId})">Historique</option>
							    				
							    				</select>
											</td>
							    		</tr> 
							    	
							    	</c:forEach> 
						  
						  
						
						 </tbody>

					
					</table>
</div>
