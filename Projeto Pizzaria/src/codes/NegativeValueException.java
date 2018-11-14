
package codes;

public class NegativeValueException extends Exception  {
    private static final long serialVersionUID = 1149241039409861914L;
    public  NegativeValueException(String msg){
    	super(msg);
    }
    public  NegativeValueException(String msg, Throwable cause){
        super(msg,cause);
    }
}
