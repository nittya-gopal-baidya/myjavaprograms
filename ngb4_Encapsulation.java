class StateBankOfIndia {
    private double balance;

    public StateBankOfIndia(double depo_amount){
        this.balance=depo_amount;
    }
    public void updateBalance(double amount) {
        this.balance = this.balance + amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class ngb4_Encapsulation {
    public static void main(String[] args) {
        StateBankOfIndia sbi=new StateBankOfIndia(1000);
        sbi.updateBalance(500);
        System.out.println("Bank Balance = "+sbi.getBalance());
    }
}
