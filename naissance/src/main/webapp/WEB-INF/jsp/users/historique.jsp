<%@ page language="java" contentType="text/html; charset=UTF-8"     pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 


<div class="row table-responsive-md">
		
					<table id= "afficheTableGestion" class="table success afficheTableGestion">
						 <thead class="thead-light" >
						<tr class="enteteTableGestion">
							<th>Action</th>
							<th>Date d'enregistrement</th>
							<th>Operation</th>

					
						</tr>
						 </thead>
						  <tbody class="table-hover">
						  
						  
						  			<c:set var="i" value="1" /> 
						  			
							    	<c:forEach items="${ttHistorUtilisateur}" var="hUtilisateur"> 
							    		<tr> 
							    			
							    			<td>${hUtilisateur.action}</td> 
							    			<td>${hUtilisateur.dateEnregistre}</td> 
							    			<td>${hUtilisateur.operation}</td> 
							    			
							    		</tr> 
							    		<c:set var="i" value="${i+1}" /> 
							    	</c:forEach> 
						  
						  
						
						 </tbody>
					
					</table>
</div>
