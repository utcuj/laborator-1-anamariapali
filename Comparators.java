package GaraW;
import java.util.Comparator;

public class Comparators {
	 public static Comparator<Tren> ORA = new Comparator<Tren>() {
         @Override
         public int compare(Tren t1, Tren t2) {
             return t1.ora.compareTo(t2.ora);
         }
	 };
}
