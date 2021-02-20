/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Charlee
 */
public class persona {
    
private String Apellido;
    private String NombreIngresado;
    private String color;
    private int NumerodeIdentificacion;
    
    // Este constructor nos permite crear un persona sin ningún atributo.
    public persona(){}
        
    // Este constructor nos permite crear un persona el cual va a contener inmediatamente
    // todas sus variables asignadas.
    public persona(String Apellido, String NombreIngresado, String color, int NumerodeIdentificacion
    ){
        this.Apellido = Apellido;
        this.NombreIngresado = NombreIngresado;
        this.color = color;
        this.NumerodeIdentificacion = NumerodeIdentificacion;
    }

    // Cabe mencionar que aunque creemos un persona sin atributos, siempre podemos
    // Asignarselos más adelante en el código utilizando los getters y setters.
    // (En la clase main hay un ejemplo de esto).
    
    public String getApellido(){
        return this.Apellido;
    }
    
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
    public void setNombreIngresado(String pat){
        this.NombreIngresado = pat;
    }
    public String getNombre(){
        return this.NombreIngresado;
    }
    public void setColor(String color){
        this.color = color;
    }
    
   
    public void setIdentificacion(int Identificacion){
        this.NumerodeIdentificacion = Identificacion;
    }
    public int getIdentificacion(){
        return this.NumerodeIdentificacion;
    }  
    
}
