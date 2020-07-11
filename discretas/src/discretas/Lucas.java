/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discretas;

/**
 *
 * @author rhino
 */
public class Lucas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println(lucas(11));
        System.out.println("--------");
        System.out.println(lucas18());
        System.out.println("--------");
        System.out.println(cercanoAMil());
    }
    
    
    
    
    public static int lucas(int n){
        int lucas = 0;
        
        if(n == 1) return 1;
        
        if(n == 0) return 2;
        
        lucas = lucas(n-2, 2, 1);
        
        return lucas;
    }
    
    public static int lucas(int n, int lucas0, int lucas1){
        int lucas2 = lucas0 + lucas1;
        int lucas;
        if(n>1){
            lucas = lucas(n-1, lucas1, lucas2);
            return lucas;
        }else return lucas2;
    }
    
    public static int lucas18(){
        return lucas(18);
    }
    
    public static boolean masCercano(int lucas, int lucas0, int lucas1){
        boolean ac;
        
        int temp1 = Math.abs(lucas-lucas0);
        int temp2 = Math.abs(lucas-lucas1);
        
        return temp1 > temp2;
    }
    
    public static int cercanoAMil(){
        int lucas1;
        int lucas2;
        int n=0;
        int cercano;
        while(true){
            lucas1 = lucas(n);
            n++;
            lucas2 = lucas(n);
            
            if(masCercano(1000, lucas1, lucas2)) cercano = lucas1;
            
            else cercano = lucas1;
            
            if(lucas2 > 1000) break;
        }
        
        return cercano;
    }
}
