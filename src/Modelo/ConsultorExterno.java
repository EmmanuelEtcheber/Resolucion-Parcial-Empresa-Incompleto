package Modelo;

public final class ConsultorExterno extends AgenteExterno   {
    private int duracionContrato;
    private String proyecto;

    public ConsultorExterno(int id, String departamento, String activo, String nombre, String apellido, String empresaPrestadora, double montoACobrar, int duracionContrato) {
        super(id, nombre, apellido, empresaPrestadora, montoACobrar);
        this.duracionContrato = duracionContrato;
        proyecto = "Sin asignar";
    }

    public int getDuracionContrato() {
        return duracionContrato;
    }

    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }



    @Override
    public String toString() {
        return "ConsultorExterno{" +
                super.toString() +
                "duracionContrato=" + duracionContrato +
                '}';
    }
}
