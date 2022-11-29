public class bank {
    private double withdraw;
    private  double loan;
    private  double deposit;
    private  double passbook;
    private double  credit;
    private double debit;

    public bank(double withdraw, double loan, double deposit, double passbook, double credit, double debit) {
        this.withdraw = withdraw;
        this.loan = loan;
        this.deposit = deposit;
        this.passbook = passbook;
        this.credit = credit;
        this.debit = debit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getPassbook() {
        return passbook;
    }

    public void setPassbook(double passbook) {
        this.passbook = passbook;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getDebit() {
        return debit;
    }

    public void setDebit(double debit) {
        this.debit = debit;
    }
}




