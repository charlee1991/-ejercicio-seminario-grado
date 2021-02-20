
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charlee
 */
public class TTrabajador {
    public static void main(String[] args) {
    // utilizando el objeto entrada obtendremos lo que el usuario ingrese por consola.
        Scanner entrada = new Scanner(System.in);
        // Creamos la lista en dónde serán almacenados los personas:
        ArrayList<persona> listaTrabajadores = new ArrayList<>();
        
        // El while será ejecutado hasta que salir sea TRUE.
        boolean salir = false;
        while (!salir) {   
            // Le indicamos al usuario cuales son sus opciones:
            System.out.println(" INGRESE LA OPCION ");
            System.out.println(" 1 - Agregar trabajador ");
            System.out.println(" 2 - Mostrar la lista de trabajadores");
            System.out.println(" 3 - Eliminar Trabajador ");
            System.out.println(" 4 - Modificar Trabajador ");
            System.out.println(" 0 - Salir ");
            
            // Obtenemos el numero ingresado por el usuario en la consola:
            int opcion = Integer.parseInt(entrada.nextLine());
           
            // Según el número que el usuario ingreso en la consola se ejecutará el "case" correspondiente.
            switch(opcion) {
                case 1: // "case" Ingresar nuevo persona
                    // Instanciamos un persona vacio (Sin atributos)
                    persona a = new persona();
                    System.out.println("Ingrese el nombre del trabajador:");
                    // Obtenemos la NombreIngresado que el usuario escribió y la guardamos en el trabajador.
                    a.setNombreIngresado(entrada.nextLine());
                    System.out.println("Ingrese ingrese el apellido del trabajador: ");
                    // De la misma forma, guardamos la Apellido
                    a.setApellido(entrada.nextLine());
                    //System.out.println("Ingrese color: ");
                    // guardamos el color que el usuario ingresó
                    //a.setColor(entrada.nextLine());
                    System.out.println("Ingrese el numero de documento");
                    // Y guardamos los litros de Identificacion
                    a.setIdentificacion(Integer.parseInt(entrada.nextLine()));

                    // Este paso es fundamental, tomamos el 1 (En este caso definido con la variable a),
                    // Y lo guardamos en la lista de personas utilizando el método de la lista .add(a);
                    listaTrabajadores.add(a);
                    
                    // Le avisamos al usuario del Trabajador creado
                    
                    System.out.println("El trabajador: ");
                    System.out.println("Nombre" + a.getNombre());
                    System.out.println("Apellido " + a.getApellido());
                    System.out.println("Identificacion " + a.getIdentificacion());
                    
                    break;
                case 2: // Listar todos los Trabajadadores ingresados en la lista:
                    // el for va a recorrer todos los elementos que estén almacenados en la lista.
                   for(int i = 0; i < listaTrabajadores.size(); i++){ // listaTrabajadores.size() Permite ver cuantos elementos hay guardados.
                       System.out.println("Trabajador N° " + (i + 1));
                       // Para obtener un elemento de la lista, utilizamos .get():
                       persona TraBajador =  listaTrabajadores.get(i); 
                       
                       System.out.println("Nombre: " + TraBajador.getNombre());
                       System.out.println("Apellido: " + TraBajador.getApellido());
                       System.out.println("Identificacion: " + TraBajador.getIdentificacion());
                       
                   }
                    
                    break;
                case 3: // ELiminar Trabajador de la lista
                    System.out.println("Ingreser el nombre del trabajador a eliminar: ");
                    String NombreIngresado = entrada.nextLine();
                    
                    for (int i = 0; i < listaTrabajadores.size(); i++) {
                        persona TraBajador = listaTrabajadores.get(i);
                        // buscamos cual de los nombres  en la lista coincide con lo que el usuario escribió:
                        if (NombreIngresado.equals(TraBajador.getNombre())) {
                            // Eliminamos un elemento de la lista utilizando .remove()
                            listaTrabajadores.remove(i);
                            System.out.println("Trabajador eliminado");
                        }
                    }
                    
                    break;
                case 4: // Modificar Trabajador:
                    System.out.println(" Ingrese el nombre del trabajador a modificar");
                    NombreIngresado = entrada.nextLine();
                   //aqui se modifican los datos
                    for (int i = 0; i < listaTrabajadores.size(); i++) {
                        persona TraBajador = listaTrabajadores.get(i);
                        if (NombreIngresado.equals(TraBajador.getNombre())) {
                            System.out.println("Apellido: " + TraBajador.getApellido());
                            System.out.println("Identificacion: " + TraBajador.getIdentificacion());
                            System.out.println("Ingrese nuevo Apellido: ");
                            String Apellido = entrada.nextLine();
                            System.out.println("Ingrese nuevo numero de identificacion: ");
                            String Identificacion = entrada.nextLine();;
                            
                            TraBajador.setColor(Identificacion);
                            TraBajador.setApellido(Apellido);
                            
                        }
                    }
                    break;
                case 0:// "case" Salir del programa
                    salir = true;
                    System.out.println("Saliendo del programa");
                    break;
                default: // En caso de que el numero ingresado no corresponda a ningún "case"
                    System.out.println("Opcion invalida!!!!!!!");
                
            }
        }
        
    
        
    }
}
