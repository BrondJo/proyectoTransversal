/*
    1 	idUsuario Primaria 	int(11) 			No 	Ninguna 		AUTO_INCREMENT 	Cambiar Cambiar 	Eliminar Eliminar 	
	2 	nombre 	varchar(30) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	3 	apellido 	varchar(30) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	4 	dni Índice 	int(11) 			No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	5 	email Índice 	varchar(40) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	6 	usuario Índice 	varchar(30) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	7 	clave 	varchar(8) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	8 	tipo 	varchar(30) 	utf8mb4_general_ci 		No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	9 	acceso 	int(11) 			No 	Ninguna 			Cambiar Cambiar 	Eliminar Eliminar 	
	10 	estado 
 */
package Entidades;

public class Usuario {

    private int id;

    private String nombre;
    private String apellido;
    private int dni;
    private String email;
    private String usuario;
    private char[] clave;
    private int acceso;
    private boolean activo;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int dni, String email, 
            String usuario, char[] clave, int acceso, boolean activo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
        this.acceso = acceso;
        this.activo = activo;
    }

    public Usuario(int id, String nombre, String apellido, int dni, String email,
            String usuario, char[] clave, int acceso, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.usuario = usuario;
        this.clave = clave;
        this.acceso = acceso;
        this.activo = activo;
    }
}
