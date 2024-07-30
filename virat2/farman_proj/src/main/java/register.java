

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;

   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://128.66.203.247/imsc7it289","imsc7it289","sumo@123");
			String name = request.getParameter("name");
            String address = request.getParameter("address");
            String email = request.getParameter("email");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String gender = request.getParameter("gender");
            String[] courses = request.getParameterValues("courses");
            
            PreparedStatement pstmt=con.prepareStatement("INSERT INTO USERS (name, address, email, username, password, gender, courses) VALUES (?, ?, ?, ?, ?, ?,?");
            pstmt.setString(1, name);
            pstmt.setString(2, address);
            pstmt.setString(3, email);
            pstmt.setString(4, username);
            pstmt.setString(5, password);
            pstmt.setString(6, gender);

            StringBuilder coursesStr = new StringBuilder();
            if (courses != null && courses.length > 0) {
                for (int i = 0; i < courses.length; i++) {
                    coursesStr.append(courses[i]);
                    if (i < courses.length - 1) {
                        coursesStr.append(", ");
                    }
                }
            }
            pstmt.setString(7, coursesStr.toString());
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                response.getWriter().println("Registration successful!");
            } else {
                response.getWriter().println("Registration failed!");
            }

            	
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
