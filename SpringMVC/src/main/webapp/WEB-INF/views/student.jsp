<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	HelloWeb!  
</h1>

<P> ${message} </P>

<form action="studentAdd" method="POST" > 

<P> Name: <input type="text" name="name" placeholder="enter name"></P>
<P> Id: <input type="number" name="id" placeholder="enter id"> </P>
 <P> Age: <input type="number" name="age" placeholder="enter age"> </P>
<P>  E-Mail: <input type="text" name="mail" placeholder="enter mail" > </P>


<P> <input type="submit" value="sumbit" >  </P>


</form>

</body>
</html>
