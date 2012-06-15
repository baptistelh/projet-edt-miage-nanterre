package beansUtilisation;

import java.util.GregorianCalendar;

import beans.*;

public class test {
	
	public static void main(String args []){
		
		Enseignant e1=new Enseignant(1,"Aragou", "muriel", "1 avenue du meilleur des tuteurs" , "0143855907",new GregorianCalendar(1960,10, 10), "logAragou", "pwdAragou");	
		Salle s1=new Salle("210A", 50, "enferNum1");
		Formation F1=new Formation();
		UE ue1=new UE(1,F1);
		EC ec1= new EC(1, ue1, F1);
		Type type1 = new Type(1, "TD"); 
		Creneau cLundi = new Creneau(e1, s1, ec1,type1, "09:00", 2);
		Jours j1=new Jours();
		j1.setDate(new GregorianCalendar(2012, 05, 11));
		cLundi.setDate(j1);		
	}

}
