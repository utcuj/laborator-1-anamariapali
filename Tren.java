package GaraW;
public class Tren implements Comparable<Tren>{
 private String destinatie;
  String ora;
 private int cod;
 
public Tren(String destinatie, String ora, int cod) {
	super();
	this.destinatie = destinatie;
	this.ora = ora;
	this.cod = cod;
}

public String getDestinatie() {
	return destinatie;
}
public void setDestinatie(String destinatie) {
	this.destinatie = destinatie;
}
public String getData() {
	return ora;
}
public void setData(String ora) {
	this.ora = ora;
}
public int getCod() {
	return cod;
}
public String getTren(int codT) {
	if(codT==this.cod)
		return this.toString();
	return "Nu a fost gasit";
	
}
public void setCod(int cod) {
	this.cod = cod;
}
@Override
public String toString() {
    return "Tren "+cod + ":" + " ora: "+ora +" destinatie: "+ destinatie;
}

@Override
public int compareTo(Tren ora) {
	// TODO Auto-generated method stub
	return Comparators.ORA.compare(this, ora);
}
}
