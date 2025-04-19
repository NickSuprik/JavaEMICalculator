# EMI Calculator

## Overview
This Java-based EMI (Equated Monthly Installment) calculator computes the monthly installment amount for a given loan based on the principal amount, annual interest rate, and tenure in years.

## Formula Used
The EMI calculation is based on the standard formula:



\[
EMI = \frac{P \times R \times (1+R)^N}{(1+R)^N - 1}
\]



Where:
- **P** = Principal loan amount (USD)
- **R** = Monthly interest rate (`Annual Interest Rate / 12 / 100`)
- **N** = Loan tenure in months (`Tenure Years * 12`)

## Features
- User inputs loan amount, annual interest rate, and loan tenure.
- Calculates and displays the monthly EMI.
- Uses Java's `Scanner` class for user input.
- Implements mathematical functions using `Math.pow()`.

## Installation & Usage
1. Clone or download the project.
2. Open the project in any Java IDE (Eclipse, IntelliJ, VS Code, etc.).
3. Compile and run `EMICalculator.java`.
4. Enter the required loan details when prompted.
5. The program will display the computed EMI.

## Example Run

Enter your loan amount in USD 50000 Enter your annual interest rate (in %) 7.5 Enter your loan tenure in years 15 Your Monthly EMI is 463.33

## Dependencies
- Java Development Kit (JDK)
- Any standard Java IDE (optional)

## Future Enhancements
- GUI-based interface for better user interaction.
- Support for multiple loan types (home, car, personal loans).
- Addition of amortization schedule display.

## License
This project is open-source and free to use.

---

