import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // ถามลูกค้าอยากกินอะไร
        // แสดง 5 เมนู
        // รับออเดอร์ลูกค้า ว่าสั่งอะไรบ้าง โดยใช้ loop
        // พอลูกค้ากดเลข 6 คือนับจำนวนอาหารที่สั่ง

        System.out.println("สวัสดี");

        System.out.println("คุณต้องกาซื้อไอศกรีมรสอะไร");
        System.out.println("1ช็อกโกแลต 2สตอเบอรี่ 3ชาเขียว 4วนิลา 5คิดงิน");


        int menu1 = 0;
        int menu2 = 0;
        int menu3 = 0;
        int menu4 = 0;
        Scanner scanner = new Scanner(System.in);
        for (int menuNumber = scanner.nextInt(); menuNumber != 5;) {

            if (menuNumber == 1 ) {
                menu1 = menu1 +1;

            }
            else if (menuNumber == 2 ) {
                 menu2= menu2 +1;

            }
            else if (menuNumber == 3) {
                menu3= menu3 +1;

            }
            else if ( menuNumber == 4) {
                menu4 = menu4 +1;

            }
            System.out.println("1ช็อกโกแลต 2สตอเบอรี่ 3ชาเขียว 4วนิลา 5คิดงิน");
            menuNumber = scanner.nextInt();

        }
        if (menu1 > 0){
            System.out.println("ช็อกโกแลต จำนวน"+menu1);

        }
         if (menu2 > 0){
            System.out.println("สตอเบอรี่ จำนวน"+menu2);
        }
         if (menu3 > 0){
             System.out.println("ชาเขียว จำนวน"+menu3);
        }
         if (menu4 > 0){
             System.out.println("วนิลา จำนวน"+menu4);
         }


    }
}