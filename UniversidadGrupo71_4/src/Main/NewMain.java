
package Main;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;
import universidadgrupo71.entidades.Alumno;
import universidadgrupo71.entidades.Materia;


public class NewMain {

   
    public static void main(String[] args) {
        
        Connection conexion=Conexion.getConexion();
       
        MateriaData mat=new MateriaData();
        AlumnoData alu= new AlumnoData();
         InscripcionData insc=new InscripcionData(mat,alu);
        //alu.guardarAlumno(new Alumno (34768990,"Sosa","Laura",LocalDate.of(1988, Month.MARCH, 15),true));
        //alu.modificarAlumno(new Alumno (6,34768990,"Sosa","Maria Laura",LocalDate.of(1988, Month.MARCH, 15),true));
        //alu.eliminarAlumno(6);
        List<Materia> noCursadas=new ArrayList<Materia>();
        noCursadas=insc.obtenerMateriasNoCursadas(4);
        for(Materia m:noCursadas){
            System.out.println(m.toString());
        }
}
}
