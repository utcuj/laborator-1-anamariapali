package GaraW;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Test {

	public static void main(String[] args){
		
		List<Tren> trenuri= new ArrayList<Tren>();
		Tren t1= new Tren("Berlin","10:01",1);
		Tren t2= new Tren("Munchen","05:01",2);
		Tren t3= new Tren("Frankfurt","16:01",3);
		Tren t4= new Tren("Dusseldorf ","10:31",4);
		Tren t5= new Tren("Koln","13:01",5);
		trenuri.add(t1);
		trenuri.add(t2);
		trenuri.add(t3);
		trenuri.add(t4);
		trenuri.add(t5);
		Gara g= new Gara(trenuri);
		System.out.println("Inainte de sortare ");
		for(Tren temp: g.getTrenuri())
			System.out.println(temp.toString());
		Collections.sort(g.getTrenuri(), Comparators.ORA);
		System.out.println("Dupa sortare ");
		for(Tren temp: g.getTrenuri())
			
			System.out.println(temp.toString());
		new GUI(g);
		
		
}
}