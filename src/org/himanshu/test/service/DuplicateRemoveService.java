package org.himanshu.test.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.himanshu.test.model.Person;

public class DuplicateRemoveService {
	
	public void removeDuplicates(List<Person> personList) {
		Set<Person> personSet= new TreeSet<>(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				if(o1.getDate().equals(o2.getDate())) {
					return 0;
				}
				return 1;
			}
		});
		
		personSet.addAll(personList);
		final ArrayList newList = new ArrayList(personSet);

	    /** Printing original list **/
		System.out.println(newList);
	}
}
