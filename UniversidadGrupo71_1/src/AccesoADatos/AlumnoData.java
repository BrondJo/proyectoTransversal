
package AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import universidadgrupo71.entidades.Alumno;


public class AlumnoData {
    private Connection con=null;
    
    public AlumnoData(){
    con= Conexion.getConexion();
    }
    
    public void guardarAlumno(Alumno alumno){
    
    String sql="INSERT into alumno (dni,apellido,nombre,fechaNac,estado)"
            + "VALUEs (?,?,?,?,?)";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3,alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5,alumno.isEstado());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            
            if(rs.next()){
                alumno.setId(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno Guardado");
                ps.close();//TODO Agregar al Finaly
            }
          
        } catch (SQLException ex) {
            
            if(ex.getSQLState().equals("23000")&&ex.getErrorCode()==1062){
                JOptionPane.showMessageDialog(null, "El Dni ingresado ya existe");
            }else{
                JOptionPane.showMessageDialog(null, "Error al trabajar con la tabla Alumno");
            }
            
             
             
        } 
    }
    
    public void modificarAlumno(Alumno alumno){
    
    String sql="UPDATE alumno sET dni=?,apellido=?,nombre=?,fechaNac=?"
            + "where idAlumno=?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            ps.setInt(1, alumno.getDni());
            ps.setString(2,alumno.getApellido());
            ps.setString(3,alumno.getNombre());
            ps.setDate(4,Date.valueOf(alumno.getFechaNacimiento()));
            ps.setInt(5,alumno.getId());
            
            
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Alumno modificado exitosamente");
                ps.close();
            }
 
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al trabajar con la tabla Alumno");
        }
    }
    
     public void eliminarAlumno(int id){
    
    String sql="UPDATE alumno SET estado=0 WHERE idAlumno=?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
 
            int exito=ps.executeUpdate();
            if(exito==1){
                JOptionPane.showMessageDialog(null, "Alumno eliminado exitosamente");
            }else{
                  JOptionPane.showMessageDialog(null, "Alumno no encontrado");  
            }
            
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al trabajar con la tabla Alumno");
        }
    }
     
//     public Alumno buscarAlumno(int id){
//     return alumno;
//     }
}
