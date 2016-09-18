/**
 * 
 */
package org.himanshu.test.exception;

/**
 * @author Himanshu Gusain
 *
 */
public class ProjectFileNotFoundException extends ProjectIOException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4890154184074767922L;

	/**
	 * Constructs a {@code ProjectFileNotFoundException} with {@code null} as
	 * its default message
	 */
	public ProjectFileNotFoundException() {

	}

	/**
	 * Constructs a {@code ProjectFileNotFoundException} with the
     * specified detail message. The string <code>message</code> can be
     * retrieved later by the
     * <code>{@link java.lang.Throwable#getMessage}</code>
     * method of class <code>java.lang.Throwable</code>.
     *
     * @param   message   the detail message.
	 */
	public ProjectFileNotFoundException(String message) {
		super(message);
	}

	/**
	 * Constructs a <code>FileNotFoundException</code> with a detail message
     * consisting of the given pathname string followed by the given reason
     * string.  If the <code>cause</code> argument is <code>null</code> then
     * it will be omitted.  This private constructor is invoked only by native
     * I/O methods.
     * 
	 * @param message
	 * @param cause
	 */
	private ProjectFileNotFoundException(String path, Throwable cause) {
		super(path + ((cause == null)
                ? ""
                : " (" + cause + ")"));

	}

	/**
	 * 
	 * @param cause
	 */
	public ProjectFileNotFoundException(Throwable cause) {
		super(cause);
	}
}
