/**
 * 
 */
$(document).ready(function(){

	
	$("#btnCheckPwd").click(function(){
		if($(this).prop("checked") == true){
			
			$("#password").attr("type", "text");
          //  console.log("Checkbox is checked.");
            
        } else 	if($(this).prop("checked") == false){
        	
        	$("#password").attr("type", "password");
             //console.log("Checkbox is unchecked.");
         }
		
	});

});


