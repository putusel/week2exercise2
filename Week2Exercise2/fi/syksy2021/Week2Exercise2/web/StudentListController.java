package fi.syksy2021.Week2Exercise2.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fi.syksy2021.Week2Exercise2.domain.Student;

@Controller
public class StudentListController {
	
			
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String showStudents(Model model) {
		
			
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student("John Smith"));
		students.add(new Student("Anna Jackson"));
		students.add(new Student("Mary Scott"));
		
		model.addAttribute("Students", students);
		return "studentlist";
	
	}

}
