package eBebek;


public class Employee {
	int currentYear = 2021;
	private String name;
	private float salary;
	private float workHours;
	private float hireYear;
	public Employee(String name, float salary, float workHours, float hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;	
	}
	
	public float tax() {
		float taxValue = 0 ;
		if (this.salary < 1000) {
			taxValue += (float) 0 * salary;
		}
		else {
			taxValue += (float) 0.03 * salary;
		}
		return taxValue;
	}
	
	public float bonus() {
		float bonus = 0;
		if(this.workHours > 40) {
			bonus = (float) 30 * (workHours - 40);
		}
		return bonus;
	}
	
	public float raiseSalary() {
		float workYear = (currentYear-this.hireYear);
		float raiseValue = 0;
		float newSalary = salary + bonus() - tax();
		if( workYear< 10) {
			raiseValue = (float) (0.05 * newSalary);
		}
		else if(workYear > 9 && workYear < 20) {
			raiseValue = (float) (0.1 * newSalary);
		}
		else if(workYear > 19) {
			raiseValue = (float) (0.15 * newSalary);
		}
		
		return raiseValue;
	}
	//Overriding toString() method  
	@Override  
	public String toString() {
		float salaryWithTaxAndBonus = salary + bonus() - tax();
		float allSalary = salary + raiseSalary() + bonus();
	    return 	"Adı : " + name 
	    		+ "\nMaaşı : " + salary 
	    		+ "\nÇalışma Saati : " + workHours 
	    		+ "\nBaşlangı. Yılı = " + hireYear  
	            + "\nVergi = " + tax() 
	            + "\nBonus = " + bonus() 
	            + "\nMaaş Artışı : " + raiseSalary()
	            + "\nVergi ve Bonuslar ile birlikte maaş : "+ salaryWithTaxAndBonus 
	            + "\nToplam Maaş : " + allSalary;  
	    } 
	
}



