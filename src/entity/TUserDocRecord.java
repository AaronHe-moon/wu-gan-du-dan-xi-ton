package entity;

import java.util.Date;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * TUserDocRecord generated by MyEclipse Persistence Tools
 */

public class TUserDocRecord implements java.io.Serializable {

	// Fields

	private Integer id;
	private String acountName;
	private String action;
	private Date actionDate;
	private Integer docRecordId;
	private String memo;

	// Constructors

	/** default constructor */
	public TUserDocRecord() {
	}

	/** minimal constructor */
	public TUserDocRecord(String acountName, String action, Date actionDate,
			Integer docRecordId) {
		this.acountName = acountName;
		this.action = action;
		this.actionDate = actionDate;
		this.docRecordId = docRecordId;
	}

	/** full constructor */
	public TUserDocRecord(String acountName, String action, Date actionDate,
			Integer docRecordId, String memo) {
		this.acountName = acountName;
		this.action = action;
		this.actionDate = actionDate;
		this.docRecordId = docRecordId;
		this.memo = memo;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAcountName() {
		return this.acountName;
	}

	public void setAcountName(String acountName) {
		this.acountName = acountName;
	}

	public String getAction() {
		return this.action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Date getActionDate() {
		return this.actionDate;
	}

	public void setActionDate(Date actionDate) {
		this.actionDate = actionDate;
	}

	public Integer getDocRecordId() {
		return this.docRecordId;
	}

	public void setDocRecordId(Integer docRecordId) {
		this.docRecordId = docRecordId;
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
        public static void main(String[] args){
        try {
            TUserDocRecord tudr=new TUserDocRecord();
            tudr.setAcountName("usky");
            tudr.setAction("AAA");
            tudr.setActionDate(new Date());
            tudr.setDocRecordId(new Integer(1));
            Session session=HibernateSessionFactory.getSession();
            Transaction tx=session.beginTransaction();
            session.save(tudr);
            tx.commit();
            session.close();
        } catch (HibernateException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
            
        }
}