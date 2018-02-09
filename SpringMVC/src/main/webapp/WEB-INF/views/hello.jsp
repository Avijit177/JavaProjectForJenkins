<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script type="text/javascript">
		function myFunction(){
			var xhttp = new XMLHttpRequest();
			  xhttp.onreadystatechange = function() {
			    if (this.readyState == 4 && this.status == 200) {
			     document.getElementById("demo").innerHTML+= this.responseText;
			    }
			  };
			  xhttp.open("GET", "http://localhost:8080/SpringMVC/ajax", true);
			  xhttp.send();
		}
	</script>
</head>
<body>
<h1>
	HelloWeb!  
</h1>

<P> ${message} </P>
<input type="text" onkeyup="myFunction()"/>

<p id="demo"></p>

</body>
</html>
