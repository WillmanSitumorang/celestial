
public class Main {
    public static void main(String[] args) {

        for(int i = 2; i<=20; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        int i = 5;
        int total = 1;
        while(i>=1){
            total *= i;
            i--;
        }
        System.out.println(total);

//        int x = 2;
//        if (x < 2) {
//            System.out.println("Kurang dari 2");
//        } else if (x == 2) {
//            System.out.println("Sama dengan 2");
//        } else if (x > 2) {
//            System.out.println("Lebih dari 2");
//        }
//
//        String role = "admin";
//        switch (role) {
//            case "admin":
//                System.out.println("Diijinkan");
//                break;
//            case "user":
//                System.out.println("Tidak Diijinkan");
//                break;
//            default:
//                System.out.println("Tidak Diijinkan");
//                break;

//        for(int i = 1; i<=5; i++){
//            System.out.println(i);
//        }
//
//        int i = 6;
//
//        while(i<=10){
//            System.out.println(i);
//            i++;
//        }
//
//        do{
//            System.out.println(i);
//            i--;
//        }while (i>16);


    }
}