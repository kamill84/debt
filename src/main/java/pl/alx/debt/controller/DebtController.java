package pl.alx.debt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.alx.debt.Dao.DebtDao;
import pl.alx.debt.Dao.DebtorDao;
import pl.alx.debt.Dao.UserDao;
import pl.alx.debt.model.Debt;
import pl.alx.debt.model.Debtor;
import pl.alx.debt.model.User;
import sun.swing.BakedArrayList;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Controller
public class DebtController {


    @Autowired
    private DebtDao debtDao;

    @Autowired
    private DebtorDao debtorDao;

    @Autowired
    private UserDao userDao;


    @GetMapping("/debts")
    public String debthPage(Model model, Principal principal) {

        String email = principal.getName();
        User loggedInUser = userDao.findByEmail(email);

        List<Debt> debts = debtDao.findByLender(loggedInUser);
        model.addAttribute("debts", debts);
        return "debt-list";

    }


    @GetMapping("/debts/create")
    public String debtForm(Model model) {
        List<Debtor> debtors = debtorDao.findAll();
        model.addAttribute("debtors", debtors);
        return "debt-form";

    }




    @PostMapping("/debts/create")
    public String saveDebt(@RequestParam Integer debtorId,@RequestParam BigDecimal amount,Principal principal){

        String email = principal.getName();


        User lender = userDao.findByEmail(email);
        Optional<Debtor> debtor = debtorDao.findById(debtorId);
        debtorDao.findById(debtorId);

        Debt debt = new Debt(lender,debtor.get(), amount);
        debtDao.save(debt);
        return "redirect:/debts";


    }






}
