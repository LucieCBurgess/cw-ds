/**
 * Implementation of interface ReturnObject
 * @author Lburge01 BBK-PiJ-2015-75 (Lucie Burgess)
 * ReturnObjectImpl: This class must have two constructors, each of them with only one parameter.
 */

public class ReturnObjectImpl implements ReturnObject {

	private Object myObject;
 	private ErrorMessage myError;
 	private boolean whetherThereIsAnError;
 	
 	/**
 	* Constructs a ReturnObject wrapping the object 
 	* The constructor used for successful operations must receive an Object
 	* In the case of successful operations, hasError() returns false, therefore boolean whetherThereIsAnError is false
 	* @param myObject 
 	*/
 	public ReturnObjectImpl (Object myObject) {
		this.myObject = myObject;
		this.myError = ErrorMessage.NO_ERROR;
		whetherThereIsAnError = false;
	}
	
 	/**
 	* Constructs a ReturnObject consisting of an error message
 	* the constructor used for failed operations must receive an ErrorMessage as its only parameter
 	* In the case of failed operations, hasError() returns true, therefore boolean whetherThereIsAnError is true
 	* @param myError
 	*/
 	
	public ReturnObjectImpl (ErrorMessage myError) {
		this.myError = myError;
		whetherThereIsAnError = true;
 	}
	
	/**
	 * Returns whether there has been an error
	 * @return whether there has been an error
	 * Returns false if there is no error
	 * Returns true if there IS an error
	 * If hasError() is called on a null object, hasError() return true because this should correspond to error EMPTY_STRUCTURE
	 */
	@Override
	public boolean hasError() {
		if (myObject == null) {
			return true;
		} else {
		return whetherThereIsAnError;
		}
	}

	/**
	 * Returns the error message. 
	 * This method must return NO_ERROR if and only if {@hasError} returns false.
	 * @return the error message
	 */
	@Override
	public ErrorMessage getError() {
		if (whetherThereIsAnError == false) {
			return myError = ErrorMessage.NO_ERROR;
		} else if (myObject == null) {
			return myError = ErrorMessage.EMPTY_STRUCTURE;
		} else {
			return myError;
		}	
	}

	/**
	 * Returns the object wrapped in this ReturnObject, i.e. the
	 * result of the operation if it was successful, or null if
	 * there has been an error.
	 * 
	 * Note that the output of this method must be null if {@see
	 * hasError} returns true, but the opposite is not true: if
	 * {@see hasError} returns false, this method may or may not
	 * return null.
	 * 
	 * @return the return value from the method or null if there has been an error
	 */
	@Override
	public Object getReturnValue() {
		return myObject;
	}

}


 
 	