package com.example.assignment1.controller;

import com.example.assignment1.entity.Food;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ListFoodServlet extends HttpServlet {

    public static ArrayList<Food> list = new ArrayList<>();
    {
        list.add(new Food(1, "Food 1", 1, "Food 1", "", 1000,"1000"));
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/admin/food/list.jsp").forward(req,resp);
    }
}
