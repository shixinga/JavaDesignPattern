package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import test.OperationFactory;

import base.Operation;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("请输入第一个数");
			double numOne = Double.parseDouble(br.readLine());
			System.out.println("请输入第2个数");
			double numTwo = Double.parseDouble(br.readLine());
			System.out.println("请输入操作符");
			String ope = br.readLine();
			
			double result = 0;
			Operation operation = OperationFactory.createOperation(ope);
			if(operation != null) {
				operation.setNumOne(numOne);
				operation.setNumTwo(numTwo);
				result = operation.operate();
			}
			System.out.println("结果为" + result);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
