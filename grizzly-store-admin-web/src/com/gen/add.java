package com.gen;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.*;


public class add extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
	int id=Integer.parseInt(request.getParameter("Product_id"));
	String cate=request.getParameter("Category");
	String name=request.getParameter("Name");
    String disc=request.getParameter("Disciption");
	String price=request.getParameter("Price");
    String im=request.getParameter("file");
    File image= new File(im);

	  FileInputStream   fis=new FileInputStream(image);
    try{
    	String query="insert into Products values(?,?,?,?,?,?)";
    	Class.forName("oracle.jdbc.driver.OracleDriver");  
    	  
    	//step2 create  the connection object  
    	Connection con=DriverManager.getConnection(  
    	"jdbc:oracle:thin:@localhost:1521:xe","system","root");  
    	  
    	//step3 create the statement object  
    	PreparedStatement stmt=con.prepareStatement(query);  
    	stmt.setInt(1,id);
    	stmt.setString(2,cate);
    	stmt.setString(3, name);
    	stmt.setString(4, disc);
    	stmt.setString(5, price);
    	stmt.setBinaryStream(6, (InputStream) fis, (int) (image.length()));
       
        int i=stmt.executeUpdate();
       if(i>0){
    	   response.sendRedirect("retrieve_product.jsp");
       }
    }catch(Exception e){
    	System.out.println(e);
    }


	
	}

}
