package com.stinted.excel.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import lombok.Getter;

import org.apache.log4j.Logger;

public class Execution {
	@Getter private static Logger log = Logger.getLogger(Execution.class);
	@Getter private static int lastExecution;
	
	public static boolean alreadyExecutedToday(){
		log.info("Already executed today?");
		Calendar calendar = GregorianCalendar.getInstance();
		if(calendar.get(GregorianCalendar.DAY_OF_MONTH) == lastExecution){
			log.info("Yes, last execution: "+lastExecution+", today: "+calendar.get(GregorianCalendar.DAY_OF_MONTH));
			return true;
		}
		else{
			log.info("No, last execution: "+lastExecution+", today: "+calendar.get(GregorianCalendar.DAY_OF_MONTH));
			return false;
		}
	}
	
	public static void setAsExecutedToday(){
		Calendar calendar = GregorianCalendar.getInstance();
		lastExecution = calendar.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
//	public static boolean haveExecutionToday(ArrayList<Periodicity> periodicitys){
//		log.info("Verifying if have execution today:");
//		for(Periodicity current : periodicitys){
//			if(current.getInitialDate().isEmpty() == false && current.getFinalDate().isEmpty() == false){
//				log.info("Yes");
//				return true;
//			}
//		}
//		
//		log.info("No");
//		Execution.setAsExecutedToday();
//		return false;		
//	}
	
	public List<Execution> getTestData() {
		List<Execution> testClasses = new ArrayList<Execution>();

		testClasses.add(new Execution());
		testClasses.add(new Execution());
		testClasses.add(new Execution());

		return testClasses;
	}
}
