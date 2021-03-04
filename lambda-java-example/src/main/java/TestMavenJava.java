import java.util.ArrayList;
import java.util.List;

public class TestMavenJava {

	
	public static class Stock{
		private int Cantidad;
		
		private Stock (int cantidad){
		Cantidad = cantidad;
	}

	}
	class Eggs{
		
		int quantity;
		
		Eggs(int Quantity){
			this.quantity=Quantity;
		}
	}

	public static void main(String[] args){
		
	/*List<StockHuevos> StockHuevos = new ArrayList<StockHuevos>();*/


	List<List<Integer>> ListaHuevos = new ArrayList<List<Integer>>();

	for(int i =0; i<= 2; i++){
	            ListaHuevos.add(new ArrayList<Integer>());
	        }

	ListaHuevos.get(0).add(50);
	ListaHuevos.get(0).add(70);
	ListaHuevos.get(0).add(30);
	ListaHuevos.get(0).add(55);
	ListaHuevos.get(0).add(80);

	ListaHuevos.get(1).add(60);
	ListaHuevos.get(1).add(60);
	ListaHuevos.get(1).add(10);
	ListaHuevos.get(1).add(50);
	ListaHuevos.get(1).add(0);

	ListaHuevos.get(2).add(20);
	ListaHuevos.get(2).add(70);
	ListaHuevos.get(2).add(35);
	ListaHuevos.get(2).add(0);
	ListaHuevos.get(2).add(50);




	for (int i = 0; i <= ListaHuevos.get(0).size() - 1; i++) {
	    System.out.println("Cantidad Grupo 1: " + ListaHuevos.get(0).get(i) + " Cantidad de Grupo2 : "
	            + ListaHuevos.get(1).get(i) + " Cantidad Grupo3: " + ListaHuevos.get(2).get(i)
	    );
	}

	}
}
