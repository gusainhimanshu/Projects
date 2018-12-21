package org.himanshu.test.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.himanshu.test.model.Person;

public class MainClass {

	public static void main(String[] args) {
		List<Person> personList=intialize();
		System.out.println(personList);
		DuplicateRemoveService duplicateRemoveService = new DuplicateRemoveService();
		duplicateRemoveService.removeDuplicates(personList);

	}

	private static List<Person> intialize() {
		List<Person> personList = new ArrayList<>();
		Person person = new Person();
		Date date = java.sql.Date.valueOf("2017-12-31");
		person.setDate(date);
		person.setName("Himanshu");
		
		Person person1 = new Person();
		date = java.sql.Date.valueOf("2017-12-31");
		person1.setDate(date);
		person1.setName("Him");
		
		Person person2 = new Person();
		date = java.sql.Date.valueOf("2017-12-25");
		person2.setDate(date);
		person2.setName("Gusain");
		
		Person person3 = new Person();
		date = java.sql.Date.valueOf("2018-01-01");
		person3.setDate(date);
		person3.setName("Gus");
		
		personList.add(person);
		personList.add(person1);
		personList.add(person3);
		personList.add(person2);
		return personList;
	}

}
