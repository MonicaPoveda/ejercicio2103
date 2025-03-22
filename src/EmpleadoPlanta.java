public class EmpleadoPlanta extends Empleado{
private double salariofijo;

    public EmpleadoPlanta() {
    }

    public EmpleadoPlanta(String nombre, int edad, double salariofijo) {
        super(nombre, edad);
        this.salariofijo = salariofijo;
    }

    public double getSalariofijo() {
        return salariofijo;
    }

    public void setSalariofijo(double salariofijo) {
        this.salariofijo = salariofijo;
    }

    @Override
    public String toString() {
        return super.toString()+"EmpleadoPlanta{" +
                "salariofijo=" + salariofijo;
    }

    public void mostrarinformacion(){
        setSalariofijo(21000000);
        super.mostarinformacion();
    System.out.println("su salario es"+salariofijo);
}
}
