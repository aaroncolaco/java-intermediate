package com.multithreading.threeFour;

public class Storage {
	
	private int number;
	private boolean numberSetFlag;
	
	public Storage() {
		number = 0;
		numberSetFlag = false;
	}
	
	
	/*
	 * if numberSetFlag==false:
	 * 	wait
	 * else:
	 * 	set to false, notify, return
	 */
	public synchronized int getNumber() {

		if (!numberSetFlag) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		/* ******
		 * can be put inside an else block without any problem
		 */
		numberSetFlag = false;
		notify();
		return this.number;
	}

	
	/*
	 * if numberSetFlag==false:
	 * 	save new number, set to true, notify 
	 * else: wait
	 */
	public synchronized void setNumber(int number) {

		if (!numberSetFlag) {
			this.number = number;
			numberSetFlag = true;
			notify();
		}
		
		 /* ********* 
		  * if try is put inside an else block, 
		  * skips a number while writing. WHYYY??? 
		  */
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
