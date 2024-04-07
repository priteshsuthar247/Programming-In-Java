import java.util.*;

class Circle {
    private double radius = 2;

    public Circle() {
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}

class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    public Loan() {
        this(2.5, 1, 1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date();
    }

    @Override
    public String toString() {
        return "Loan with annual interest rate : " + annualInterestRate + ", number of years " + numberOfYears
                + ", and loan amount " + loanAmount;
    }
}

public class _33 {
    public static void main(String[] args) {
        ArrayList<Object> o = new ArrayList<Object>();
        o.add(new Loan());
        o.add(new Date());
        o.add(new String("String class"));
        o.add(new Circle());

        for (int i = 0; i < o.size(); i++) {
            System.out.println((o.get(i)).toString());
        }
    }
}
