
document.addEventListener("DOMContentLoaded",function(){

    document.getElementById("slideOpen").addEventListener('click',function(){

        document.getElementById("slideMenu").style.width = "25%";
        document.getElementById("slideMenu").style.transition = "width .5s ease-in-out";
        document.getElementById("slideMenu").style.display = "inline";
        document.getElementById("main").style.marginLeft = "25%";
        document.getElementById("main").style.width = "75%";
        document.getElementById("main").style.opacity = "0.5";
    
    },false)
    
    document.getElementById("slideClose").addEventListener('click',function(){
    
        document.getElementById("slideMenu").style.width = "0";
        document.getElementById("main").style.marginLeft = "0";
        document.getElementById("main").style.width = "100%";
    	document.getElementById("main").style.opacity = "1";
    	
    },false)

});



