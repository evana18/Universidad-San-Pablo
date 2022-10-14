
import javax.swing.JOptionPane;
import java.util.*;

import java.util.stream.IntStream;

    public static void main(String[] args) {
        int opcion=0; String op="";
        op=JOptionPane.showInputDialog("SELECCIONAR UNA OPCIÓN: \n"
            + " 1. -Verificar numeros pequeño\n"
            + " 2. -Separar de caracteres\n"
            + " 3. -Contar de Vocales\n"
            + " 4. -Verificar de password\n"
            + " 5. -Juego de promedio\n"
            + " 6. -Juego de valores\n");
        opcion=Integer.parseInt(op);
        switch(opcion){
            case 1: Tareas llamar = new Tareas();
                    llamar.juego1();
                    break;
            case 2: Tareas llamar2 = new Tareas();
                    llamar2.juego2();
                    break;
            case 3: Tareas llamar3 = new Tareas();
                    llamar3.juego3();
                    break;
            case 4: Tareas llamar4 = new Tareas();
                    llamar4.juego4();
                    break;
            case 5: Tareas llamar5 = new Tareas();
                    llamar5.juego5();
                    break;
            case 6: Tareas llamar6 = new Tareas();
                    llamar6.juego6();
                    break;
        } System.exit(0);
    }
    
    public void juego1(){
        int n1;
        int n2;
        int n3;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba su primer numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba su segundo numero"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Escriba su tercer numero"));
	JOptionPane.showMessageDialog(null, "El numero menor es:  " + Math.min(n1,Math.min(n2, n3)));
    }    
    public void juego2(){  
        String palabra = JOptionPane.showInputDialog(null,"Escriba una palabra").toUpperCase().trim();  
        int contador;
        int resta;
        int mitad;
        int mitad2;        
        contador = palabra.length();
        resta = contador -1;        
        mitad = contador / 2;
        mitad2 = resta / 2;
        if (contador % 2 == 0){
            JOptionPane.showMessageDialog(null,"No tiene mitad : " + palabra.charAt(Math.round(mitad2)) + palabra.charAt(mitad));            
        } else{
            JOptionPane.showMessageDialog(null,"El caracter es : " + palabra.charAt(mitad));                   
        }        
    }              
    public void juego3(){
        int contador=0;
        String palabra = JOptionPane.showInputDialog(null,"Escriba una palabra para contar las vocales").toUpperCase().trim();           
        for (int x = 0 ; x < palabra.length(); x++){
            if (palabra.charAt(x)== 'A' || palabra.charAt(x)== 'E' || palabra.charAt(x)== 'I' || palabra.charAt(x)== 'O' || palabra.charAt(x)== 'U') {
                contador++;
            }            
        }                
        JOptionPane.showMessageDialog(null,"Resultados: " + contador);                                          
    }                       
    public void juego4(){               
         String password = JOptionPane.showInputDialog(null,"Escriba su password: ");
         String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"                       
                       + "(?=\\S+$).{8,8}$";
         if (password.matches(regex))  {
            JOptionPane.showMessageDialog(null,"Contraseña correcta");                      
         }         
         else {
            JOptionPane.showMessageDialog(null,"Contraseña no valida");
         }
    }
    public void juego5(){
        int array1[]  = new int[11];       
        int sum = 0;                
        for (int i=1;i<11;i++){
            array1[i] = (int) (Math.random()*95+1);
            sum += array1[i];
            JOptionPane.showMessageDialog(null,"Lista de valores: " +i+"----->"+array1[i]);               
        }
            JOptionPane.showMessageDialog(null,"El promedio es: " + sum / array1.length);                                       
    }
    public void juego6(){
        int array1[]  = new int[11];                         
        IntSummaryStatistics stats = Arrays.stream(array1).summaryStatistics();
        for (int i=1;i<11;i++){
            array1[i] = (int) (Math.random()*10+1);
            JOptionPane.showMessageDialog(null,"Lista de valores: " +i+"----->"+array1[i]);            
        }                                   
            JOptionPane.showMessageDialog(null,"El valor maximo es: " +  stats.getMin()); 
            JOptionPane.showMessageDialog(null,"El valor minimo es: " +  stats.getMax()); 
            
    }
     
}
