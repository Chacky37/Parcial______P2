
package Vista;
import Modelo.Participante;
import Modelo.Llanta;
/**
 *
 * @author ESTUDIANTES
 */
public class Resultados {
    public static void main(String[] args) {
        
        Participante A =new Participante ("Luis", "Perez", 1, new Llanta(10));
        Participante B =new Participante ("Carlos", "Lopez", 2, new Llanta(5));
        Participante C =new Participante ("Gorge", "Pinto", 3, new Llanta(7));
        
        Concurso concurso = new (A, B,C);
    
        
        System.out.println("RESULTADOS DE LANZAMIENTO: ");
        System.out.println("Resultado A: "+concurso.getA().resultadodeLanzamiento);
        System.out.println("Resultado B: "+concurso.getB().resultadodeLanzamiento);
        System.out.println("Resultado C: "+concurso.getC().resultadodeLanzamiento);
        System.out.println(" ");
        
        Participante ganador= concurso.getGanador();
        System.out.println("Ganador: "+ ganador);
          
                
          
        
    }
    
}
