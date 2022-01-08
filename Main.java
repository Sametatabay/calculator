import java.util.Scanner;
public class Main {
    static int total(int a,int b){
        int result =a+b;
        System.out.println("Total :"+result);
        return result;
}
    static int substraction(int a,int b){
        int result =a-b;
        System.out.println("Total :"+result);
        return result;
}
    static int Multiply(int a,int b){
        int result =a*b;
        System.out.println("Total :"+result);
        return result;
}
    static int divide(int a,int b){
        if (b==0){
            System.out.println("Please enter a number other than 0");
            return b;
        }
        int result =a/b;
        System.out.println("Total :"+result);
        return result;
}
    static int exponenttiation(int a,int b) {
        int result=1;
        for (int i=1;i<=b;i++){
            result*=a;
        }
        return result;
    }
    static int modding(int a, int b){
            int result = a % b;
            System.out.println("Total :" + result);
            return result;
    }
    static void  field(int a, int b) {
        int result= +(2*(a+b));
        System.out.println("Cevresi : "+(2*(a+b)));
        System.out.println("Field :"+(a*b));

    }
    public static void main(String[] args) {
        int select,a,b;
        Scanner inp=new Scanner(System.in);


        String menu="1-Total Process\n"+
                    "2-Substruction\n"+
                    "3-Multiply\n"+
                    "4-Dived\n"+
                    "5-Excponentiation\n"+
                    "6-Moddding\n"+
                    "7-rectangular area and perimeter calculation\n"+
                    "8-Exit";
        while (true){
            System.out.println(menu);
            System.out.print("Process Selected :");
            select=inp.nextInt();

            if (select==0){
                break;
            }
            System.out.print("First Enter :");
            a=inp.nextInt();
            System.out.print("Second Enter :");
            b=inp.nextInt();

            switch (select){
                case 1:
                    total(a,b);
                    break;
                case 2:
                    substraction(a,b);
                    break;
                case 3:
                    Multiply(a,b);
                    break;
                case 4:
                    divide(a,b);
                    break;
                case 5:
                   System.out.println("Exponenttiation :"+(exponenttiation(a,b)));
                    break;
                case 6:
                    modding(a,b);
                    break;
                case 7:
                    field(a,b);
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Invalid Process");
            }
        }
        System.out.print("Nice Days.");


    }
}
