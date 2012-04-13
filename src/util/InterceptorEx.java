/*
 * InterceptorEx.java
 *
 * Created on 2007年10月22日, 下午8:31
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package util;

import org.hibernate.EmptyInterceptor;
import org.hibernate.Session;

/**
 *
 * @author Administrator
 */
public class InterceptorEx extends EmptyInterceptor {
    
    /** Creates a new instance of InterceptorEx */
    public InterceptorEx() {
    }
    
    private Session session;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }
    
    
}
