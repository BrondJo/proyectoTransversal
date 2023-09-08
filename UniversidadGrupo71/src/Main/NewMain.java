
package Main;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import universidadgrupo71.entidades.Alumno;


public class NewMain {

   
    public static void main(String[] args) {
        
        Connection conexion=Conexion.getConexion();
        
        AlumnoData alu= new AlumnoData();
        //alu.guardarAlumno(new Alumno (34768990,"Sosa","Laura",LocalDate.of(1988, Month.MARCH, 15),true));
        alu.modificarAlumno(new Alumno (34768990,"Sosa","Maria Laura",LocalDate.of(1988, Month.MARCH, 15),true));
    
}
}
