public class SamKwangJDBC extends SamKwangUtil{

    public static String readCODP =
            "select * from 고객 c join 주문 o using (고객번호) join 주문항목 ol using (주문번호) join 제품 p using (제품번호)";

    public static String readSOE =
            "select * from 운송 s join 주문 o using (주문번호) join 직원 e using (인사번호)";
}
