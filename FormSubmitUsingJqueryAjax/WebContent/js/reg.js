$(document).ready(function(){
  $("#mybtn").click(function(){
	 var n=$("#name").val();
	 var e=$("#email").val();
	 var p=$("#pass").val();
	 var r=$("#role").val();
	 
	 if(n==""){
		 alert("Please enter name");
		 $("#name").focus().css("border-color","red");
	 }else if(e==""){
		 alert("Please enter email");
		 $("#email").focus().css("border-color","red");
	 }else if(p==""){
		 alert("Please enter password");
		 $("#pass").focus().css("border-color","red");
	 }else if(r=="Select Role"){
		 alert("Please select role");
		 $("#role").focus().css("border-color","red");
	 }else{
		 $.post("register",{
			 name:n,
			 email:e,
			 pass:p,
			 role:r,
		 },function(result){
			 alert(result);
		 });
		 
	 }
  });
});