import java.util.Calendar;
import java.util.Scanner;
public class Calander{
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int Days=0;
        try (Scanner int1 = new Scanner(System.in)) {
            System.out.println("What is the year?");
            
            int number=0;
            int s1 =int1.nextInt();
            if (s1%4==0){
                Days=366;
                try (Scanner int2 = new Scanner(System.in)) {
                    System.out.println("What is the month(enter in number)?");
                    int s2 =int1.nextInt();
                    int [] dayinmonth={0,31,29,31,30,31,30,31,31,30,31,30,31};
                    for (int index = 0; index < s2; index++) {
                        number=number+dayinmonth[index] ;   
                    }
                    try (Scanner int3 = new Scanner(System.in)) {
                        System.out.println("What is the day(enter in number)?");
                        int s3 =int1.nextInt();
                        number=number+s3;
                        Calendar cal = Calendar.getInstance();
                        cal.set(s1, s2-1, s3);
                        System.out.println(cal.getTime());
                        
                       
                        
                    }


            }
        }
            if (s1%4!=0){
                Days=365;
                try (Scanner int2 = new Scanner(System.in)) {
                    System.out.println("What is the month(enter in number)?");
                    int s2 =int1.nextInt();
                    
                    int [] dayinmonth={0,31,28,31,30,31,30,31,31,30,31,30,31};

                    for (int index = 0; index < s2-1; index++) {
                        number=number+dayinmonth[index] ;    
                            
                    
                    try (Scanner int3 = new Scanner(System.in)) {
                        System.out.println("What is the day(enter in number)?");
                        int s3 =int1.nextInt();
                        Calendar cal = Calendar.getInstance();
                        cal.set(s1, s2-1, s3);
                        System.out.println(cal.getTime());                   
                    

                    
            }

            
                

                

            }

        }
    }
}
    }
}