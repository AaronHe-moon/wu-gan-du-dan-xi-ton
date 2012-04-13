/*
 * AngleTransformer.java
 *
 * Created on 2007年7月28日, 上午9:01
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package usky.others;

/**
 *
 * @author Administrator
 */
public class AngleTransformer {
    
    /**
     * Creates a new instance of AngleTransformer
     */
    public AngleTransformer() {
    }
    
    public static double toArcDegree(double Angle){
        return (Angle / 180)*Math.PI;
    }
    
    public static double toAngle(double delta){
        return 180 * delta /Math.PI;
    }
    
}
