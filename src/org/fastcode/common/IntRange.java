/**
 * This class has been generated by Fast Code Eclipse Plugin
 * For more information please go to http://fast-code.sourceforge.net/
 * @author : KrishV
 * Created : 07/22/2014 09:09:59
 */

package org.fastcode.common;



public class IntRange {

	private int start;
	private int end;
	private int step;

	/**
	 *
	 * getter method for start
	 * @return
	 *
	 */
	public int getStart() {
		return this.start;
	}

	public IntRange(final int start, final int end, final int step) {
		super();
		this.start = start;
		this.end = end;
		this.step = step == 0 ? 1 : step;
	}

	/**
	 *
	 * setter method for start
	 * @param start
	 *
	 */
	public void setStart(final int start) {
		this.start = start;
	}

	/**
	 *
	 * getter method for end
	 * @return
	 *
	 */
	public int getEnd() {
		return this.end;
	}

	/**
	 *
	 * setter method for end
	 * @param end
	 *
	 */
	public void setEnd(final int end) {
		this.end = end;
	}

	/**
	 *
	 * getter method for step
	 * @return
	 *
	 */
	public int getStep() {
		return this.step;
	}

	/**
	 *
	 * setter method for step
	 * @param step
	 *
	 */
	public void setStep(final int step) {
		this.step = step;
	}
}
