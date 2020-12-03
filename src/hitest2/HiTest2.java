/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitest2;

/**
 *
 * @author smbillah
 */
public class HiTest2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public int addition (int a, int b){
        // correct implementation
        //return (a + b);
        
        // imcorrect implementation
        return (a * b);
    }
    
    public boolean isEven(int a){
        if (a%2 == 0) {
            // correct implementation
            //return true;
            
            // imcorrect implementation
            return false;
            
        }
        else {
            // correct implementation
            //return false;
            
            // imcorrect implementation
             return true;
            
        }
    }

}
