import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SamKwangDAO {

    public static ArrayList<SamKwangVO> readCODP() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<SamKwangVO> svs = new ArrayList<>();

        conn = SamKwangJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.readCODP);
            rs = pstmt.executeQuery();
            while (rs.next()){
                SamKwangVO sv = new SamKwangVO(
                        Integer.parseInt(rs.getString(1)),
                        Integer.parseInt(rs.getString(2)),
                        Integer.parseInt(rs.getString(3)),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        Integer.parseInt(rs.getString(11)),
                        Integer.parseInt(rs.getString(12)),
                        rs.getString(13),
                        rs.getString(14),
                        Integer.parseInt(rs.getString(15)),
                        Integer.parseInt(rs.getString(16))
                );
                    svs.add(sv);
            }
        } catch (SQLException throwables) {
            System.out.println("sql 구문 오류");
        }
        SamKwangJDBC.destroyConn(conn,pstmt,rs);
        return svs;
    }

    public static ArrayList<SamKwangVO> readSOE() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<SamKwangVO> svs = new ArrayList<>();
        conn = SamKwangJDBC.makeConn();

        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.readSOE);
            rs = pstmt.executeQuery();
            while (rs.next()){
                SamKwangVO sv = new SamKwangVO(
                        Integer.parseInt(rs.getString(1)),
                        Integer.parseInt(rs.getString(2)),
                        Integer.parseInt(rs.getString(3)),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6));
                svs.add(sv);
            }
        } catch (SQLException throwables) {
            System.out.println("SQL구문오류");
        }
        SamKwangJDBC.destroyConn(conn,pstmt,rs);
        return svs;
    }

    public static SamKwangVO readOneCODP(int inputNo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        SamKwangVO sv = null;

        conn = SamKwangJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.readOneCODP);
            pstmt.setInt(1,inputNo);
            rs = pstmt.executeQuery();
            while (rs.next()){
                    sv = new SamKwangVO(
                            Integer.parseInt(rs.getString(1)),
                            Integer.parseInt(rs.getString(2)),
                            Integer.parseInt(rs.getString(3)),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6),
                            rs.getString(7),
                            rs.getString(8),
                            rs.getString(9),
                            rs.getString(10),
                            Integer.parseInt(rs.getString(11)),
                            Integer.parseInt(rs.getString(12)),
                            rs.getString(13),
                            rs.getString(14),
                            Integer.parseInt(rs.getString(15)),
                            Integer.parseInt(rs.getString(16)));
            }
        } catch (SQLException throwables) {
            System.out.println("SQL구문오류");
        }
        SamKwangJDBC.destroyConn(conn,pstmt,rs);
        return sv;

    }


    public static SamKwangVO readOneSOE(int inputNo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        SamKwangVO sv = null;
        conn = SamKwangJDBC.makeConn();
        try {
            pstmt = conn.prepareStatement(SamKwangJDBC.readOneSOE);
            pstmt.setInt(1,inputNo);
            rs = pstmt.executeQuery();
            while (rs.next()){
                sv = new SamKwangVO(
                        Integer.parseInt(rs.getString(1)),
                        Integer.parseInt(rs.getString(2)),
                        Integer.parseInt(rs.getString(3)),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        Integer.parseInt(rs.getString(8)),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13));
            }

        } catch (SQLException throwables) {
            System.out.println("sql구문오류");
        }
        SamKwangJDBC.destroyConn(conn,pstmt,rs);
        return sv;
    }
}
