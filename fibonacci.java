
    public class fibonacci {  
        public static void main(String[] args) {  
            int a = 1, b = 1, c = 0;  
            System.out.print(a + "\t" + b + "\t");  
            for (int i = 1;c<200; i++) {  
                c = a + b;  
                a = b;  
                b = c;  
                if(c<200)
                    System.out.print(c + "\t");  
            }  
        }  
      
    }  
