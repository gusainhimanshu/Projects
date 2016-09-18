package org.himanshu.test.project;

import org.himanshu.test.exception.ProjectException;
import org.himanshu.test.exception.ProjectIOException;

/**
 * This is the main class for the project using the custom Exception hierarchy
 * application
 * 
 * @author Himanshu Gusain
 * 
 */
public class ProjectMain {

	/**
	 * This is the main method
	 * 
	 * @param args
	 * @throws ProjectException
	 */
	public static void main(String[] args) throws ProjectException {

		Project project = new Project("", 2, 5);
		project.setProjectName("Test Project");
		ProjectProcessor projectProcessor = new ProjectProcessor();
		try {
			System.out.println("Project processing starts");
			projectProcessor.processor(project);
		} catch (ProjectIOException e) {
			throw new ProjectException();
		}
		System.out.println("Project processing ends");
		try {
		projectProcessor.writeProjectInfoFile (project);
		} catch(ProjectIOException e){
			throw new ProjectException("Project catches exception: " + e.getMessage(), e);
		}
	}

}
