package mojpaket;

public class Program {

    public static void main(String[] args){
        int a = 1;
        float f = 5;
        double d = 5.0;

        char c = 'a';
        boolean b = true;
        String s = "asdasd";

//        if(a > 5 || a < 10){
//            System.out.println();
//        } else if(a > 11){
//            System.out.println();
//        }else{
//            System.out.println();
//        }

        switch (a){
            case 1:
                System.out.println("Pet");
            case 2:
                System.out.println("Sest");
            default:
                System.out.println("Default");
        }

        System.out.println("Hello!");
    }
}
