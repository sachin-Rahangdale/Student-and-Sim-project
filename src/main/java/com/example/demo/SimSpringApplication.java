package com.example.demo;

import com.example.demo.Config.AnnotationConfig;
import com.example.demo.Config.appConfig;
import com.example.demo.Model.Car;
import com.example.demo.beans.Engine;
import com.example.demo.beans.Sim;
import com.example.demo.Model.Student;
import com.example.demo.beans.Starter;
import com.example.demo.beans.Truck;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SimSpringApplication {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Sim jio = context.getBean("jio",Sim.class);
		jio.calling();

		Sim airtel = context.getBean("Airtel",Sim.class);
		airtel.calling();

		Student u = new Student("Sachin","gondia");
		u.setSim(jio);
		System.out.println(u);

		ApplicationContext a = new AnnotationConfigApplicationContext(appConfig.class);
		Student user1 = a.getBean(Student.class);
		user1.setSim(jio);
		System.out.println(user1.toString());
//-----------------------------------------------------------------------------------------------------
//		Engine eg = context.getBean("Kirloskar", Engine.class);
//		Car car1 = a.getBean(Car.class);
//		car1.setEngine(eg);
//		System.out.println(car1.toString());
//---------------------------------------------------------------------------------------------------


		ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AnnotationConfig.class);
		Truck truck = ctx1.getBean(Truck.class);
		truck.truckStart();

//		Starter starter = ctx1.getBean(Starter.class);
//		starter.startMotor();



	}

}
