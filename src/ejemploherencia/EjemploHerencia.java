package ejemploherencia;

/**
 *
 * @author JUAN
 */
public class EjemploHerencia {

    public static void main(String[] args) {
        
        Circulo c = new Circulo(); 
        
                c.dibujar();
                
        Triangulo t = new Triangulo();
        
                t.dibujar();
                
        Rectangulo r = new Rectangulo();
        
                r.dibujar();
    }
    
}
