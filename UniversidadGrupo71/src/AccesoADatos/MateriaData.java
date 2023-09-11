/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package AccesoADatos;

import java.sql.Connection;
import java.util.List;
import universidadgrupo71.entidades.Materia;

public class MateriaData {
    
     private Connection con=null;
    
     public MateriaData(){
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        
    }
    
    public Materia buscarMateria(int id){
        return null;
    }
    
    public void modificarMateria(Materia materia){
        
    }
    
    public void eliminarMateria(int id){
        
    }
    
    public List<Materia> listarMaterias(){
        return null;
    }    

}
