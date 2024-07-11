class StateBankOfIndia {                                            // Encapsulation = data hiding + abstraction
    private int balance;//variaqbles 

    public void setBalance(int deposit_amount) {//r3equired methods 
        this.balance = deposit_amount;
    }

    public int getBalance() {
        return this.balance;
    }
}

public class Ex8_Encapsulation {
public static void main(String[] args) {
    StateBankOfIndia shruti=new StateBankOfIndia();
    shruti.setBalance(1000);
    System.out.println(shruti.getBalance());

}
}
