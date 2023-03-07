package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String depart = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		sc.nextLine();
		String email = sc.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.nextLine();
		
		Address address = new Address(email, phone);
		Department department = new Department(depart, payDay, new Address(email, phone));
		
		System.out.print("Quantos funcionários tem o departamento? ");
		Integer employees = sc.nextInt();
		
		for(int i = 1; i<=employees; i++) {
			sc.nextLine();
			System.out.println("Dados do funcionário " + i + ": ");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Salário: ");
			double salary = sc.nextDouble();
			
			Employee employee = new Employee(name, salary);
			
			department.addEmployee(employee);
		}
		
		System.out.println();
		
		showReport(department);
		
		sc.close();
	}
	
	private static void showReport(Department department) {
			System.out.print(department);
		}

}
