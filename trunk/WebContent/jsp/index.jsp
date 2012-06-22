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
<%@ page import="java.util.*"%> 
<%@ page import="java.util.ArrayList"%>
<%@ page import="dao.EnseignantDAO"%>;
<%@ page import="beans.Enseignant"%>;
<%
Enseignant e1=new Enseignant(1,"Aragou", "muriel", "1 avenue du meilleur des tuteurs" , "0143855907",new GregorianCalendar(1960,10, 10), "logAragou", "pwdAragou");	
Enseignant e2=new Enseignant(1,"Giroud", "Olivier", "1 avenue des coupeurs d'orange" , "0143855908",new GregorianCalendar(1960,10, 10), "logGiroud", "pwdGiroud");	
Enseignant e3 = new Enseignant(2, "Girard", "Renï¿½", "2 rue des champs ï¿½lysï¿½s" , "0123456789", new GregorianCalendar(1978,7, 2), "Girard", "pwdGirard");
//List<Enseignant> enseignants = new EnseignantDAO().findAll();
List<Enseignant> enseignants = new ArrayList<Enseignant>();
enseignants.add(e1);
enseignants.add(e2);
enseignants.add(e3);
%>



<TABLE BORDER="1">
  <CAPTION> Formulaire d'ajout de créneau </CAPTION>
  <FORM METHOD=POST ACTION='http://localhost:8080/fr.p10.miage.m1.projetedt/nom_de_la_servlet'>
  <TR>
 <TH> Nom Enseignant  </TH>
 <TD> <SELECT name="nom_enseignant" size="1">
<%int i;
for (i=0;i<enseignants.size();i++){ %>
<OPTION><%=enseignants.get(i) %>
<%} %>
</SELECT>  </TD>
  </TR>
 <TR>
 <TH> EC </TH>
 <TD> <INPUT type='text' value='' name='EC'> </TD>
  </TR>
  <TR>
 <TH> Date JJ/MM/AAAA </TH>
 <TD> <INPUT type='text' value='' name='date'> </TD>
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
 <TD> <INPUT type='text' value='' name='type'> </TD>
  </TR>
  <TR>
 <TH> Salle </TH>
 <TD> <INPUT type='text' value='' name='salle'> </TD>
  </TR>
  <TR>
  <TD>
  <INPUT type='submit' value='creer'>
  </TD>
  </TR>
</FORM>
</TABLE> 
</body>
</html>
