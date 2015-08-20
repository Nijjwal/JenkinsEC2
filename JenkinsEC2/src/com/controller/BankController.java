package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/BankController")
public class BankController extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//request dispatcher
		RequestDispatcher rd = request.getRequestDispatcher("/welcome.jsp");
		
		//get values and print on terminal
		String balance = request.getParameter("balance");
		String amount = request.getParameter("amount");
		int balanceLeft = Integer.parseInt(balance)-Integer.parseInt(amount);
		String currentBalance = ""+balanceLeft;
		
		System.out.println("Balance is: "+ balance);
		System.out.println("Amount is: " + amount);
		System.out.println("Amount left is : " + balanceLeft);
		
		HttpSession session = request.getSession();
		session.setAttribute("balance", balance);
		session.setAttribute("amount", amount);
		session.setAttribute("balanceLeft", currentBalance);
		
		//get 
		rd.forward(request, response);
	}
	
}
