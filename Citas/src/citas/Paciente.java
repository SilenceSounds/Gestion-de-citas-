package citas;
/**
 *
 * @author Yerik Jael Morales Avalos
 */
public class Paciente {
    int id;
    String Nombre;
    
    public Paciente(int id, String Nombre){
        this.id = id;
        this.Nombre = Nombre;
    }
    
    public int GetId(){
        return id;
    }
    
    public String GetName(){
        return Nombre;
    }
    
}
