package citas;

import java.util.Date;

/**
 *
 * @author Yerik Jael Morales Avalos
 */
public class Cita {
    int id;
    Date Fecha;
    String Motivo;
    
    int Paciente;
    int Doctor;
    
    public Cita(int id, Date Fecha, String Motivo, int Paciente, int Doctor){
        this.id = id;
        this.Fecha = Fecha;
        this.Motivo = Motivo;
        this.Paciente = Paciente;
        this.Doctor = Doctor;
    }
    
    public Cita(int id, Date Fecha, String Motivo){
        this.id = id;
        this.Fecha = Fecha;
        this.Motivo = Motivo;   
    }
    
    public void setFecha(Date Fecha){
        this.Fecha = Fecha;
    }
    
    public void setMotivo(String Motivo){
        this.Motivo = Motivo;
    }
    
    public void setPaciente(int Paciente){
        this.Paciente = Paciente;
    }
    
    public void setDoctor(int Doctor){
        this.Doctor = Doctor;
    }
    
    public int getId(){
        return this.id;
    }
    
    public Date getFecha(){
        return this.Fecha;
    }
    
    public String getMotivo(){
        return this.Motivo;
    }
    
    public int getPaciente(){
        return this.Paciente;
    }
    
    public int getDoctor(){
        return this.Doctor;
    }
    
    
    
    
}
