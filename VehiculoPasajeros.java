public class VehiculoPasajeros extends Vehiculo{

    private int numPasajeros;

    public VehiculoPasajeros(String marca, String modelo, int año, int kilometraje, int numPasajeros) {
        super(marca, modelo, año, kilometraje);//manipulacion de mi clase vehiculo
        this.numPasajeros= numPasajeros;
    }

    public int getNumPasajeros(){
        return numPasajeros;
    }
    public void setNumPasajeros(int numPasajeros){
        this.numPasajeros= numPasajeros;
    }
    //Sobreescritura de metodos
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Numero de Pasajeros: "+ numPasajeros);
    }
}
