package com.kitri.guestbook;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuestBoolWrite
 */
@WebServlet("/gbwrite")
public class GuestBoolWrite extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//내용이 기니까 post
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}