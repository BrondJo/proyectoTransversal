package AccesoADatos;

import Entidades.Usuario;
import java.sql.Connection;

public class UsuarioData {

    private Connection con = null;

    public UsuarioData() {
        con = Conexion.getConexion();
    }
    
    public void crearUsuario(Usuario usuario){
        
    }
    
    public void modificarUsuario(int idUsuario){
        
    }
    
    public void modificarClave(int idUsuario){
        
    }
    
    public void eliminarUsuario(int idUsuario){
        
    }
}
