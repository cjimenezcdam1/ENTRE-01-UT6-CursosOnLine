package programacion.entregaut6.demo;
import programacion.entregaut6.interfaz.IUConsola;

/**
 *  Punto de entrada a la aplicación
 *  
 *  @author Christian Jiménez Cuesta
 *   
 */
public class AppPlataformaCursos
{

    public static void main(String[] args) {

        IUConsola interfaz = new IUConsola();
        interfaz.iniciar();
    }
}

/**
 * COMANDOS INTRODUCIDOS PARA LOS EJERCICIOS
 * -----------------------------------------------------------
 * Apartado e)
 *  javac programacion\entregaut6\modelo\Curso.java
 *  javac programacion\entregaut6\modelo\Nivel.java
 *  javac programacion\entregaut6\modelo\PlataformaCursos.java
 *  javac programacion\entregaut6\interfaz\IUConsola.java
 *  javac programacion\entregaut6\demo\AppPlataformaCursos.java
 *  (En realidad las anteriores no las he hecho, porque se compila automaticamente)
 *  Solo hecha esta sentencia...
 *  java programacion.entregaut6.demo.AppPlataformaCursos (Ejecutar)
 * 
 * Apartado g)
 * jar -cvfe mientregaut6.jar programacion.entregaut6.demo.AppPlataformaCursos programacion
 * java -jar mientregaut6.jar (Ejecutar)
*/