/**
 * 
 */
package org.himanshu.test.project;

/**
 * @author Himanshu Gusain
 *
 */
public class Project {

	private String projectName;
	private Integer projectDuration;
	private Integer numberOfMembers;

	/**
	 * Constructs a new {@code Project}
	 * 
	 * @param projectName
	 *            Name of the project
	 * @param projectDuration
	 *            Timelimit of the project
	 * @param numberOfMembers
	 *            Number of members involved in project
	 */
	public Project(String projectName, Integer projectDuration, Integer numberOfMemebers) {
		super();
		this.projectName = projectName;
		this.projectDuration = projectDuration;
		this.numberOfMembers = numberOfMemebers;
	}

	public Project() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName
	 *            the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the projectDuration
	 */
	public Integer getProjectDuration() {
		return projectDuration;
	}

	/**
	 * @param projectDuration
	 *            the projectDuration to set
	 */
	public void setProjectDuration(Integer projectDuration) {
		this.projectDuration = projectDuration;
	}

	/**
	 * @return the numberOfMembers
	 */
	public Integer getNumberOfMemebers() {
		return numberOfMembers;
	}

	/**
	 * @param numberOfMembers
	 *            the numberOfMembers to set
	 */
	public void setNumberOfMemebers(Integer numberOfMembers) {
		this.numberOfMembers = numberOfMembers;
	}

}
