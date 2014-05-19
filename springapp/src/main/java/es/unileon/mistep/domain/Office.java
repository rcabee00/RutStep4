package es.unileon.mistep.domain;

import java.io.Serializable;

/**
 * Class representing a office
 * 
 * @author rut
 * 
 */

public class Office implements Serializable {

	private static final long serialVersionUID = 1L;
	/**
	 * The description of the office
	 */
	private String description;
	/**
	 * The costs of the local of the office
	 */
	private double localCost;
	/**
	 * The costs of the light, water and gas of the office
	 */
	private double utilitiesCost;
	/**
	 * The expenses in the salaries of the employees
	 */
	private double employeeCost;
	

	/**
	 * Returns the total expenses
	 * @return total expenses
	 */
	public double getTotalExpenses() {
		double total = this.localCost + this.utilitiesCost + this.employeeCost;
		total = round(total, 4);
		return total;
	}
	/**
	 * Sets the local costs
	 * 
	 * @param localCost
	 *            the amount to set
	 */
	public void setLocalCost(double localCost) {
		this.localCost = localCost;
	}

	/**
	 * Returns the local cost
	 * 
	 * @return the local cost
	 */
	public double getLocalCost() {
		return localCost;
	}

	/**
	 * Sets the utilities cost
	 * 
	 * @param utilitiesCost
	 *            the amount to set
	 */
	public void setUtilitiesCost(double utilitiesCost) {
		this.utilitiesCost = utilitiesCost;
	}

	/**
	 * Returns the utilities cost
	 * 
	 * @return the utilities cost
	 */
	public double getUtilitiesCost() {
		return utilitiesCost;
	}

	/**
	 * Sets the cost of employees
	 * 
	 * @param employeeCost
	 *            the amount to set
	 */
	public void setEmployeeCost(double employeeCost) {
		this.employeeCost = round(employeeCost,4);
	}

	/**
	 * Returns the employee cost
	 * 
	 * @return the employee cost
	 */
	public double getEmployeeCost() {
		return employeeCost;
	}

	/**
	 * Returns the description
	 * 
	 * @return description of the office
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Sets the description
	 * 
	 * @param description
	 *            the description to be set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Rounds a number to any decimals
	 * 
	 * @param number
	 *            the number to be rounded
	 * @param decimals
	 *            the number of decimal digits we want to round
	 * @return the rounded number
	 */
	public double round(double number, int decimals) {
		return Math.round(number * Math.pow(10, decimals))
				/ Math.pow(10, decimals);
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Office: " + description + ";");
		buffer.append("Local cost: " + localCost);
		buffer.append("Utilities cost: " + utilitiesCost);
		buffer.append("Employee cost: " + employeeCost);		
		return buffer.toString();
	}

}
