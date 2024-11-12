package test; 

public class Asiento {
    public String color;
    public int precio;
    public int registro;

    void  cambiarColor(String coloro){
        String[] colores = new String[5];
        colores[0] = "rojo"; colores[1]="verde"; colores[2]="amarillo";colores[3]="negro";colores[4]="blanco";
        if (coloro.equals(colores[0]) || (coloro.equals(colores[1]))||(coloro.equals(colores[2]))||(coloro.equals(colores[3]))||(coloro.equals(colores[4]))) {
            this.color = coloro;
        }
    }
}