<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div class="row">
	<div class="col-sm-9">
	</div>
</div>
<div class="row">

	<div class="col-sm-9">
	
	<h3>Liste des utilisateurs</h3>
	
	</div>
	<div class="col-sm-3">
			
			<input type="submit" id="nouvUtilisateur" class="btn  btn-success btn-xs" value="Nouveau Utilisateur" onClick="nouveauUtilisateur()">
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
							<th>Nom</th>
							<th>Prénoms</th>
							<th>Rang</th>
							<th>Institution</th>
							<th>Email</th>
							<th>Action</th>
					
						</tr>
						 </thead>
						  <tbody class="table-hover">
						  
						  
						  			<c:set var="i" value="1" /> 
						  			
							    	<c:forEach items="${toutsUtilisateur}" var="tUtilisateur"> 
							    		<tr> 
							    			
							    			<td>${tUtilisateur.sname}</td> 
							    			<td>${tUtilisateur.gname}</td> 
							    			<td>${tUtilisateur.position.rang}</td> 
							    			<td>${tUtilisateur.institution.nomInstitution}</td> 
							    			<td>${tUtilisateur.email}</td> 
							    			<td>
							    				<select name="actionUtilisateur">
							    						<option value="">Sélectionnez un</option>
							    						<option value="${tUtilisateur.usersId}"  onclick="actionUtilisateur('D', ${tUtilisateur.usersId});">Détails</option>
							    						<option value="${tUtilisateur.usersId}"  onclick="actionUtilisateur('M', ${tUtilisateur.usersId} );">Modifier</option>
							    						<option value="${tUtilisateur.usersId}" onclick="actionUtilisateur('S', ${tUtilisateur.usersId});">Supprimer</option>
							    						<option value="${tUtilisateur.usersId}"  onclick="actionUtilisateur('H', ${tUtilisateur.usersId});">Historique</option>
							    				
							    				</select>
											</td>
							    		</tr> 
							    		<c:set var="i" value="${i+1}" /> 
							    	</c:forEach> 
						  
						  
						
						 </tbody>
					
					</table>
</div>
