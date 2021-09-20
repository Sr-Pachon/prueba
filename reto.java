/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author JOTA
 */
public class reto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int anios = 0;
        int bono = 500000;
        double porcentajeBono = 0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("escriba los años trabajados");
        anios= in.nextInt();
        
        if(anios>=10){
           porcentajeBono = bono*0.3;
           System.out.println(porcentajeBono);
        } else if(anios>=5 && anios<10){
           porcentajeBono = bono*0.2;
           System.out.println(porcentajeBono);    
        } else if(anios>=3 && anios<5){
           porcentajeBono = bono*0.1;
           System.out.println(porcentajeBono);
        } else if(anios<3){
           porcentajeBono = bono*0.05;
            System.out.println(porcentajeBono);
        
        }
                   
        
        }
        
            
    }
    

