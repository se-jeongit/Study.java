import java.util.Scanner;

public class Assignment8_Taxation {

	public static void main(String[] args) {
		// 연소득에 따른 구간별 세금 기준 작성 프로그램
		Scanner sc = new Scanner(System.in);
		
		// 연소득 금액		
		int money = 0;
		// 과세 금액
		double tax = 0;
		// 누진공제 계산 금액
		double deduction = 0;
		
		System.out.print("[과세금액 계산 프로그램]\n");
		System.out.print("연소득을 입력해 주세요.:");
		money = sc.nextInt();
		sc.close();
		
		// 구간별 세금
		int[] sectionTax = {0, 12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 1000000000};
		// 구간별 세금 비율
		int[] sectionTaxRate = {0, 6, 15, 24, 35, 38, 40, 42, 45};
		// 구간별 누진공제
		int[] sectionTaxDeduction = {0, 0, 1080000, 5220000,  14900000, 19400000, 25400000, 35400000, 65400000};
		
		// 구간별 세금 계산 시 구간 계산을 위한 값
	    int minusValue = 0;
	    
	    // 구간별 세금 계산 및 출력 반복문
	    for (int i = 1; i < sectionTax.length; i++) {
	    	if (money > sectionTax[i - 1] && money <= sectionTax[i]) {
	    		for (int j = 1; j < i; j++) {
	    			tax += ( sectionTax[j] - sectionTax[j - 1]) / 100 * sectionTaxRate[j];
	    			System.out.print(String.format("%10d", sectionTax[j] - sectionTax[j - 1]) + " * "
	    					+ String.format("%2d%%", sectionTaxRate[j]) + " = \t"
	    					+ String.format("%10d", (sectionTax[j] - sectionTax[j - 1]) / 100 * sectionTaxRate[j]));
	    			System.out.println("");	
	    			minusValue = sectionTax[j];
	    		}
	    		
	    		deduction = money / 100 * sectionTaxRate[i] - sectionTaxDeduction[i];
	    		tax += (money - minusValue) / 100 * sectionTaxRate[i];
	    		System.out.print(
	    				String.format("%10d", money - minusValue) + " * " + String.format("%2d%%", sectionTaxRate[i])
	    				+ " = \t" + String.format("%10d", (money - minusValue) / 100 * sectionTaxRate[i]));
	    		System.out.println("");
	    	}
	    }
	    System.out.printf("\n[세율에 의한 세금]:\t\t\t%.0f\n", tax);
	    System.out.printf("[누진공제 게산에 의한 세금]:\t\t%.0f", deduction);		
	}
}