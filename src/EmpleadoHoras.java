public class EmpleadoHoras extends Empleado{
    protected double pagohoras;
    protected double horastrabajadas;

    public EmpleadoHoras() {
    }

    public EmpleadoHoras(String nombre, int edad, double pagohoras, double horastrabajadas) {
        super(nombre, edad);
        this.pagohoras = pagohoras;
        this.horastrabajadas = horastrabajadas;
    }

    public double getPagohoras() {
        return pagohoras;
    }

    public void setPagohoras(double pagohoras) {
        this.pagohoras = pagohoras;
    }

    public double getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(double horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    @Override
    public String toString() {
        return "EmpleadoHoras{" +
                "pagohoras=" + pagohoras +
                ", horastrabajadas=" + horastrabajadas +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }


    public void mostrarinformacion(){
        setPagohoras(98000);
        super.mostarinformacion();
        System.out.println("sus horas trabajadas son"+horastrabajadas);
        System.out.println("SU PAGO ES DE"+pagohoras);
    }
}
