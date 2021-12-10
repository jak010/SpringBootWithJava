package com.example.demo;

import com.example.demo.InterCeptor.ConnectInterceptor;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Parameter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Objects;

public class MysqlConTest {


    private static final String Url = "jdbc:mysql://localhost:3306/employees";
    private static final String Parameter = "?serverTimezone=UTC&characterEncoding=UTF-8&useSSL=false";
    private static final String FQDN =Url +Parameter;

    private static final String user = "root";
    private static final String password = "1234";

    @Test
    public void testConn() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String emp_no = "";
        try {
            Connection con = DriverManager.getConnection(FQDN, user, password);
            emp_no = getName(con, 10001);
        } catch (Exception e) {
            e.printStackTrace();
        }

        assert Objects.equals(emp_no, "10001");
    }


    public String getName(Connection con, Integer seq) throws Exception {
        String res = null;
        String sqlQuery = "select emp_no from employees where emp_no=?";

        try {
            PreparedStatement pstmt = con.prepareStatement(sqlQuery);
            pstmt.setString(1, seq.toString());
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) res = rs.getString("emp_no");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
