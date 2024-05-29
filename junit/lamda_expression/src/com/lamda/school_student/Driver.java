package com.lamda.school_student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {
	public static void main(String[] args) {

		List<Student> students = new ArrayList<Student>();

		School school1 = new School(101, "Basava", Arrays.asList(new Student(1, "sandeep", 4567),
				new Student(3, "anil", 3457), new Student(2, "raju", 8887), new Student(7, "boju", 9987)));
		School school2 = new School(102, "gurment", Arrays.asList(new Student(3, "deepa", 9567),
				new Student(2, "pooja", 2567), new Student(1, "meenu", 9567)));

		List<School> schools = new ArrayList<School>();
		schools.add(school2);
		schools.add(school1);

		// finding school
		List<School> scl = schools.stream().filter(sc -> sc.getName() == "Basava").map(s -> s)
				.collect(Collectors.toList());
		System.out.println(scl);

		System.out.println("-------------------");
		// max students school
		School maxStudent = schools.stream().max((s1, s2) -> s1.getStudents().size() - s2.getStudents().size()).get();
		System.out.println(maxStudent);

		System.out.println("-------------------");
		// min students school
		School minStudent = schools.stream().min((s1, s2) -> s1.getStudents().size() - s2.getStudents().size()).get();
		System.out.println(minStudent);

		System.out.println("-------------------");
		List<Student> student = school1.getStudents().stream().filter(stu -> stu.getName() == "sandeep").map(st -> st)
				.collect(Collectors.toList());
		System.out.println(student);
		
		System.out.println("-------------------");
		List<Student> student2 = school1.getStudents().stream().filter(stu -> stu.getId() == 1).map(st -> st)
				.collect(Collectors.toList());
		System.out.println(student2);
		
		System.out.println("-------------------");
		List<Student> studentphone = school1.getStudents().stream().filter(stu -> stu.getPhone() == 9987).map(st -> st)
				.collect(Collectors.toList());
		System.out.println(studentphone);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// school.setStudents(students);
//
//		Collections.sort(students, (s1, s2) -> s1.getId() - s2.getId());
//		
//		List<School> schools=new ArrayList<School>();
//		schools.add(school);
//		
//		Set<School> sets=new HashSet<School>(schools);
//		Set<Student> set=new HashSet<Student>(students);

//		System.out.println(sets);
	}
}
