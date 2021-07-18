/**
 * author eric
 */


/**
 * open a menu link in the main content
 * @param url
 * @param mainContent
 * @returns
 */

function openMenuItem(url, mainContent="main_content"){
	doGet(url, mainContent);
	//alert(url);
}

function submitForm(url, mainContent="main_content"){
	doPost(url, mainContent);
	//alert(url);
}


//Browser Support Code
/*
 *Ce fichier contient les foctions succeptibles d'être utilisées dans plusieurs modules
 */

/**
 * 
 * @returns {ActiveXObject|XMLHttpRequest|Boolean}
 * 
 * Returns the XMLHttp DOM Object
 */
function getXMLHttp(){
	var xmlHttp = false;
	try{
		//try to get request object for IE 5 or later
		xmlHttp = new ActiveXObject("Msxml2.XMLHTTP");
	}catch(e){
		//get request object for earlier versions of IE.
		try{
			xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
		}catch(e){

		}
	}	

	if(!xmlHttp && typeof XMLHttpRequest !== 'undefined'){
		xmlHttp = new XMLHttpRequest();
	}

	return xmlHttp;
}   

/**
 * DoGet pour toutes GET ajax
 */
function doGet(url, resultContainer){
	
	var xmlHttp     =   getXMLHttp();

	xmlHttp.open("GET", url, false);
	xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
	xmlHttp.setRequestHeader("X-Requested-With", "XMLHttpRequest");
	
	xmlHttp.onreadystatechange = function(){
		//return error page if status code is not 200
		if(xmlHttp.status !== 200){
			console.log("ERROR!");

			//document.getElementById("main_content").innerHTML = xmlHttp.responseText;

			$("#"+resultContainer).html(xmlHttp.responseText);
			$("#"+resultContainer).removeClass("deactivate");

			return;
		}
		if(xmlHttp.readyState === 4 && xmlHttp.status === 200){
			//$("#loading").addClass("hide");

			//   document.getElementById("main_content").innerHTML = xmlHttp.responseText;
			$("#"+resultContainer).html(xmlHttp.responseText);
			$("#"+resultContainer).removeClass("deactivate");


		}else{
			$("#"+resultContainer).html("ERROR 202");


		}
	};
	xmlHttp.send(null);


}

/**
 * DoGet pour toutes les POST ajax
 */
function doPost(url, resultContainer){

//	
//	var url = "FetchSomeData.jsp";
//	var parameters = "name=krishna&age=16";
//
	
	
	var xmlHttp     =   getXMLHttp();
	xmlHttp.open("POST", url, true);
	xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
	xmlHttp.setRequestHeader("X-Requested-With", "XMLHttpRequest");
	
//	http.setRequestHeader("Content-length", parameters .length);
//	http.setRequestHeader("Connection", "close");

	
	
	xmlHttp.onreadystatechange = function(){
		//return error page if status code is not 200
		if(xmlHttp.status !== 200){
			console.log("ERROR!");
			$("#"+resultContainer).html(xmlHttp.responseText);
			return;
		}
		if(xmlHttp.readyState === 4 && xmlHttp.status === 200){
			//$("#loading").addClass("hide");
			$("#"+ resultContainer).html(xmlHttp.responseText);
			$("#"+resultContainer).removeClass("deactivate");
		}else{
			$("#"+resultContainer).html("ERROR 202");
		}
	};
	xmlHttp.send(null);
	
	
	//http.send(parameters);
	
}




//
//function submitCredential(){
//
//	let username= document.getElementById("username").value
//	let password= document.getElementById("password").value
//
//	let url= "${pageContext.request.contextPath}/seConnecter"
//
//
//		alert ("yes ..." + username +  ". /seConnecter........" + password);
//
//	doPost(url, main_header);
//
//
//}             


//
//
//function delete_file_application(id){
//	var idvalue = "div-file-block-"+id;
//	var list=document.getElementById(idvalue);
//	//we delete the file block  except if it is the first block of the first row
//	if(list != undefined && list != null){
//		if(list.parentNode.getAttribute("id") == "div-file-row-0" && idvalue == "div-file-block-0"){
//			swal.fire(
//					'Not Allowed!',
//					'you can not delete this element ! please edit it instead ! ',
//					'error'
//			)
//			return;
//
//		}else{
//			list.parentNode.removeChild(list);
//		}
//
//		var elementsInsideRow = list.parentNode.getElementsByClassName('col-xl-3 file upload-block-margins-application-block');
//
//		if(elementsInsideRow == 0 ){
//			//we delete the row except if it is the first row !!! prolem here
//			if(list.parentNode.getAttribute("id") != "div-file-row-0" ){
//				// we delete the row 
//				var idrow= "div-file-row-"+id;
//				var rowToDelete=document.getElementById(idrow);
//				rowToDelete.parentNode.removeChild(rowToDelete);
//			}
//
//		}
//		setFilesId();
//	}
//
//}       




//This is to upload a picture from the view to the controller

function submitPicture(){
	alert("True");
	
}

function addImgButton() {
	  var x = document.createElement("INPUT");
	  x.setAttribute("type", "file");
	  x.setAttribute("accept", "image/*");
	  document.body.appendChild(x);
	}



/**
 * Submit image to the server
 * @param imageId
 * @param name
 * @returns
 */
function uploadFile(fileId,name,entity){
	var formData = new FormData();
	var xmlHttp     =   getXMLHttp();
	var url = $("#baseUrl").val()+"/file/upload";
	if(document.getElementById(fileId).files.length==0){
		return;
	}

	formData.append("file",document.getElementById(fileId).files[0]);
	formData.append("name",name);
	formData.append("entity",entity);
	xmlHttp.open("POST", url, false);
	xmlHttp.send(formData);
}

/**
 * This function is use to display the overlay
 * @param entete
 * @param message
 * @param width
 * @returns Overlay
 */

function openNav(entete, message, width) {
	//pour le test
	//var message =  "<h5>Je suis entrain de lire le tuto sur javascript, et je vois ca :innerH TML permet de récupérer le code HTML enfant un élément sous forme de texte.Le fonctionnement de textContent est le même qu innerHTML excepté le fait que seul le texte est récupéré Je suis entrain de lire le tuto sur javascript, et je vois ca :innerH TML permet de récupérer le code HTML enfant un élément sous forme de texte.Le fonctionnement de textContent est le même qu innerHTML excepté le fait que seul le texte est récupéré Je suis entrain de lire le tuto sur javascript, et je vois ca :innerH TML permet de récupérer le code HTML enfant un élément sous forme de texte.Le fonctionnement de textContent est le même qu innerHTML excepté le fait que seul le texte est récupéré Je suis entrain de lire le tuto sur javascript, et je vois ca :innerH TML permet de récupérer le code HTML enfant un élément sous forme de texte.Le fonctionnement de textContent est le même qu innerHTML excepté le fait que seul le texte est récupéré Je suis entrain de lire le tuto sur javascript, et je vois ca :innerH TML permet de récupérer le code HTML enfant un élément sous forme de texte.Le fonctionnement de textContent est le même qu innerHTML excepté le fait que seul le texte est récupéré Je suis entrain de lire le tuto sur javascript, et je vois ca :innerH TML permet de récupérer le code HTML enfant un élément sous forme de texte.Le fonctionnement de textContent est le même qu innerHTML excepté le fait que seul le texte est récupéré Je suis entrain de lire le tuto sur javascript, et je vois ca :innerH TML permet de récupérer le code HTML enfant un élément sous forme de texte.Le fonctionnement de textContent est le même qu innerHTML excepté le fait que seul le texte est récupéré Je suis entrain de lire le tuto sur javascript, et je vois ca :innerH TML permet de récupérer le code HTML enfant un élément sous forme de texte.Le fonctionnement de textContent est le même qu innerHTML excepté le fait que seul le texte est récupéré Je suis entrain de lire le tuto sur javascript, et je vois ca :innerH TML permet de récupérer le code HTML enfant un élément sous forme de texte.Le fonctionnement de textContent est le même qu innerHTML excepté le fait que seul le texte est récupéré Je suis entrain de lire le tuto sur javascript, et je vois ca :innerH TML permet de récupérer le code HTML enfant un élément sous forme de texte.Le fonctionnement de textContent est le même qu innerHTML excepté le fait que seul le texte est récupéré Je suis entrain de lire le tuto sur javascript, et je vois ca :innerH TML permet de récupérer le code HTML enfant un élément sous forme de texte.Le fonctionnement de textContent est le même qu innerHTML excepté le fait que seul le texte est récupéré<h5>";

	// Get the modal
	var modal = document.getElementById("myModal");
	var span = document.getElementsByClassName("close")[0];
	modal.style.display = "block";
	// }
	var title = document.getElementById("title").innerHTML = entete;
	var contenu = document.getElementById("contenu").innerHTML = message;
	let modalContent=document.querySelector(".modal-content");
	if (window.matchMedia("(max-width: 768px)").matches) {
		modalContent.style.maxWidth="100%";
	}else modalContent.style.maxWidth=width;

	// When the user clicks on <span> (x), close the modal
	span.onclick = function() {
		modal.style.display = "none";
	}
	// When the user clicks anywhere outside of the modal, close it
	/* window.onclick = function(event) {
        	      if (event.target == modal) {
        	        modal.style.display = "none";
        	      }
        	    }*/
}

function closeNav(){
	var modal = document.getElementById("myModal");
	modal.style.display = "none";
	
}


/**
 *  This function is use to display content on a an overlay
 * @param url
 * @param resultContainer
 * @param entete
 * @returns
 */

function doGetOverlay(url, resultContainer, entete){

	var xmlHttp     =   getXMLHttp();

	xmlHttp.open("GET", url, false);
	xmlHttp.setRequestHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
	xmlHttp.setRequestHeader("X-Requested-With", "XMLHttpRequest");
	xmlHttp.onreadystatechange = function(){
		//return error page if status code is not 200
		if(xmlHttp.status !== 200){
			console.log("ERROR!");

			//document.getElementById("main_content").innerHTML = xmlHttp.responseText;

			$("#"+resultContainer).html(xmlHttp.responseText);
			$("#"+resultContainer).removeClass("deactivate");

			return;
		}
		if(xmlHttp.readyState === 4 && xmlHttp.status === 200){

			//   document.getElementById("main_content").innerHTML = xmlHttp.responseText;
			//  	$("#"+resultContainer).html(xmlHttp.responseText);
			//  var contentF =$("#"+resultContainer).html(xmlHttp.responseText);
			var contentF ="";

			openNav(entete,  contentF ,"70%");

			//  openNav(entete,  $("#"+resultContainer).html(xmlHttp.responseText)  ,"80");
			$("#"+resultContainer).html(xmlHttp.responseText);
			$("#"+resultContainer).removeClass("deactivate");

		}else{
			$("#"+resultContainer).html("ERROR 202");
		}
	};
	xmlHttp.send(null);
}



	
	$(".datepicker01").datepicker({
		 timepicker:false,
		 datepicker: true,
		 value: "21-01-1982",
	    format: "dd/mm/yyyy",
	    weeks: true,

	});












