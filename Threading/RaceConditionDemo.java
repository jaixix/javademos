package Threading;

public class RaceConditionDemo {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + " : Main started");
		BankAccount bankAccount = new BankAccount();
//		bankAccount.withdrawMoney(200);
		Thread max = new Thread(bankAccount);
		Thread anna = new Thread(bankAccount);
		
		max.setName("Max");
		anna.setName("Anna");
		
		max.start();
		anna.start();
		
		System.out.println(Thread.currentThread().getName() + " : Main ended.");
		
	}
}
	
	class BankAccount implements Runnable{
		private int balance;
		public BankAccount() {
			this.balance = 500;
		}

		public void withdrawMoney(int amount) {
			System.out.println(Thread.currentThread().getName() + " : Want to withdraw amount :" + amount);
			if(balance>=amount) {
				balance -= amount;
				System.out.println(Thread.currentThread().getName() + " : Amount withdrawn successfully! New Balance = " + this.balance);
			}
			else {
				System.out.println(Thread.currentThread().getName() + " : Sorry! Amount is greater than balance. Balance = " + this.balance);
			}
			
		}

		@Override
		public void run() {
//			System.out.println(Thread.currentThread().getName() + " Inside BankAccount");
			withdrawMoney(300);
			if(this.balance<0)
				System.out.println(Thread.currentThread().getName() + " Overdrawn");
		}
		
	}
