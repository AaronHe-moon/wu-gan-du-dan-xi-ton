/*
 * StringValidator.java
 *
 * Created on 2007年8月2日, 下午4:58
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package usky.others;

/**
 *
 * @author Administrator
 */
/**
 *class name:StringValidator
 *description:this class is used to validate the string so that a string is conformed to
 *what you want
 */
public class StringValidator {
    
    /** Creates a new instance of StringValidator */
    public StringValidator() {
    }
    
    private char[] invalidChars;

    public char[] getInvalidChars() {
        return invalidChars;
    }

    public void setInvalidChars(char[] invalidChars) {
        this.invalidChars = invalidChars;
    }
    
    /**
     *method:isValid
     *parameter:String s         --the string to be validated
     *description:this method is used to check whether the intended string has the invalid
     *char set.if this string contains the invalid chars,then this string is not valid and return false
     */
    public static boolean isValid(String s){
        
        
        return true;
    }
    
}
