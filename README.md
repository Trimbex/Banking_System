# Banking System

A simple, object-oriented banking system built in Java. The project simulates core banking operations, including account management, transactions (deposit, withdraw, transfer), customer management, and loan processing. It uses a Swing GUI for user interaction.

## Features

- **Account Management**
  - Create new customer accounts with personal details and account type.
  - Update customer details: password, username, phone number, address.
  - Display account information and transaction history.

- **Transaction Handling**
  - Deposit, withdraw, and transfer funds between accounts.
  - Transaction log for each account.
  - Transaction details include type and amount.

- **Customer Management**
  - Register new customers, preventing duplicate usernames.
  - Store customer data and login information.

- **Loan Processing**
  - Apply for loans with configurable rate, term, and purpose.
  - Eligibility check based on minimum account balance.
  - Calculate interest and track loan status.

- **Graphical User Interface**
  - Basic home screen and navigation using Java Swing.
  - Buttons for deposit, withdrawal, loan processing, transfer, inquiry, transaction history, and account details.
  - Personalized welcome message.

## Technologies Used

- **Language:** Java
- **GUI:** Swing (javax.swing)
- **Data Structures:** ArrayList, HashMap

## Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com/Trimbex/Banking_System.git
   cd Banking_System
   ```

2. **Compile the project**
   ```bash
   javac *.java
   ```

3. **Run the application**
   ```bash
   java Main
   ```

## Project Structure

- `Main.java` – Entry point; demonstrates sample operations.
- `Customer.java` – Customer data and methods for account access.
- `BankAccount.java` – Handles balance, transactions, and account type.
- `Transactions.java` – Transaction object and string formatter.
- `LoanProcessing.java` – Loan application, eligibility, and interest calculation.
- `ManageAccount.java` – Methods for updating customer details.
- `Register.java` – Account registration logic.
- `home.java` – Basic Swing GUI for banking operations.

## Contributing

Pull requests and suggestions are welcome!  
Please fork the repository and submit a pull request for review.

## Contact

Open an issue on [GitHub Issues](https://github.com/Trimbex/Banking_System/issues) for support or questions.
