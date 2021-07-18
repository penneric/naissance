








/**
 *  This function is use to populate the divisions (departements),
 *  the sub-divisions (arrondissement), the instittution and the locality
 *   (localité) of a user
 * @param id (id de la région, departements, où l'arrondissement)
 * @param resultContainer (div qui affiche le contenu)
 * @param typeListe (le type de liste à afficher)
 * @returns
 */

function actionAfficheContenu( id, resultContainer, typeListe){	
	switch (typeListe){
	case "R":
		var url = "/utilisateur/afficher/departements?regionId=" +id;
		// alert (url + '  R   list of departements       ' + id);
		doGet( url, resultContainer);
		$('#select-actionArrond').load('/afficher/arron/utilisateur');
		$('#select-actionInstitut').load('/afficher/instit/utilisateur');
		$('#villeInstitution').load('/afficher/ville/instit/utilisateur');
		break;
	case "D":
		
		var url = "/utilisateur/afficher/arrondissements?departId=" +id;
		//alert (url + ' D    list of arrondissement       ' + id);
		doGet( url, resultContainer);
		$('#select-actionInstitut').load('/afficher/instit/utilisateur');
		$('#villeInstitution').load('/afficher/ville/instit/utilisateur');
		break;
	case "A":
		var url = "/utilisateur/afficher/institutions?arrondId=" +id;
		//alert (url + '  A   list of institutions       ' + id);
		doGet( url, resultContainer);
		$('#villeInstitution').load('/afficher/ville/instit/utilisateur');
		break;
	case "I":
		var url = "/utilisateur/afficher/localiteInstitution?institutionId=" +id;
		//alert (url + '  A    localité      ' + id);
		doGet( url, resultContainer);
		break;
		
		default:
	}


}






/**
 * This funciton is use to display a new user's form
 * @returns
 */

function nouveauUtilisateur(){
	//alert("*********myModal**********");

	var url = "/utilisateur/creer" ;
	var resultContainer = "contenu" ;
	var entete = "Page d'enregistrement" ;
	doGetOverlay(url, resultContainer, entete);

} 




/**
 * This function is use to display action content on the overlay
 * @param actionType
 * @param id
 * @returns
 */
function actionUtilisateur(actionType, id){
	var resultContainer = "contenu" ;
	var url="";
	var entete = "" ;
	
	switch (actionType){
	case "D":
		
		 //alert("********"+ actionType + "  ---  "+ id);
		
		url = "/afficher/detail/utilisateur?usersId=" + id;
		doGetOverlay(url, resultContainer, entete);
		// openNav("Page de Modification", "message modit","100%");
		break;
	case "M":
		var url = "/afficher/page/utilisateurModifier?usersId=" + id;
		// url = "/utilisateur/creer/departements" ;             	
		doGetOverlay(url, resultContainer, entete);
		// openNav("Page de Détail", "message de","100%");
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
				url = "/utilisateur/supprimer?usersId=" + id ;
				doPostSupprimer(url, resultContainer);

			});
		break;
	case "H":

		url = "/afficher/historique/utilisateur?usersId=" + id;
		doGetOverlay(url, resultContainer, "Historique");
		break;
	default:

	}

}




/**
 *  This is to collect information from the view to the controller
 */
function modifierUtilisateur(){
	
	let userFormData ="";
	userFormData += "sname=" + document.getElementById("sname").value;
	userFormData += "&gname=" + document.getElementById("gname").value;
	userFormData += "&pword=" + document.getElementById("pword").value;
	userFormData += "&usersId=" + document.getElementById("usersId").value;
	userFormData += "&dob=" + document.getElementById("dob").value;
	userFormData += "&pob=" + document.getElementById("pob").value;
	userFormData += "&position=" + document.getElementById("position").value;
	userFormData += "&gendre=" + document.getElementById("gendre").value;
	userFormData += "&email=" + document.getElementById("email").value;
	userFormData += "&username=" + document.getElementById("username").value;
	userFormData += "&institution=" + document.getElementById("select-actionInstitut").value;
	userFormData += "&isEnable=" + document.getElementById("isEnable").value;
	userFormData += "&nomeroTelephone=" + document.getElementById("nomeroTelephone").value;
	userFormData += "&domicile=" + document.getElementById("domicile").value;
	
	
	
	let allRoles = document.getElementsByName("roles");
    let roles = [];
        for (var i = 0; i < allRoles.length; i++) {
        if (allRoles[i].checked){
        	roles.push(allRoles[i].value);	
        }
    }

	
	userFormData += "&roles=" + roles;
	
	//alert(userFormData);
	
	console.log(userFormData);
	
	var url = "/utilisateur/modifier?" + userFormData;
	var resultContainer = "contenu";
	openNav("Page de validation", "", "80%");
	doPost(url, resultContainer);

}

/**
 * Collects data from the registration form and sends to the controller
 * @returns
 */


function createUserFormData(){

	if (verifyPwd()){
		
	
let userFormData ="";
	userFormData += "sname=" + document.getElementById("sname").value;
	userFormData += "&gname=" + document.getElementById("gname").value;
	userFormData += "&pword=" + document.getElementById("pword").value;
	userFormData += "&pwdconf=" + document.getElementById("pwdconf").value;
	userFormData += "&dob=" + document.getElementById("dob").value;
	userFormData += "&pob=" + document.getElementById("pob").value;
	userFormData += "&position=" + document.getElementById("position").value;
	userFormData += "&gendre=" + document.getElementById("gendre").value;
	userFormData += "&email=" + document.getElementById("email").value;
	userFormData += "&username=" + document.getElementById("username").value;
	userFormData += "&institution=" + document.getElementById("select-actionInstitut").value;
	userFormData += "&isEnable=" + document.getElementById("isEnable").value;
	userFormData += "&nomeroTelephone=" + document.getElementById("nomeroTelephone").value;
	userFormData += "&domicile=" + document.getElementById("domicile").value;
	
	
	let allRoles = document.getElementsByName("roles");
    let roles = [];
        for (var i = 0; i < allRoles.length; i++) {
        if (allRoles[i].checked){
        	roles.push(allRoles[i].value);	
        }
    }

	
	userFormData += "&roles=" + roles;
	
	//alert(userFormData);
	
	console.log(userFormData);
	
	var url = "/utilisateur/enregistre?" + userFormData;
	var resultContainer = "contenu";
	openNav("Page de validation", "", "80%");
	doPost(url, resultContainer);

	}else{
		swal("Entrez le même mot de passes de nouveau pour confirmation");
		return false;
	}
	
}

function verifyPwd(){
	let pwd1= document.getElementById("pword").value ;
	let pwd2= document.getElementById("pwdconf").value;
	if (pwd1.trim() === pwd1.trim()){
		alert("True");
		console.log("True!");
		return true;
		//break;
	}else{
		alert("false");
		return false;
		console.log("false!");
		//break;
		
	}
}


function confirmerUtilisateur(usersId){
	
	var url ="/utilisateur/confirmer?usersId=" + usersId;
	var resultContainer = "main_content";
	doPost(url, resultContainer);
	swal("Confirmé avec succès");
	closeNav();
	
	
}





/**
 * DoGet pour toutes les POST ajax
 */
function doPostSupprimer(url, resultContainer){

	var xmlHttp     =   getXMLHttp();
	xmlHttp.open("POST", url, true);
	xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
	xmlHttp.setRequestHeader("X-Requested-With", "XMLHttpRequest");
	
	xmlHttp.onreadystatechange = function(){
		//return error page if status code is not 200
		if(xmlHttp.status !== 200){
			console.log("ERROR!");
			$("#"+resultContainer).html(xmlHttp.responseText);
			return;
		}
		if(xmlHttp.readyState === 4 && xmlHttp.status === 200){
			//$("#loading").addClass("hide");
//			$("#"+ resultContainer).html(xmlHttp.responseText);
//			$("#"+resultContainer).removeClass("deactivate");
			
			var resultatResponse = xmlHttp.responseText;
			if (resultatResponse === "OK") {
				
				swal("Cette utilisateur est supprimé ");
				afficherTouteUtilisateur();

			}else{
				
				swal("Cet utilisateur ne peut être supprimé");
				afficherTouteUtilisateur();
			}
			
			
		}else{
			$("#"+resultContainer).html("ERROR 202");
		}
	};
	xmlHttp.send(null);
	
	
	//http.send(parameters);
	
}




function afficherTouteUtilisateur(){
	var resultContainer = "main_content" ;
	var url= "/utilisateur/affiche";
	doGet(url, resultContainer);
	
}


//
//$(document).ready(function () {
//	
//	$( ".datepicker01" ).datepicker( "option", "maxDate", new Date() );
//});
//







