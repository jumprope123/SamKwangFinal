import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SamKwangCustDAO {

    public static String newCust(SamKwangCustVO skcv) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        String result = null;
        conn = SamKwangJDBC.makeConn();

        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.newCust);
            pstmt.setInt(1,skcv.getCustNo());
            pstmt.setString(2,skcv.getCustName());
            pstmt.setString(3,skcv.getCustAddr());
            pstmt.setString(4,skcv.getCustCity());
            pstmt.setString(5,skcv.getPostNo());
            pstmt.setString(6,skcv.getCallNo());
            int cnt = pstmt.executeUpdate();
            if (cnt>0) result = "새 고객 업데이트 완료!";
        } catch (SQLException throwables) {
            System.out.println("sql문 오류");
        }
        return result;
    }

    public static ArrayList<SamKwangCustVO> readCust() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<SamKwangCustVO> skcvs = new ArrayList<>();

        conn = SamKwangJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.readCust);
            rs = pstmt.executeQuery();
            while (rs.next()){
                SamKwangCustVO skcv = new SamKwangCustVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3)
                        );
                skcvs.add(skcv);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            System.out.println("SQL구문 오류발생");
        }
        SamKwangJDBC.destroyConn(conn,pstmt,rs);
        return skcvs;

    }

    public static SamKwangCustVO readOneCust(int inputNo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        SamKwangCustVO skcv = null;

        conn = SamKwangJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.readOneCust);
            pstmt.setInt(1,inputNo);
            rs = pstmt.executeQuery();
            if (rs.next()){
                skcv = new SamKwangCustVO(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                        );
            }
        } catch (SQLException throwables) {
            System.out.println("SQL구문오류");
        }
        return skcv;
    }
}
