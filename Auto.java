public class Auto extends VehiculoPasajeros{

    private String tipoCombustible;
    private int costoPorKm;
    public Auto(String marca, String modelo, int año, int kilometraje, int numPasajeros, String tipoCombustible,int costoPorKm) {
        super(marca, modelo, año, kilometraje, numPasajeros);
        this.tipoCombustible=tipoCombustible;
        this.costoPorKm=costoPorKm;
    }
    public String getTipoCombustible(){
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible){
        this.tipoCombustible=tipoCombustible;
    }
    public int getCostoPorKm(){
        return costoPorKm;
    }
    public void setCostoPorKm(int costoPorKm){
        this.costoPorKm=costoPorKm;
    }
    public int calcularCostoMantenimiento(int costoPorKm,int kilometraje){
return costoPorKm * kilometraje;
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("TipoCombustible "+tipoCombustible);
    }
    @Override
    public void realizarMantenimiento(){
        super.realizarMantenimiento();
        System.out.println("Se realizo un mantenimiento preventivo al carro liviano");
    }
    
}
