import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SamKwangServices extends SamKwangGeneric{
SamKwangCustService skcs = new SamKwangCustService();

public void excuteMenu() {
    while (true) {
        showMenu();
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        switch (input) {
            case "1":
                skcs.excuteCustMenu();
                break;
            case "2":
                readCODP();
                break;
            case "3":
                readOneCODP();
                break;
            case "4":
                readSOE();
                break;
            case "5":
                readOneSOE();
                break;
            case "0":
                System.exit(0);
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");

        }
    }
}


    public void showMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("삼광산업 관리 프로그램 v3\n")
                .append("-------------------\n")
                .append("1. 고객 관리 프로그램 실행\n")
                .append("2. CODP 조회\n")
                .append("3. CODP 상세 조회\n")
                .append("4. SOE 조회\n")
                .append("5. SOE 상세조회\n")
                .append("0. 프로그램 종료\n")
                .append("-------------------\n")
                .append("원하시는 작업은 ? ");
        System.out.print(sb);
    }

    @Override
    public void readCODP() {
        StringBuilder sb = new StringBuilder();
        String fmt = "%s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s\n";
       ArrayList<SamKwangVO> sks = SamKwangDAO.readCODP();
        Iterator<SamKwangVO> iter = sks.iterator();
        while (iter.hasNext()){
            SamKwangVO sv = iter.next();
            String result = String.format(fmt,
                    sv.getProdNo(),
                    sv.getOrderNo(),
                    sv.getCustNo(),
                    sv.getCustName(),
                    sv.getAddr(),
                    sv.getCity(),
                    sv.getPostNo(),
                    sv.getCallNo(),
                    sv.getOrdDate().substring(0,10),
                    sv.getDueDate().substring(0,10),
                    sv.getEmpNo(),
                    sv.getQnt(),
                    sv.getProdName(),
                    sv.getProdType(),
                    sv.getUnitPrice(),
                    sv.getStock()
                    );
            sb.append(result);
        }
        System.out.println(sb);
    }


    public void readOneCODP() {
        Scanner scan = new Scanner(System.in);
        System.out.println("조회하실 주문번호를 입력하세요");
        int inputNo = Integer.parseInt(scan.nextLine());
        SamKwangVO sv = SamKwangDAO.readOneCODP(inputNo);
        String fmt = "%s %s %s %s %s %s %s %s %s %s %s %s %s %s %s %s\n";
        String result = "찾으시는 주문번호가 없습니다.";
        if (sv != null){
            result = String.format(fmt,
                    sv.getProdNo(),
                    sv.getOrderNo(),
                    sv.getCustNo(),
                    sv.getCustName(),
                    sv.getAddr(),
                    sv.getCity(),
                    sv.getPostNo(),
                    sv.getCallNo(),
                    sv.getEmpNo(),
                    sv.getOrdDate().substring(0,10),
                    sv.getDueDate().substring(0,10),
                    sv.getQnt(),
                    sv.getProdName(),
                    sv.getProdType(),
                    sv.getUnitPrice(),
                    sv.getStock()
            );
        }
        System.out.println(result);
    }

    @Override
    public void readSOE() {
       ArrayList<SamKwangVO> svs = SamKwangDAO.readSOE();
       Iterator<SamKwangVO> iter = svs.iterator();
       StringBuilder sb = new StringBuilder();
       String fmt = "%s %s %s %s %s %s\n";
       while (iter.hasNext()){
           SamKwangVO sv = iter.next();
           String result = String.format(fmt,
                   sv.getEmpNo(),
                   sv.getOrderNo(),
                   sv.getExpsId(),
                   sv.getExpsName(),
                   sv.getOrdDate().substring(0,10),
                   sv.getJobName());
                   sb.append(result);
       }
        System.out.print(sb);
    }

    public void readOneSOE() {
        Scanner scan = new Scanner(System.in);
        System.out.print("조회하실 운송번호를 입력하세요 : ");
        int inputNo = Integer.parseInt(scan.nextLine());
        SamKwangVO sv = SamKwangDAO.readOneSOE(inputNo);
        String fmt = "%s %s %s %s %s %s %s %s %s %s %s %s %s\n";
        String result = "찾으시는 운송 ID가 존재하지 않습니다";
        if (sv != null) {
                 result = String.format(fmt,
                    sv.getEmpNo(),
                    sv.getOrderNo(),
                    sv.getExpsId(),
                    sv.getExpsName(),
                    sv.getEmpCall(),
                    sv.getOrdDate().substring(0, 10),
                    sv.getDueDate().substring(0, 10),
                    sv.getCustNo(),
                    sv.getPersonNo(),
                    sv.getName(),
                    sv.getDept(),
                    sv.getJobName(),
                    sv.getH_date());
        }
        System.out.println(result);
    }
}
