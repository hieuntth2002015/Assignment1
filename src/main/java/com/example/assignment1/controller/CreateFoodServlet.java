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
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setCharacterEncoding("UTF-8");
            String name = req.getParameter("name");
            String category = req.getParameter("category");
            String description = req.getParameter("description");
            String thumbnail = req.getParameter("thumbnail");
            double price = Double.parseDouble(req.getParameter("price"));
            SimpleDateFormat formater =  new SimpleDateFormat("yyyy-MM-dd");
            Date startDate = formater.parse(req.getParameter("startDate"));
            Date updateDate = formater.parse(req.getParameter("updateDate"));
            System.out.println(startDate);
            System.out.println(updateDate);
            int status = Integer.parseInt(req.getParameter("status"));
            // validate data.

            // tạo ra đối tượng của lớp product.
            Food food = new Food(name, category, description, thumbnail, price, startDate, updateDate, status);
            // kiểm tra tính hợp lệ bằng hàm isValidate
            if (food.isValid()) {
                foodJpaRepository.save(food);
                resp.sendRedirect("/admin/food/list");
            } else {
                // trong trường hợp lỗi thì,
                // trả về lại chính form đó,
                // kèm theo thông tin lỗi
                HashMap<String, String> errors = food.getErrors();

                req.setAttribute("errors", errors);
                // trả về thông tin food đang bị lỗi để show lại cho người dùng.
                req.setAttribute("food", food);
                req.getRequestDispatcher("/admin/food/form.jsp").forward(req, resp);
            }
        } catch (Exception ex) {
            resp.getWriter().println("Bad Request");
            System.out.println(ex.getMessage());
        }
    }
}
