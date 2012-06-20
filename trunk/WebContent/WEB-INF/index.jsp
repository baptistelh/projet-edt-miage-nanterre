<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EDT MIAGE</title>
</head>
<body>
<h1>Bienvenue sur la modification de l'EDT</h1>

<FORM METHOD=POST ACTION='http://localhost:8080/TD2_Servlets/Convertisseur'>
Nom Enseignant 
<INPUT type='text' value='' name='nom_enseignant'><br>
EC
<INPUT type='text' value='' name='EC'><br>
Date JJ/MM/AAAA
<INPUT type='text' value='' name='date'><br>
Duree en minutes
<INPUT type='text' value='' name='duree'><br>
Horaire HH:MM
<INPUT type='text' value='' name='horaire'><br>
Type
<INPUT type='text' value='' name='type'><br>
Salle
<INPUT type='text' value='' name='salle'><br>
<INPUT type='submit' value='creer'><br>
</FORM>
</body>
</html>
