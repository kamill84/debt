package pl.alx.debt.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import pl.alx.debt.Dao.DebtorDao;
import pl.alx.debt.model.Debtor;

@Controller
public class DebtorController {

    @Autowired
    private DebtorDao debtorDao;

    @PostMapping("/debtor/create")
    public String createDebtor(@ModelAttribute DebtorForm debtorForm) {

    Debtor debtor = new Debtor(debtorForm.getFirstName(),
                                debtorForm.getLastName(),
                                debtorForm.getEmail());

    debtorDao.save(debtor);

        return "redirect:/debt/create";

}

}
