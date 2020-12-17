import java.util.Scanner;

public class SamKwangMain {
    public static void main(String[] args) {
        SamKwangServices sksv = new SamKwangServices();
        Scanner scan = new Scanner(System.in);

        while (true) {
            sksv.showMenu();
            String input = scan.nextLine();
            switch (input) {
                case "1":
                    sksv.readCODP();
                    break;
                case "2":
                    sksv.readSOE();
                    break;
                case "0":
                    System.exit(0);
                    break;
                default:
                    System.out.println("잘못 입력하셨습니다.");

            }
        }

    }
}
