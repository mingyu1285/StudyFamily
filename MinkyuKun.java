package WeAreFamily;

import java.util.Scanner;

public class MinkyuKun {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt(); //최소값이라 가정
        int n2 = s.nextInt(); //최대값이라 가정
        int result = 0;
        int n3= 0;

        if (n1>n2){
            n3 = n2;
            n2 = n1;//n3 == 2 n2 == 2
            n1 = n3;  // n1 == 2
            ; // n2 ==2    =  n3 == 2
            for (int i = n1; i<=n2; i++ ){
                result +=i;
            }
        }

        System.out.printf("%d",result);



    }
}
