package mvc;

import mvc.Model.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("/calc")
    public ModelAndView hello(@RequestParam(value = "num1") String number1,
                              @RequestParam(value = "num2") String number2,
                              @RequestParam(value = "op") String operator) {

        Double n1 = null, n2 = null;

        try {
            n1 = Double.parseDouble(number1);
            n2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            n1 = null;
            n2 = null;
        }

        Calculator calculator = new Calculator(n1, n2, operator);
        Map<String, Object> params = new HashMap<>();
        params.put("num1", calculator.getNumber1());
        params.put("op", calculator.getOperator());
        params.put("num2", calculator.getNumber2());
        params.put("res", calculator.calculations());

        return new ModelAndView("hello", params);
    }
}

