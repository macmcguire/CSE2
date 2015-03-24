public class Practice1 {
    public static void main(String [] args) {
    int a = 0;
    int b = 0;
    
    
    for ( ; a <= 9; a++) {
        if (a< 5) {
        for (b = 0; b<a+1; b++) {
            System.out.print(a);
        }
    
        System.out.println(" ");
    }
    
    else {
        for (a = 5; a <= 9; a++) {
          for (b = 10; b > a; b--) {
              System.out.print(a);
          }  
        
            System.out.println(" ");
        }
    }
    }

    

    }    
}