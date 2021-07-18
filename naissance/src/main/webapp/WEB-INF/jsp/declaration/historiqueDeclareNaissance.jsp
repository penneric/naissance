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
						  
						  
						  			
						  			
							    	<c:forEach items="${ttHistorDeclarerNais}" var="hdeclarerNais"> 
							    		<tr> 
							    			
							    			<td>${hdeclarerNais.action}</td> 
							    			<td>${hdeclarerNais.dateEnregistre}</td> 
							    			<td>${hdeclarerNais.operation}</td> 
							    			
							    		</tr> 
							    
							    	</c:forEach> 
						  
						  
						
						 </tbody>
					
					</table>
</div>
