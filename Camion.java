public class Camion extends VehiculoCarga {
private int numejes;
    public Camion(String marca, String modelo, int año, int kilometraje, int capacidadCarga,int numejes) {
        super(marca, modelo, año, kilometraje, capacidadCarga);
        this.numejes=numejes;
    }
    public int getNumejes(){
        return numejes;
    }

    public void setnumejes(int numejes){
        this.numejes=numejes;
    }
@Override
public void mostrarInfo() {
    super.mostrarInfo();
     System.out.println("numero de ejes"+ numejes);
}
@Override
    public void realizarMantenimiento(){
        super.realizarMantenimiento();
        System.out.println("Se realizo un mantenimiento correctivo al carro pesado");
    }



}



