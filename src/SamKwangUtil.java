import java.sql.*;

public class SamKwangUtil {
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;

    static String URL = "jdbc:mariadb://mariadb.cpjqbyvk0luc.ap-northeast-2.rds.amazonaws.com:3306/playground";
    static String DRV = "org.mariadb.jdbc.Driver";
    static String USER = "playground";
    static String PWD = "playground2020";

    public static Connection makeConn(){
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL,USER,PWD);
        } catch (ClassNotFoundException e) {
            System.out.println("드라이버 오류");
        } catch (SQLException throwables) {
            System.out.println("URL,ID,PW중 오류");
        }
        return conn;
    }

    public static void destroyConn(Connection conn, PreparedStatement pstmt){
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {

            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
            } catch (SQLException throwables) {
                }
        }
    }

    public static void destroyConn(Connection conn, PreparedStatement pstmt, ResultSet rs){
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                }
        }
        destroyConn(conn,pstmt);
    }

}
