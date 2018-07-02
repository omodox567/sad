import java.lang.reflect.Array;

public class Main {

   /* public static void hello() {
        System.out.println("Hello");}
    public static void hello(String name){
        System.out.println("Hello " + name);
    }

    public static void hello(int age){
        System.out.println("your age is "+ age);
    }
*/
    public static int factorial (int number){

        int result = 1;

        if(number<0){
            return -1;

        }
        if(number ==0)
        {
            return 1;

        }
        for(;number>0;number--){

            result*=number;
        }
        return result;
    }

    public static void array () {

        int [] mas = {11, 3, 14, 16, 7};
        boolean isSorted = false;
        int buf;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i< mas.length-1;i++){
                if (mas[i]< mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i]=mas[i+1];
                    mas[i+1]=buf;


                }

            }
        }
        for(int i=0; i<mas.length;i++){
            System.out.println(mas[i] + " ");
        }
        }

        public static void mirrorNumber(int number){

        while(number>0) {
            System.out.print(number%10);
            number/=10;

        }
        }


        public static void swapArray (int []array){
            int tmp;
            if(array.length%2 == 0) {
                for (int i = 0; i < array.length / 2; i++) {
                    tmp = array[i];
                    array[i] = array[array.length / 2 + i];
                    array[array.length / 2 + i] = tmp;
                }
            }else {
                for (int i = 0; i < array.length / 2; i++) {
                    tmp = array[i];
                    array[i] = array[array.length / 2  + i];
                    array[array.length / 2  + i] = tmp;
                }
            }
        }

    public static void main(String[] args) {
//задание 1.1
 /*       float a = 4, b =7, c =9;

        if(a%2==0 ){
            System.out.println("a*b/c = " + a*b/c);
        }

        if((a+c)%2==0 || (b+c)%2==0 ){
            System.out.println("a^c = " + Math.pow(a, c));
        }
        else {
            System.out.println("a+b-c = " + (a+b-c));
        }

*/
//задание 2.1
        System.out.println(factorial(6));
//задание 2.2
        mirrorNumber(167);
//задание 3.2
        array();
// задание 3.1
        int array[] = {1,2,3,4,};
        swapArray(array);
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]);
        }
    }






}
