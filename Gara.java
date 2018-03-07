package GaraW;

import java.util.List;
import java.util.ArrayList;

public class Gara {
 List<Tren> trenuri= new ArrayList<Tren>();



public Gara(List<Tren> trenuri) {
	super();
	this.trenuri = trenuri;
}
public List<Tren> getTrenuri() {
	return trenuri;
}

public void setTrenuri(List<Tren> trenuri) {
	this.trenuri = trenuri;
}
}
