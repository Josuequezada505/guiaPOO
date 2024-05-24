public class Guiapoo {
  public static void main(String[] args) throws Exception{
    
Auto auto = new Auto("Toyota" , "corolla " ,2020,15000,  5,"Gasolina",15);

Camion camion = new Camion("Volvo", "FH", 2019, 75000, 20000, 4);

System.out.println("informacion del auto");
auto.mostrarInfo();
auto.realizarMantenimiento();
auto.calcularCostoMantenimiento(15, 25);


System.out.println("\ninformacion del camion");
camion.mostrarInfo();
camion.realizarMantenimiento();


  }  
}
