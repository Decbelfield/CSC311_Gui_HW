package com.example.csc311hw2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private Label txtAnnual;
    @FXML
    private Label txtNumOfYears;
    @FXML
    private Label txtLoanAmt;
    @FXML
    private Label txtMonthPay;
    @FXML
    private Label txtTotal;

    @FXML
    private TextField annualTF;
    @FXML
    private TextField numOfYearsTF;
    @FXML
    private TextField loanAmtTF;

    @FXML
    private Button btnCalc;


    @FXML
    protected void lblAnnual() {
        txtAnnual.setText("Annual Interest Rate:");
    }

    @FXML
    protected void lblYear() {
        txtNumOfYears.setText("Number Of Years:");
    }

    @FXML
    protected void lblLoan() {
        txtLoanAmt.setText("Loan Amount:");
    }

    @FXML
    protected void lblMonthAmt() {
        txtMonthPay.setText("Monthly Payment:");
    }

    @FXML
    protected void lblTotal() {
        txtTotal.setText("Total:");
    }

    @FXML
    protected void calculateLoan() {
        double annualInterestRate = getNum(annualTF) / 100.0;
        int numOfYears = (int) getNum(numOfYearsTF);
        double loanAmount = getNum(loanAmtTF);

        double monthlyPay = (loanAmount * annualInterestRate * numOfYears) / 12.0;
        double totalPay = (monthlyPay * 12.0 * numOfYears);

        txtMonthPay.setText(String.format("$%.2f", monthlyPay));
        txtTotal.setText(String.format("$%.2f", totalPay));
    }

    private double getNum(TextField textField) {
        return Double.parseDouble(textField.getText());
    }

    protected void initialize() {
        // Initialize other components and bindings here if needed

        // Set the action handler for the button
        btnCalc.setOnAction(e -> calculateLoan());
    }
}
