package test;

public class Auto{
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static String cantidadCreados;

    int cantidadAsientos(){
        int cant = 0;
        for (Asiento asiento : asientos) {
            if (!(asiento == null)) {
                cant += 1;
            }
        }
        return cant;
    };

    String verificarIntegridad(){
        boolean ver= true;
        for (Asiento as : asientos) {
            if (as!=null) {
                 if (!(as.registro == this.registro)) {
                ver = false;
            }
            }
        }
        if (ver && (motor.registro == this.registro)) {
            return "Auto original";
        }
        return "Las piezas no son originales";
    }
}