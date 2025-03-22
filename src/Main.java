import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<Empleado> lstempleado = new ArrayList<>();
        List<Empleado> lstempleado2 = new ArrayList<>();

        boolean estado=true;
        do {
            System.out.println(
                    """
                              **-***-REGISTRO EMPLEADOS*-*-*-*-
                             1. REGISTRO EMPLEADOS DE PLANTA  
                             2. REGISTRO EMPLEADOS POR HORAS
                             3. CALCULAR SALARIO
                             4. MOSTRAR TODOS LOS EMPLEADOS REGISTRADOS
                             5.SALIR
                             *-**-*-*-*-*-*--*-*--*-**--*--**-*-*-*-**-
                            """);
            int op = teclado.nextInt();
            switch (op) {
                case 1 -> {
                    System.out.println("CREAR EMPLEADO DE PLANTA");
                    System.out.println("INGRESE SU NOMBRE");
                    String nombre = teclado.next();
                    System.out.println("INGRESE SU EDAD");
                    int edad = teclado.nextInt();
                    int sueldo = 2100000;

                    lstempleado.add(new EmpleadoPlanta(nombre, edad, sueldo));

                }
                case 2 -> {
                    System.out.println("CREAR EMPLEADO POR HORAS");
                    System.out.println("INGRESE SU NOMBRE");
                    String nombre = teclado.next();
                    System.out.println("INGRESE SU EDAD");
                    int edad = teclado.nextInt();
                    System.out.println("CUANTAS HORAS TRABAJO");
                    int horastrabajadas = teclado.nextInt();

                    double salariototal = horastrabajadas * 98000;

                    lstempleado2.add(new EmpleadoHoras(nombre, edad, salariototal, horastrabajadas));
                }

                case 3 -> {
                    System.out.println("CALCULAR EL SALARIO DE LOS EMPLEADOS");
                    System.out.println("DE QUIEN QUIERE CALCULAR EL SALARIO:   1. EMPLEADO PLANTA 2. EMPLEADO POR HORAS");
                    int opc = teclado.nextInt();
                    switch (opc) {
                        case 1 -> {
                            System.out.println("INGRESE EL NOMBRE DEL EMPLEADO");
                            String nombreempleado = teclado.next();
                            boolean usuarioesta = false;
                            for (Empleado cu : lstempleado) {
                                if (cu.getNombre().equalsIgnoreCase(nombreempleado)) {
                                    System.out.println(cu);
                                    usuarioesta = true;
                                }
                            }
                            if (!usuarioesta) {
                                System.out.println("USUARIO NO ESTA REGISTRADO");
                            }
                        }
                        case 2 -> {
                            System.out.println("INGRESE EL NOMBRE DEL EMPLEADO");
                            String nombreempleado = teclado.next();
                            boolean usuarioesta = false;

                            for (Empleado cu : lstempleado2) {
                                if (cu.getNombre().equalsIgnoreCase(nombreempleado)) {
                                    System.out.println(cu);
                                    usuarioesta = true;
                                }
                            }
                            if (!usuarioesta) {
                                System.out.println("USUARIO NO ESTA REGISTRADO");
                            }

                        }
                    }
                }
                    case 4 -> {
                            System.out.println("QUE EMPLEADOS QUIERE VER.   1. EMPLEADOS PLANTA 2. EMPLEADOS POR HORAS");
                            int resp = teclado.nextInt();
                            switch (resp){
                                case 1 -> {
                                    System.out.println(lstempleado);
                                }
                                case 2 -> {
                                    System.out.println(lstempleado2);
                                }
                            }
                        }
                        case 5 -> {
                            estado = false;
                            System.out.println("*-*-*-SALIENDO *-*-*");
                        }
                    }
        }while (estado) ;

    }
}