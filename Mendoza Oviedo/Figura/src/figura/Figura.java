
package figura;
import java.io.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Marco
 */
public class Figura implements FiguraInterface {

    /**
     * Cuando una clase implementa una interfaz esta obliga a cumplir todos los
     * contratos de la interfaz
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double area = 0;
      // tipo de dato nombre_variable = palabra reservada(new) tipo de dato(alcance)
        
        // instancia de la clase figura
        Figura ofigura = new Figura();
        
        //  Instanciando la Clase Circulo
        Circulo ocirculo = new Circulo();
        ocirculo.set_Radio(5);
        
        area = ofigura.CalculoArea(ocirculo);
        
        System.out.println(" El Area del Circulo es : " + area);
        
        // Instancias la Clase Triangulo
        Triangulo oTriangulo = new Triangulo(5.2,2.4);
            
        int x,z;
        int Atriangulo;
        try{
              x=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la base del triangulo","Calculamos el Triangulo",JOptionPane.INFORMATION_MESSAGE));
        z=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese la altura del triangulo","Calculamos el Triangulo",JOptionPane.INFORMATION_MESSAGE));
        Atriangulo= (x*z)/2 ;
         System.out.println(" El Area del Triangulo es : " + Atriangulo);
        }
        catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"Lo sentimos Mucho :\n  ➣ Vuelve a ejecutar la aplicacion ↺:↺","ERROR",JOptionPane.ERROR_MESSAGE);}
       
       //  x=Integer.parseInt(JOptionPane.showInputDialog("ingrese el area superior del rectangulo"));
       // z=Integer.parseInt(JOptionPane.showInputDialog("ingrese el area superior del rectangulo"));
//Atriangulo= (x*z)/2 ;

        
       // area = ofigura.CalculoArea(oTriangulo);
        
        //System.out.println(" El Area del Triangulo es : " + Atriangulo);
        
        //instancias dla clase rectangulo
        
        Rectangulo react =new Rectangulo(25,25,75,75);
        int a,b;
        int arearectangulo;
        try{
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el area superior del rectangulo","Calculamos el Rectangulo",JOptionPane.INFORMATION_MESSAGE));
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"ingrese el area inferior del rectangulo","Calculamos el Rectangulo",JOptionPane.INFORMATION_MESSAGE));
 
   arearectangulo=(a*b);
       // area= ofigura.CalculoArea(react);
        
              System.out.println(" El Area del rectangulo  es : " +arearectangulo );
        }
        catch(NumberFormatException e){JOptionPane.showMessageDialog(null,"Lo sentimos Mucho :\n  ➣ Vuelve a ejecutar la aplicacion ↺:↺","ERROR",JOptionPane.ERROR_MESSAGE);}
        System.exit(0);
      //  a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el area superior del rectangulo"));
       // b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el area inferior del rectangulo"));
 
   //arearectangulo=(a*b);
       // area= ofigura.CalculoArea(react);
        
              //System.out.println(" El Area del rectangulo  es : " +arearectangulo );

        
        // Los Datos de Entrada que se ingresen desde teclado.
        // Completar para el area del rectangulo.
        
        
        
    }
    
    // 
    public double CalculoArea(Object obj) {
        double area = 0;
            
        //System.out.println(obj.getClass().getSimpleName());
        
        switch (obj.getClass().getSimpleName())
        {
            case "Circulo":
               // convierte el objeto obj recibido por parametro 
                // en la clase instaciada circulo.
               Circulo oCirculo = (Circulo) obj;
                
                area =  Circulo.PI*Math.pow(oCirculo.get_Radio(), 2); 
               
               break;
            
            case "Triangulo":
                 
                Triangulo oTriangulo = (Triangulo) obj;
                 
                area = oTriangulo.GetBase()*oTriangulo.GetAltura()/2;
               
            default: 
                
                break;
        }
        
        
        return area;
    }
    
}
