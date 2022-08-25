package sdbms;

import java.util.Comparator;
public class SortStudentByMarks implements Comparator<Student>{
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.getMarks().compareTo(o2.getMarks());
	}

}

