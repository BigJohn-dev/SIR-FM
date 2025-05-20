import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATMTest {
	private ATM atm = new ATM();
	private Account[] accounts = {new Account("John", "0123456789", 50.00), new Account("James", "9876543210", 50000.00), new Account("Bolaji", "0123456789", 500.00)};

	@BeforeEach
	public void setUp() {
	atm.setAccounts(accounts);
}
	@Test
	public void testWithdrawFunds() {
	atm.withdraw(accounts[1].getAccountNumber(), 20000);
	System.out.println(accounts[1]);
	assertEquals(30000, accounts[1].getBalance());
}

	@Test
	public void testWithdrawNegativeAmountThrowsExecption() {
	atm.withdraw(accounts[1].getAccountNumber(), -30_000);
	assertThrows();


}