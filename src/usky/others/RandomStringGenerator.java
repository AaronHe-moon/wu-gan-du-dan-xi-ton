/*
 * RandomStringGenerator.java
 *
 * Created on 2007��7��27��, ����2:47
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
 *����:RandomStringGenerator
 *˵��:��������������ָ�����ȵĴ�д��ĸ���ַ���
 */
public class RandomStringGenerator {
    
    /**
     * Creates a new instance of RandomStringGenerator
     */
    public RandomStringGenerator() {
    }
    /**
     *����:generateRandomString
     *����:int length   --�ַ����ĳ���
     *˵��:�÷���ʵ�������ɳ�Ϊlength��Сд��ĸ���ַ���.���lengthС�ڵ���0,,�����ؿ��ַ���
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
