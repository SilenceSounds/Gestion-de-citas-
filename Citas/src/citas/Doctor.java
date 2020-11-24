/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citas;

/**
 *
 * @author Sayad
 */
public class Doctor {
    int id;
    String Nombre;
    String Especialidad;
    
    public Doctor(int id, String Nombre, String Especialidad){
        this.id = id;
        this.Nombre = Nombre;
        this.Especialidad = Especialidad;
    }
    
    public int GetId(){
        return id;
    }
    
    public String GetName(){
        return Nombre;
    }
    
    public String GetEspecialidad(){
        return Especialidad;
    }
    
    
}
