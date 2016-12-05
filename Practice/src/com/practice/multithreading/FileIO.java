package com.practice.multithreading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileIO {

	BufferedReader bufferedReader;
	String consoleString = "";

	boolean writeFlag = true;

	public FileIO() {
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}

	public synchronized void appendToFile() {

		// if writeFlag==true, write to file
		// set writeFlag to false
		// notify()
		// else, wait() --> wait to be notified

		if (writeFlag) {
			try (BufferedWriter bufferedWriter = new BufferedWriter(
					new FileWriter("./consoleData.txt", true));) {

				System.out.println("Appending to file . . .");
				bufferedWriter.append(consoleString + "\n");
				bufferedWriter.flush();
				writeFlag = false;
			} catch (IOException e) {
				e.printStackTrace();
			}
			writeFlag = false;
			notify();
		}

		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public synchronized void readFromConsole() {

		// if writeFlag==false, read from console
		// set writeFlag to true
		// notify()
		// else, wait() --> wait to be notified

		if (!writeFlag) {
			try {
				System.out.print("Enter input: ");
				consoleString = bufferedReader.readLine().trim();
			} catch (IOException e) {
				e.printStackTrace();
			}
			writeFlag = true;
			notify();
		}

		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
