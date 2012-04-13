/*
 * DBOP.java
 *
 * Created on 2007年10月10日, 下午4:14
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

/**
 *
 * @author Administrator
 */
public class DBOP {
    
    /** Creates a new instance of DBOP */
    public DBOP() {
    }
    
    private Object entity;
    private String opType;
    
    public static final String DELETE="Delete";
    public static final String UPDATE="Update";
    public static final String INSERT="Insert";

    public Object getEntity() {
        return entity;
    }

    public void setEntity(Object entity) {
        this.entity = entity;
    }

    public String getOpType() {
        return opType;
    }

    public void setOpType(String opType) {
        this.opType = opType;
    }
}
