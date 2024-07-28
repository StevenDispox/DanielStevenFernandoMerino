package modelo

import oracle.ons.Connection
import java.sql.DriverManager

class ClaseConexion {

    fun cadenaConexion(): java.sql.Connection? {
        try {
            val url = "jdbc:oracle:thin:@10.10.2.159:1521:xe"
            val usuario = "STEVEN_PALACIOS"
            val contrasena = "2006"

            val connection = DriverManager.getConnection(url, usuario, contrasena)


            return connection
        } catch (e: Exception){
            println("error: $e")
            return null
        }


    }
}