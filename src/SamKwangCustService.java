import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SamKwangCustService {
    Scanner scan = new Scanner(System.in);
    
    public void showCustMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("1. 고객 관리 프로그램\n")
                .append("-------------------\n")
                .append("1. 새로운 고객정보 입력\n")
                .append("2. 전체고객정보 조회\n")
                .append("3. 고객정보 상세조회\n")
                .append("4. 고객정보 수정\n")
                .append("5. 고객정보 삭제\n")
                .append("0. 돌아가기\n")
                .append("-------------------\n")
                .append("원하시는 작업은 ? ");
        System.out.print(sb);
    }

    public void excuteCustMenu(){
        Lable: while (true){
            showCustMenu();
            String inputNo = scan.nextLine();
            switch (inputNo){
                case "1" : newCust(); break;
                case "2" : readCust(); break;
                case "3" : readOneCust(); break;
                case "4" : modifyCust(); break;
                case "5" : deleteCust(); break;
                case "0" : break Lable;
                default:
                    System.out.println("잘못 입력하셨습니다.");

            }
        }
    }

    private void deleteCust() {
    }

    private void modifyCust() {
    }

    private void readOneCust() {
        int inputNo;
        SamKwangCustVO skcv = null;
        String result = "읽어오기 실패!";
        String fmt = "%s %s %s %s %s %s";
        while (true) {
            System.out.print("조회하실 고객의 번호를 입력하세요 : ");
            String inputData = scan.nextLine();
            if (inputData.matches("[0-9]*")) {
                inputNo = Integer.parseInt(inputData); break;
            } else System.out.println("다시 입력하세요");
        }
        skcv = SamKwangCustDAO.readOneCust(inputNo);
        if (skcv != null) {
            result = String.format(
                    fmt,
                    skcv.getCustNo(),
                    skcv.getCustName(),
                    skcv.getCustAddr(),
                    skcv.getCustCity(),
                    skcv.getPostNo(),
                    skcv.getCallNo()
            );
        }
        System.out.println(result);
    }

    private void readCust() {
        ArrayList<SamKwangCustVO> sksvs = SamKwangCustDAO.readCust();
        Iterator<SamKwangCustVO> iter = sksvs.iterator();
        StringBuilder sb = new StringBuilder();
        String fmt = "%s %s %s\n";

        while (iter.hasNext()){
            SamKwangCustVO skcv = iter.next();
            String  result = String.format(
                    fmt,
                    skcv.getCallNo(),
                    skcv.getCustName(),
                    skcv.getCallNo()
                    );
            sb.append(result);
        }
        System.out.println(sb.toString());
    }

    private void newCust() {

            System.out.print("새 고객번호를 입력하세요 : ");
            int custNo = Integer.parseInt(scan.nextLine());

            System.out.print("고객이름을 입력하세요 : ");
            String custName = scan.nextLine()

            System.out.print("고객 주소를 입력하세요 : ");
            String custAddr = scan.nextLine()

            System.out.print("도시를 입력하세요 : ");
            String custCity = scan.nextLine()

            System.out.print("우편번호를 입력하세요 : ");
            String postNo = scan.nextLine();

            System.out.print("전화번호를 입력하세요 : ");
            String callNo = scan.nextLine();


        SamKwangCustVO skcv = new SamKwangCustVO(custNo,custName,custAddr,custCity,postNo,callNo);
        String result = SamKwangCustDAO.newCust(skcv);
        if (result == null) result = "sql구문 실행 실패!";
        System.out.println(result);
    }

}
