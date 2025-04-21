package vehiculos;

import java.util.Scanner;

public class TestVehiculos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Concesionario concesionario = new Concesionario();
        int opc;
        do {
            System.out.println("""
                    CONCESIONARIO
                    =============
                    1. Dar de alta una bicicleta
                    2. Eliminar vehículo por matrícula
                    3. Listar inventario
                    4. Salir
            """);
            opc = scan.nextInt();
            scan.nextLine();
            switch (opc) {
                case 1: {
                    System.out.print("Matrícula: ");
                    String mat = scan.nextLine();
                    System.out.print("Marca: ");
                    String marca = scan.nextLine();
                    System.out.print("Modelo: ");
                    String modelo = scan.nextLine();
                    System.out.print("Color: ");
                    String color = scan.nextLine();
                    Bicicleta bici = new Bicicleta(mat, marca, modelo, color);
                    if (concesionario.alta(bici)) {
                        System.out.println("Vehículo añadido correctamente.\n");
                    } else {
                        System.out.println("Ya existe un vehículo con esa matrícula.\n");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Matrícula a eliminar: ");
                    String mat = scan.nextLine();
                    if (concesionario.baja(mat)) {
                        System.out.println("Vehículo eliminado\n");
                    } else {
                        System.out.println("No se encontró esa matrícula\n");
                    }
                    break;
                }
                case 3: {
                    if (concesionario.getStock().isEmpty()) {
                        System.out.println("Inventario vacío.\n");
                    } else {
                        System.out.println("Inventario ordenado:");
                        for (Vehiculo v : concesionario.getStock()) {
                            System.out.println(v);
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Hasta luego!");
                    break;
                }
                default: {
                    System.out.println("Opción no válida.\n");
                    break;
                }
            }
        } while (opc != 4);
        scan.close();
    }
}