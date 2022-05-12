package com.chainsys.overload;

	class Nokia extends Phone {
	    //public void makeCall()
	    //{
	       // System.out.println("call made from nokia");
	    //}
	
	}
	class Result{
	    public void callResult(){
	    Nokia ph=new Nokia();
	    ph.makeCall();
	    ph.sendSms();
	    ph.makeCall();}
	}


