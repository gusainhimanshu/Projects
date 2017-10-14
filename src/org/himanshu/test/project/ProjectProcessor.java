/**
 * 
 */
package org.himanshu.test.project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.himanshu.test.exception.ProjectDataInvalidException;
import org.himanshu.test.exception.ProjectFileNotFoundException;
import org.himanshu.test.exception.ProjectIOException;

/**
 * This class will process the project and tell information about the project
 * 
 * @author Himanshu Gusain
 *
 */
public class ProjectProcessor {

	/**
	 * This method will print the project information. Will throw exception in
	 * case any information is not available
	 * 
	 * @param project
	 *            project object contains the information about the project
	 * @throws ProjectIOException
	 *             will throw {@link ProjectIOException} in case any invalid
	 *             data is available
	 */
	public void processor(Project project) throws ProjectIOException {
		if (project != null) {
			if (project.getProjectName() != null) {
				System.out.println("Project name is : " + project.getProjectName());
			} else {
				throw new ProjectDataInvalidException();
			}
			if (project.getProjectDuration() != null) {
				System.out.println("Duration of project is : " + project.getProjectDuration() + " months");
			} else {
				throw new ProjectDataInvalidException();
			}
			if (project.getNumberOfMemebers() != null) {
				System.out.println("number of members involved in project are : " + project.getNumberOfMemebers());
			} else {
				throw new ProjectDataInvalidException();
			}
		}
	}

	/**
	 * This method will write the project information into a file and throw an
	 * exception if file doesn't exist or there is a problem while writing to
	 * file
	 * 
	 * @param project
	 *            project object contains the information about the project
	 * @throws ProjectIOException
	 *             throws {@link ProjectIOException} in case any IO operation
	 *             fails
	 */
	public void writeProjectInfoFile(Project project) throws ProjectIOException {
		File filename = new File("E:\\Input Files\\Input.txt");

		if (!filename.exists()) {
			throw new ProjectFileNotFoundException("File not found ");
		}
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
			writer.write(project.getProjectName());
			writer.write(" | " + project.getNumberOfMemebers().toString());
			writer.write(" | " + project.getProjectDuration().toString());
		} catch (IOException e) {
			throw new ProjectIOException("Could not write into file", e);
		}
	}
}
