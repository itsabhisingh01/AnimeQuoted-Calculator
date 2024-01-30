<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jujutsu Calculator</title>

<style>
body {
  font-size: 40px;
  text-align:center;
  background: linear-gradient(to right,  #2b40ff,#07121a);
}

h1,h3{
color: white;
margin:15px;
}
input, button {
  font-size:40px;
  color: white;
  border-radius: 5%;
  background-color: black;
  border: 2px solid white;
}

img{
width:30%;
height:30%;
margin-top: 20px;
}
img:hover{
  -ms-transform: scale(1.1); /* IE 9 */
  -webkit-transform: scale(1.1); /* Safari 3-8 */
   transform: scale(1.1); 
}
</style>

</head>
<body>

<img src="giphy 2.gif">
<h1>Jujutsu kaisen quotes!</h1>
<h3><%=request.getParameter("quotes")%> </h3>
<form action="Mycalculator">

<input name = "num1" placeholder = "First Number"> 
<input name = "num2" placeholder = "Second Number"> 

<button name = "bt1" value = "1"> + </button>
<button name = "bt1" value = "2"> - </button>
<button name = "bt1" value = "3"> * </button>
<button name = "bt1" value = "4"> / </button>

</form>
<h3>Ans = <%=request.getParameter("ans")%> </h3>
</body>
</html>