public class Bvendidos {
    private int brestantes;
    private int btotales;

    public Bvendidos(int brestantes, int btotales){
        this.brestantes = brestantes;
        this.btotales = btotales;
    }

    public int getBrestantes(){
        return brestantes - btotales;
    }
}
