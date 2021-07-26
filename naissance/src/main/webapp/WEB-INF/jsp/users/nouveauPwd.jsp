<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>



<div >
<label labelFor="current-password">Mot de passe actuel:</label>
<input type="password" class="form-control current-password" id="current-password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
	 title="Doit contenir au moins un chiffre et une lettre majuscule et minuscule, et au moins 8 caractères" required>
</div>



<div >
<label labelFor="new-password">Nouveau mot de passe:</label>
<input type="password" class="form-control new-password" id="new-password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
title="Doit contenir au moins un chiffre et une lettre majuscule et minuscule, et au moins 8 caractères" required>
</div>


<div >
<label labelFor="confirm-password">Confirmer mot de passe:</label>
<input type="password" class="form-control confirm-password" id="confirm-password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" 
	title="Doit contenir au moins un chiffre et une lettre majuscule et minuscule, et au moins 8 caractères"	required>
</div>
<div >
<label labelFor="usersId"></label>
<input type="hidden" class="form-control usersId" id="usersId" value="${utilisateur.usersId}"  required>
</div>

<div class="row justify-content-center" >

<button onclick="modifierMotDePasseUtilisateur();" class="btn btn-success btn-xs  " id="butEnregistrer">Enregistrer</button>
</div>