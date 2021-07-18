/**
 *   /enregistre/modifier/declaration
 */   
/**
 * 
 * @returns
 */

function nouvelleDeclaration(){
	//alert("*********myModal**********");

	var url = "/nouvelleDeclaration" ;
	var resultContainer = "contenu" ;
	var entete = "Page de Declaration" ;
	doGetOverlay(url, resultContainer, entete);

}


function validerAfficherTouteDeclaration(declarId){

	var url = "/valider/nouvelle/declaration?declarId=" + declarId;
	var resultContainer = "main_content" ;
	closeNav();
	doGet(url, resultContainer);
	swal("Validé avec succès");
	
}

function dataNouvelleDeclaration(declarId){
	
//	alert("************dataFormDecla********" + declarId);
	
	var dataFormDecla ="";
	var url = "";
	var resultContainer = "contenu";
	var entete = "Page de Validation";
	var message ="";
	
		dataFormDecla = "snameEnfant=" + document.getElementById("snameEnfant").value;
		dataFormDecla+= "&gnameEnfant=" + document.getElementById("gnameEnfant").value;
		dataFormDecla+= "&dobEnfant=" + document.getElementById("dobEnfant").value;
		dataFormDecla+= "&pobEnfant=" + document.getElementById("pobEnfant").value;
		dataFormDecla+= "&gendreEnfant=" + document.getElementById("gendreEnfant").value;
		dataFormDecla+= "&snameMere=" + document.getElementById("snameMere").value;
		dataFormDecla+= "&profMere=" + document.getElementById("profMere").value;
		dataFormDecla+= "&dobMere=" + document.getElementById("dobMere").value;
		dataFormDecla+= "&pobMere=" + document.getElementById("pobMere").value;
		dataFormDecla+= "&domicileMere=" + document.getElementById("domicileMere").value;
		dataFormDecla+= "&nationaliteMere=" + document.getElementById("nationaliteMere").value;
		dataFormDecla+= "&docRefMere=" + document.getElementById("docRefMere").value;
		dataFormDecla+= "&snamePere=" + document.getElementById("snamePere").value;
		dataFormDecla+= "&profPere=" + document.getElementById("profPere").value;
		dataFormDecla+= "&dobPere=" + document.getElementById("dobPere").value;
		dataFormDecla+= "&pobPere=" + document.getElementById("pobPere").value;
		dataFormDecla+= "&domicilePere=" + document.getElementById("domicilePere").value;
		dataFormDecla+= "&nationalitePere=" + document.getElementById("nationalitePere").value;
		dataFormDecla+= "&docRefPere=" + document.getElementById("docRefPere").value;
		dataFormDecla+= "&nomeroRefDeclaration=" + document.getElementById("nomeroRefDeclaration").value;
		dataFormDecla+= "&nomAutoriteCompetent=" + document.getElementById("nomAutoriteCompetent").value;
		dataFormDecla+= "&dateSignatureAutoriteCompetent=" + document.getElementById("dateSignatureAutoriteCompetent").value;   
		
		if (declarId ==-2){
			
		//	alert("******" + dataFormDecla + " \n************** " + declarId); 
			
			url = "/enregistre/nouvelle/declaration?" + dataFormDecla;
			
			 openNav(entete, message, "80%");
			 doPost(url, resultContainer);
			
		}else{

			dataFormDecla+= "&declarId=" + declarId;
			
			//alert("******" + "editing" + " \n**************" + declarId);
			
			url = "/enregistre/modifier/declaration?" + dataFormDecla;
			 entete = "Page de Modification" ;
			openNav(entete, message, "80%");
			doPost(url, resultContainer);
		}	

}


function afficherTouteDeclaration(){
	var resultContainer = "main_content" ;
	var url= "/gestion/declaration/naissance";
	doGet(url, resultContainer);
	
}



function actionDeclarationNaissance(actionType, id){
	var resultContainer = "contenu" ;
	var url="";
	var entete = "" ;
	
	//alert("********"+ actionType + "  ---  "+ id);  
	switch (actionType){
	case "D":
		
		url = "/afficher/detail/declaration/naissance?declarId=" + id;
		doGetOverlay(url, resultContainer, entete);
		
		break;
	case "M":
		
		url ="/modifier/declaration/naissance?declarId=" + id;
		doGetOverlay(url, resultContainer, entete);
		
		break;
		
	case "V":
		
		url = "/valider/nouvelle/declaration?declarId=" + id;
		doGetOverlay(url, resultContainer, "Confirmer");
		break;
		
	case "S":
		
		swal({
			  title: "",
			  text: "Voulez-vous supprimer cet enregistrement?",
			  type: "warning",
			  showCancelButton: true,
			  confirmButtonClass: "btn-danger",
			  cancelButtonText: "Non",
			  confirmButtonText: "Oui",
			  closeOnConfirm: false
			},
			function(){
			  
				var resultContainer = "main_content" ;
				url = "/supprimer/declaration/naissance?declarId=" + id;	
				doGetSuprimer(url, resultContainer);

			});
	

		break;
	case "H":
		
		url = "/afficher/historique/declaration/naissance?declarId=" + id;
		
		doGetOverlay(url, resultContainer, "Historique");
		break;

	default:

	}

}



/**
 * DoGet pour toutes GET ajax
 */
function doGetSuprimer(url, resultContainer){
	
	var xmlHttp     =   getXMLHttp();

	xmlHttp.open("GET", url, false);
	xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
	xmlHttp.setRequestHeader("X-Requested-With", "XMLHttpRequest");
	
	xmlHttp.onreadystatechange = function(){
		//return error page if status code is not 200
		if(xmlHttp.status !== 200){
			console.log("ERROR!");

			$("#"+resultContainer).html(xmlHttp.responseText);
			$("#"+resultContainer).removeClass("deactivate");

			return;
		}
		if(xmlHttp.readyState === 4 && xmlHttp.status === 200){
	
			var resultatResponse = xmlHttp.responseText;
			
			if (resultatResponse === "VALIDER"){
				
				swal("Cette déclaration ne peut être supprimée");
				
				afficherTouteDeclaration();
				
			}else{
				(resultatResponse === "OK")
				swal("Cette déclaration est supprimée");
				//alert("Cette déclaration est supprimée");
				
				afficherTouteDeclaration();
			}

		}else{
			$("#"+resultContainer).html("ERROR 202");
		}
	};
	xmlHttp.send(null);


}













