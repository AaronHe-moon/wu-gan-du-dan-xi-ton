/*
 * RandomStringGenerator.java
 *
 * Created on 2007年7月27日, 下午2:47
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
 *类名:RandomStringGenerator
 *说明:该类是用来生成指定长度的大写字母的字符串
 */
public class RandomStringGenerator {
    
    /**
     * Creates a new instance of RandomStringGenerator
     */
    public RandomStringGenerator() {
    }
    /**
     *名称:generateRandomString
     *参数:int length   --字符串的长度
     *说明:该方法实际上生成长为length的小写字母的字符串.如果length小于等于0,,将返回空字符串
     */
    public static final String generateRandomString(int length){
        if(length<=0) return "";
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            char c=(char)(Math.random()*26+65);
            sb.append(c);      
        }        
        return sb.toString();        
    }
    
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            System.out.println(RandomStringGenerator.generateRandomString(64));
        }
//        System.out.println(ab);
    }
    
}
