package DependencyInjectionWithSetterInjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ClassPathXmlApplicationContext context= 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CricketCoach coach =context.getBean("myCricketCoach",CricketCoach.class);
		
		System.out.println(coach.getDailyActivity());
		
		System.out.println(coach.getDailyFortune());
		
	
		
		context.close();
	}

}
