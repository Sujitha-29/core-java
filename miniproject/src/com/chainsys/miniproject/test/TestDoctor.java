package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;
import com.chainsys.miniproject.pojo.Employee;

public class TestDoctor
{
	public static void testGetAllDoctor() 
	{
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> docIterator =allDoctor.iterator();
		while(docIterator.hasNext()) {
			Doctor doc = docIterator.next();
			System.out.println(doc.getDoc_id()+" "+doc.getDoc_name()+" "+doc.getDob());
		}
	}
	public static void testGetDoctorById() 
	{
		Doctor doc = DoctorDao.getDoctorByID(107);
		System.out.println(doc.getDoc_id()+" "+doc.getDoc_name()+" "+doc.getDob());
	}
	public static void testInsertDoctor()
	{
		Doctor newdoc = new Doctor();
		newdoc.setDoc_id(110);
		newdoc.setDoc_name("saroo");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate =new java.util.Date();
		newdoc.setDob(newDate);
		newdoc.setSpeciality("Family Physicians");
		newdoc.setCity("Dindigul");
		newdoc.setPhone_no(9988776655L);
		newdoc.setStandard_fees(5000);
		int result = DoctorDao.insertDoctor(newdoc);
		System.out.println(result);
	}			
	public static void testUpdateDoctor() 
	{
		Doctor oldDoctor = DoctorDao.getDoctorByID(102);
		System.out.println(oldDoctor.getDoc_id()+" "+oldDoctor.getDoc_name()+" "+oldDoctor.getDob()+" "+oldDoctor.getSpeciality()+" "+oldDoctor.getCity()+" "+oldDoctor.getPhone_no()+" "+oldDoctor.getStandard_fees());
		oldDoctor.setDoc_name("surv");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate =c1.getTime();
		oldDoctor.setDob(newDate);
		oldDoctor.setSpeciality("Dermatologists");
		oldDoctor.setCity("madurai");
		oldDoctor.setPhone_no(9090909090L);
		oldDoctor.setStandard_fees(3000);
		int result = DoctorDao.updateDoctor(oldDoctor);
		System.out.println(result);
	}		
	public static void testDeleteDoctor() 
	{
		Doctor newdoc =new Doctor();
		newdoc.setDoc_id(102);
		int result = DoctorDao.deleteDoctor(110);
		System.out.println(result);
	}
}