package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.DbConnection;
import Model.StudentModel;

public class Studentlogic {

    Connection conn = DbConnection.dbconnection();
    String insert = "insert into examtable(ecno,studentname,studentfeedback) values(?,?,?)";

    public String storestudentlogic(StudentModel student) {
        String result = null;
        try {
            PreparedStatement ps = conn.prepareStatement(insert);
            ps.setInt(1, student.getEcno());
            ps.setString(2, student.getStudentname());
            ps.setString(3, student.getStudentfeedback());

            int row = ps.executeUpdate();

            if (row == 1) {
                result = "student feedback stored successfully";
            }
        } catch (SQLException e) {
            result = "register is failed reason:" + e.getMessage();
        }
        return result;
    }
}