<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EDT MIAGE</title>
</head>
<body>
<center>
<h1>Bienvenue sur la modification de l'EDT</h1>

<form action="ControllerPrincipal">
	<INPUT type='submit' value='pageCreationCreneau'>
</form>
<a href="../controller/ControllerPrincipal">Ajouter un créneau</a>
<a href="/ControllerPrincipal&action=pageSuppressionCreneau">Supprimer un créneau</a>
<a href="/ControllerPrincipal&action=pageModificationCreneau">Modificer un créneau</a>
<a href="../index.html">Visualiser l'emploi du temps</a>
</center>
</body>
</html>
