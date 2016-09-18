/**
 * 
 */
package org.himanshu.test.exception;

/**
 * @author Himanshu Gusain
 *
 */
public class ProjectDataInvalidException extends ProjectIOException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6311051889728026631L;

	/**
	 * Constructs {@code ProjectDataInvalidException} with {@code 
	 * <code>null</code>} as its error detail message
	 */
	public ProjectDataInvalidException() {
		super();
	}

	/**
	 * Constructs a {@code ProjectDataInvalidException} with the specified
	 * detail message
	 * 
	 * @param message
	 *            The detail message (which is saved for later retrieval by the
	 *            {@link #getMessage()} method)
	 */
	public ProjectDataInvalidException(String message) {
		super(message);
	}

	/**
	 * Constructs an {@code ProjectDataInvalidException} with the specified detail message and
	 * cause.
	 * <p>
	 * Note that the detail message associated with {@code cause} is <i>not</i>
	 * automatically incorporated into this exception's detail message.
	 * 
	 * @param message
	 *            The detail message (which is saved for later retrieval by the
	 *            {@link #getMessage()} method)
	 * @param cause
	 *            The detail message (which is saved for later retrieval by the
	 *            {@link #getMessage()} method)s
	 */
	public ProjectDataInvalidException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructs an {@code ProjectDataInvalidException} with the specified cause and a
     * detail message of {@code (cause==null ? null : cause.toString())}
     * (which typically contains the class and detail message of {@code cause}).
     * This constructor is useful for IO exceptions that are little more
     * than wrappers for other throwables.
     *
     * @param cause
     *        The cause (which is saved for later retrieval by the
     *        {@link #getCause()} method).  (A null value is permitted,
     *        and indicates that the cause is nonexistent or unknown.)
	 * @param cause
	 */
	public ProjectDataInvalidException(Throwable cause) {
		super(cause);
	}
}
