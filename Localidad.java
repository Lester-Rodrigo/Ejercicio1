public class Localidad {
    private String nombre;
    private int espacio;
    private int costo;

    public Localidad( int espacio, int costo, String nombre){
        this.nombre = nombre;
        this.costo = costo;
        this.espacio = espacio;
    }

    public int getEspacio(){
        return espacio;
    }

    public void setEspacio(int espacio){
        this.espacio = espacio;
    }

    public int getCosto(){
        return costo;
    }

    public String getNombre(){
        return nombre;
    }
}
