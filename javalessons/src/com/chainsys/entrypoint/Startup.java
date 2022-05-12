package com.chainsys.entrypoint;


import com.chainsys.collections.ListArrayListDemo;
import com.chainsys.exceptions.DemoTrace;
import com.chainsys.interfaces.TestVehicle;
import com.chainsys.unittest.TestAbsDemoA;
import com.chainsys.unittest.TestAbsDemoB;



/***
 * 
 * @author suji3135
 * @version 1.0
 * date:Mar 3 2022
 * @category classroom lessons
 * purpose:entry point class for the entire project
 */

public class Startup {
        /***
         * purpose portable executable entry point for the 
         * @param args type String
         *@return void
         */

        public static void main(String[] args) {
               // WorkingWithDate.displayDOB();
        	//StringLessonA.testSplit();
        	// DemoA.workingWithArrayClass();
        	//TwoDimDemo.calculateTotalandAverage();
        	//ArraySolution.Bubblesort();
        	//DemoTrace.m4();
        	//DemoTrace.m3();
        	//DemoTrace.m2();
        	//A.m4();
        	//TestAbsDemoB.testDemoB();
        	//TestAbsDemoA.testDemoA();
        	//TestVehicle.testvehicle(); 
        	ListArrayListDemo.usingStringArrayList();
        	
        }

}
