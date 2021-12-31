package com.example.assignment1.controller;

import com.example.assignment1.entity.Food;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ListFoodServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", list);
        req.getRequestDispatcher("/admin/food/list.jsp").forward(req,resp);
    }
}
