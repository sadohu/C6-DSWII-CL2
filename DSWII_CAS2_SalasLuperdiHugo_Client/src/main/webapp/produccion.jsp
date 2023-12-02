<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bono por produccion</title>
</head>

<style>
.form {
	width: 200px;
	margin: 0 auto;
	display: flex;
	flex-direction: column;
	align-items: center;
	gap: 0.725rem;
	text-align: center;
}
</style>

<body bgcolor="#c5dec9">

	<h1 align="center">Consumiendo Web Services</h1>
	<!-- FORMULARIO -->
	<form method="post" action="ProduccionControler" class="form">
		<div>
			<label for="capacidadDisco">Produccion Lunes</label> <input
				type="text" id="day1" name="day1">
		</div>

		<div>
			<label for="capacidadDisco">Produccion Martes</label> <input
				type="text" id="day2" name="day2">
		</div>

		<div>
			<label for="capacidadDisco">Produccion Miércoles</label> <input
				type="text" id="day3" name="day3">
		</div>

		<div>
			<label for="capacidadDisco">Produccion Jueves</label> <input
				type="text" id="day4" name="day4">
		</div>

		<div>
			<label for="capacidadDisco">Produccion Viernes</label> <input
				type="text" id="day5" name="day5">
		</div>

		<div>
			<label for="capacidadDisco">Produccion Sábado</label> <input
				type="text" id="day6" name="day6">
		</div>


		<input type="submit" value="Enviar producción">
	</form>

	<!-- ESPACIO PARA MOSTRAR LA RESPUESTA -->
	<%
		String resultado=(String) request.getAttribute("bono");
		String total=(String) request.getAttribute("total");
		String res="" ;
		String srtTotal="" ;
		if (resultado !=null)
			res = resultado; 
		if (total != null)
			srtTotal=total; 
		%>

	<h3 align="center">
		<%="Produccion total: " + srtTotal + " unidades."%>
	</h3>
	<h3 align="center">
		<%="Mensaje: " + res%>
	</h3>

</body>
</html>