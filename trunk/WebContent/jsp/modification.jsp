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
<%@ page import="java.util.List"%> 
<%@ page import="java.util.ArrayList"%>
<%@ page import="beans.Enseignant"%>
<%@ page import="beans.EC"%>
<%@ page import="beans.Salle"%>
<%@ page import="beans.Formation"%>
<%@ page import="beans.UE"%>
<%@ page import="beans.Type"%>
<%
List<Enseignant> es=(List<Enseignant>)(request.getAttribute("listEnseignants"));
List<EC> ecs=(List<EC>)(request.getAttribute("listEC"));
List<Salle> salles=(List<Salle>)(request.getAttribute("listSalles"));
List<Formation> fs=(List<Formation>)(request.getAttribute("listFormations"));
List<Type> ts=(List<Type>)(request.getAttribute("listTypes"));

%>



<TABLE BORDER="1">
  <CAPTION> Sélection du créneau à modifier</CAPTION>
  <FORM METHOD=GET ACTION='ControllerPrincipal'>
  <TR>
 <TH> Nom Enseignant  </TH>
 <TD> <SELECT name="nom_enseignant">
<%int i;
for (i=0;i<es.size();i++){ %>
<OPTION Value= "<%=es.get(i).getNumeroEnseignant() %>"><%=es.get(i).getNom().concat(" ".concat(es.get(i).getPrenom())) %>
<%} %>
</SELECT>  </TD>
  </TR>
 <TR>
 <TH> EC </TH>
 <TD> <SELECT name="EC">
<%for (i=0;i<ecs.size();i++){ %>
<OPTION Value= "<%=ecs.get(i).getNumeroEC() %>"><%=ecs.get(i).getLibelle() %>
<%} %>
</SELECT>  </TD>
  </TR>
  <TR>
 <TH> Date JJ/MM/AAAA </TH>
 <TD> 
 <input type="text" value='' name="date" /> </TD>
  </TR>
  <TR>
 <TH> Duree en minutes </TH>
 <TD> <INPUT type='text' value='' name='duree'> </TD>
  </TR>
  <TR>
 <TH> Horaire HH:MM </TH>
 <TD> <INPUT type='text' value='' name='horaire'> </TD>
  </TR>
  <TR>
 <TH> Type </TH>
<TD> <SELECT name="Type">
 <%for (i=0;i<ts.size();i++){ %>
<OPTION  Value= "<%=ts.get(i).getNumeroType()%>"> <%=ts.get(i).getLibelle()%>
<%} %>
</SELECT>  </TD>
  </TR>
  <TR>
 <TH> Salle </TH>
<TD> <SELECT name="salle">
<%for (i=0;i<salles.size();i++){ %>
<OPTION Value= "<%=salles.get(i).getNumeroSalle() %>"><%=salles.get(i).getNumeroSalle().concat(" ".concat(salles.get(i).getLieu())) %>
<%} %>
</SELECT>  </TD>
  </TR>
  
  <TR>
 <TH> Formation  </TH>
 <TD> <SELECT name="formation">
<%for (i=0;i<fs.size();i++){ %>
<OPTION Value= "<%=fs.get(i).getNumeroFormation() %>"><%=fs.get(i).getLibelle()%>
<%} %>
</SELECT>  </TD>
  </TR>
  
  
  <TR>
  <TD>
  <INPUT type='submit' name='action'value='MAJCreneau'>
  </TD>
  </TR>
</FORM>
</TABLE> 
</body>
</html>
