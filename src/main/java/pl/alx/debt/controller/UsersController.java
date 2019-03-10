package pl.alx.debt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.alx.debt.Dao.DebtorDao;
import pl.alx.debt.Dao.UserDao;
import pl.alx.debt.model.Debt;
import pl.alx.debt.model.User;

import java.security.Principal;
import java.util.List;


@Controller
public class UsersController {


    @Autowired
    private UserDao userDao;




    @GetMapping("/users")
    public String debthPage(Model model) {

        List<User> users = userDao.findAll();
        model.addAttribute("users", users);
        return "user-list";

    }
}
