package TPO-Concurrente.Entidades;

public class Visitante {
    private final String nombre;
    private int fichas;

    public Visitante(String n){
        this.nombre= n;
        this.fichas= 0;
    }

    public String getNombre(){
        return this.nombre;
    }

    public int getFichas(){
        return this.fichas;
    }
}
