package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import Model.StudentModel;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentController extends HttpServlet {
    StudentModel studentmodel = new StudentModel();
    Studentlogic studentlogic = new Studentlogic();

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int ecno = Integer.valueOf(request.getParameter("ecno"));
        String studentname = request.getParameter("studentname");
        String studentfeedback = request.getParameter("studentfeedback");

        studentmodel.setEcno(ecno);
        studentmodel.setStudentname(studentname);
        studentmodel.setStudentfeedback(studentfeedback);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1 style='color:green'>" + studentlogic.storestudentlogic(studentmodel) + "</h1>");
    }
}