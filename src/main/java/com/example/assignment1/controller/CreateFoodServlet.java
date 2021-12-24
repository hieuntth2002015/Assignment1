package com.example.assignment1.controller;

import com.example.assignment1.entity.Food;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateFoodServlet extends HttpServlet {

    @Override
    protected  void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException,IOException {
        req.getRequestDispatcher("/admin/food/form.jsp").forward(req,resp);
    }

}
