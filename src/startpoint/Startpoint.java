
package startpoint;


public class Startpoint {

    
    public static void main(String[] args) {
        seipstudent r1=new seipstudent("98438", "9584998", "Aminul",
                "01774538573","9548959");
        collaborativestudent r2=new collaborativestudent(5000, "diu", 
                "hasan","0118783742","49845");
        
        bitmstudent [] a1={r1,r2};
        for(bitmstudent a2:a1){
            System.out.println(a2.getInfo());  
            
        }
        
        
       
    }
    
}
