package mvc.Model;

public class Calculator {
    private Double number1;
    private Double number2;
    private String operator;

    public Calculator(Double number1, Double number2, String operator) {
        this.number1 = number1;
        this.number2 = number2;
        this.operator = operator;
    }

    public Double calculations() {
        if (number1 == null || number2 == null || operator == null) {
            return null;
        }
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return number1 / number2;
        }
        return null;
    }

    public Double getNumber1() {
        return number1;
    }

    public Double getNumber2() {
        return number2;
    }

    public String getOperator() {
        return operator;
    }
}
