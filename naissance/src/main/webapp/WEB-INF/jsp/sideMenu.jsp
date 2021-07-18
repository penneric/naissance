<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

    
	
	<ul class="mainNavMenu" id="navMenu">
		<li onclick="openMenuItem('/connecteSucces/pageA');">Page d&apos;accueil</li>
		
		<li class="menuUt" id="menuUtil">Utilisateur</li>
		<ul class="subNavMenu" id="subNavmenuUtil">
			<li onclick="openMenuItem('/utilisateur/affiche');">Gestion d&apos;utilisateur</li>
			
		</ul>
		<li class="menuUt" id="menuDecl">Déclaration</li>
			<ul class="subNavMenu" id="subNavmenuDecl">
			<li onclick="openMenuItem('/gestion/declaration/naissance');">Gestion de déclaration</li>
			</ul>
			
		<li class="menuUt" id="menuProd">Production</li>
			<ul class="subNavMenu" id="subNavmenuProd">
			<li onclick="openMenuItem('/acte/produire');">Gestion de Production</li>
			</ul>
			
		
	</ul>
	
	