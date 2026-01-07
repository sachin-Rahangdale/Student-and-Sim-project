package com.example.demo;

import com.example.demo.beans.Sim;
import com.example.demo.Model.Student;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
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


	}

}
