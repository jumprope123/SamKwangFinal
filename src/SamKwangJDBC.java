public class SamKwangJDBC extends SamKwangUtil{

    public static String readCODP =
            "select * from CODP order by 주문번호 desc";

    public static String readSOE =
            "select 인사번호,주문번호,운송ID,운송이름,주문일,직책 from SOE order by 운송ID desc";

    public static String readOneCODP =
            "select * from CODP where 제품번호 = ?";

    public static String readOneSOE =
            "select * from SOE where 운송ID = ?";

    public static String newCust =
            "insert into 고객 values(?,?,?,?,?,?)";

    public static String readCust =
            "select 고객번호,고객이름,전화번호 from 고객 ";

    public static String readOneCust =
            "select * from 고객 where 고객번호 = ?";

    public static String modifyCust =
            "";

    public static String deleteCust =
            "";
}
