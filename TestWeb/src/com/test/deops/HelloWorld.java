package com.test.deops;

//Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

//Extend HttpServlet class
public class HelloWorld extends HttpServlet {

private String message;

public void init() throws ServletException
{
   // Do required initialization
   message = "Hello World MLI3";
}

public void doGet(HttpServletRequest request,
                 HttpServletResponse response)
         throws ServletException, IOException
{
   
   System.out.println("New Changes");
   System.out.println("changing for demo");
   // Set response content type
   response.setContentType("text/html");
  System.out.println("Test to hyo");
   // Actual logic goes here.
   PrintWriter out = response.getWriter();
   out.println("<h1>" + message + "</h1>");
}

public void destroy()
{
   // do nothing.
}
}


