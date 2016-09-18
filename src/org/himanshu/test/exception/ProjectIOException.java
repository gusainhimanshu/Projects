/**
 * 
 */
package org.himanshu.test.exception;

/**
 * Signals that an IO exception of some sort has happened in the project.This
 * class is the general class of exceptions produced by failed or interrupted
 * I/O operations.
 * 
 * @author Himanshu Gusain
 *
 */
public class ProjectIOException extends ProjectException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2294019267249839522L;

	/**
	 * Constructs an {@code ProjectIOException} with {@code null} as its error
	 * detail message.
	 */
	public ProjectIOException() {
		super();
	}

	/**
	 * Constructs an {@code ProjectIOException} with the specified detail
	 * message.
	 *
	 * @param message
	 *            The detail message (which is saved for later retrieval by the
	 *            {@link #getMessage()} method)
	 */
	public ProjectIOException(String message) {
		super(message);
	}

	/**
	 * Constructs an {@code ProjectIOException} with the specified detail
	 * message and cause.
	 *
	 * <p>
	 * Note that the detail message associated with {@code cause} is <i>not</i>
	 * automatically incorporated into this exception's detail message.
	 *
	 * @param message
	 *            The detail message (which is saved for later retrieval by the
	 *            {@link #getMessage()} method)
	 *
	 * @param cause
	 *            The cause (which is saved for later retrieval by the
	 *            {@link #getCause()} method). (A null value is permitted, and
	 *            indicates that the cause is nonexistent or unknown.)
	 */
	public ProjectIOException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs an {@code ProjectIOException} with the specified cause and a
	 * detail message of {@code (cause==null ? null : cause.toString())} (which
	 * typically contains the class and detail message of {@code cause}). This
	 * constructor is useful for IO exceptions that are little more than
	 * wrappers for other throwables.
	 *
	 * @param cause
	 *            The cause (which is saved for later retrieval by the
	 *            {@link #getCause()} method). (A null value is permitted, and
	 *            indicates that the cause is nonexistent or unknown.)
	 */
	public ProjectIOException(Throwable cause) {
		super(cause);
	}
}
