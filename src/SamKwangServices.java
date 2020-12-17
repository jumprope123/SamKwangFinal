import java.util.ArrayList;
import java.util.Iterator;

public class SamKwangServices extends SamKwangGeneric{

    public void showMenu() {
        StringBuilder sb = new StringBuilder();
        sb.append("-------------------\n")
                .append("삼광산업 관리 프로그램 v3\n")
                .append("-------------------\n")
                .append("1. 고객-주문-주문항목-제품 조회\n")
                .append("2. 운송-주문-직원 조회\n")
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
                    sv.getEmpNo(),
                    sv.getOrdDate().substring(0,10),
                    sv.getDueDate().substring(0,10),
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

    @Override
    public void readSOE() {
       ArrayList<SamKwangVO> svs = SamKwangDAO.readSOE();
       Iterator<SamKwangVO> iter = svs.iterator();
       StringBuilder sb = new StringBuilder();
       String fmt = "%s %s %s %s %s %s %s %s %s %s %s %s %s\n";
       while (iter.hasNext()){
           SamKwangVO sv = iter.next();
           String result = String.format(fmt,
                   sv.getEmpNo(),
                   sv.getOrderNo(),
                   sv.expsId,
                   sv.expsName,
                   sv.empCall,
                   sv.ordDate,
                   sv.dueDate,
                   sv.custNo,
                   sv.personNo,
                   sv.name,
                   sv.dept,
                   sv.jobName,
                   sv.h_date);
           sb.append(result);
       }
        System.out.print(sb);
    }
}
