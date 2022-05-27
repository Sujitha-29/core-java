package com.chainsys.miniproject.pojo;

import java.util.Date;

public class Appointment
{
	private int app_Id;
	private Date app_date;
	private int  doc_id;
	private String  patient_name;
	private float  fees_collected;
	private String fees_nature;
	public int getApp_Id() 
	{
		return app_Id;
	}
	public void setApp_Id(int app_Id) 
	{
		this.app_Id = app_Id;
	}
	public Date getApp_date()
	{
		return app_date;
	}
	public void setApp_date(Date app_date) 
	{
		this.app_date = app_date;
	}
	public int getDoc_id() 
	{
		return doc_id;
	}
	public void setDoc_id(int doc_id) 
	{
		this.doc_id = doc_id;
	}
	public String getPatient_name()
	{
		return patient_name;
	}
	public void setPatient_name(String patient_name) 
	{
		this.patient_name = patient_name;
	}
	public float getFees_collected() 
	{
		return fees_collected;
	}
	public void setFees_collected(float fees_collected) 
	{
		this.fees_collected = fees_collected;
	}
	public String getFees_nature() 
	{
		return fees_nature;
	}
	public void setFees_nature(String fees_nature) 
	{
		this.fees_nature = fees_nature;
	}
	
}
