package com.chainsys.miniproject.entry;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;
import com.chainsys.miniproject.test.TestAppointment;
import com.chainsys.miniproject.test.TestDoctor;
import com.chainsys.miniproject.test.TestEmployeeDao;
import com.chainsys.miniproject.ui.AppointmentUi;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

public class Startup
{

	public static void main(String[] args)
	{
			loadMenu();
	}

		private static void loadMenu() {
			System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
			java.util.Scanner sc = new java.util.Scanner(System.in);
	      try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				loadEmployeeMenu();
				break;
			case 2:
				loadDoctorMenu();
				break;
			case 3:
				loadAppointmentMenu();
				break;
			}
	      }finally {
	    	  sc.close();
	      }
		}

		private static void loadEmployeeMenu()
		{
			System.out.println(
					"Enter Employee Method : 1=addEmployee, 2=getEmployeeById ,3=upadateEmployee, 4=deleteEmployee, 5=getAllEmployeeDetails");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try
			{
			int call = sc.nextInt();
			switch (call) 
			{
			case 1:
				EmployeeUi.addNewEmployee();
				break;
			case 2:
				EmployeeUi.viewEmployeeDetailsById();
				break;
			case 3:
				EmployeeUi.updateEmployeeDetails();
				break;
			case 4:
				EmployeeUi.deleteEmpdetails();
				break;
            case 5:
				EmployeeUi.ViewAllEmployeeDetails();
				break;
			}
			}finally {
				sc.close();
			}
		}

		private static void loadDoctorMenu()
		{
			System.out.println("Enter Doctor Method : 1=addNewDoctor ,2=DoctorById ,3=updateDoctor , 4=getAllDoctorDetails, 5=deleteDoctor");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				DoctorUi.addNewDoctor();
				break;
			case 2:
				DoctorUi.viewDoctorDetails();;
				break;
			case 3:
				DoctorUi.updateDoctorDetails();;
				break;
			case 4:
				DoctorUi.ViewAllDoctorDetails();
				break;
			case 5:
				DoctorUi.deleteDoctordetails();
				break;
			}
			}finally {
				sc.close();
			}
		}

		private static void loadAppointmentMenu() 
		{
			System.out.println("Enter Method : 1=addNewAppointment ,2=AppointmentDetailsById ,3=updateAppointment,4=getAllAppointmentDetails ,5=deleteAppointment");
			java.util.Scanner sc = new java.util.Scanner(System.in);
			try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				AppointmentUi.addNewAppointments();
				break;
			case 2:
				AppointmentUi.viewAppointmentDetailsById();
				break;
			case 3:
				AppointmentUi.updateAppointmentDetails();
				break;
			case 4:
				AppointmentUi.ViewAllAppointmentDetails();
				break;
			case 5:
				AppointmentUi.deleteAppointmentDetails();
				break;
			}
			}finally {
				sc.close();
			}
		}
}
	
