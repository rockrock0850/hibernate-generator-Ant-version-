package model;
// Generated May 10, 2017 12:40:59 AM by Hibernate Tools 4.0.0


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * HrmDept generated by hbm2java
 */
@Entity
@Table(name="HRM_DEPT"
    ,schema="OSP"
)
public class HrmDept  implements java.io.Serializable {


     private String deptcode;
     private String deptengname;
     private String deptchiname;
     private String parent;
     private String empno;
     private String deptlevel;
     private String deptlevelname;
     private String head;
     private String deputyhead;
     private Date createDate;
     private String createUser;

    public HrmDept() {
    }

	
    public HrmDept(String deptcode, Date createDate) {
        this.deptcode = deptcode;
        this.createDate = createDate;
    }
    public HrmDept(String deptcode, String deptengname, String deptchiname, String parent, String empno, String deptlevel, String deptlevelname, String head, String deputyhead, Date createDate, String createUser) {
       this.deptcode = deptcode;
       this.deptengname = deptengname;
       this.deptchiname = deptchiname;
       this.parent = parent;
       this.empno = empno;
       this.deptlevel = deptlevel;
       this.deptlevelname = deptlevelname;
       this.head = head;
       this.deputyhead = deputyhead;
       this.createDate = createDate;
       this.createUser = createUser;
    }
   
     @Id 

    
    @Column(name="DEPTCODE", unique=true, nullable=false, length=40)
    public String getDeptcode() {
        return this.deptcode;
    }
    
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }

    
    @Column(name="DEPTENGNAME", length=150)
    public String getDeptengname() {
        return this.deptengname;
    }
    
    public void setDeptengname(String deptengname) {
        this.deptengname = deptengname;
    }

    
    @Column(name="DEPTCHINAME", length=150)
    public String getDeptchiname() {
        return this.deptchiname;
    }
    
    public void setDeptchiname(String deptchiname) {
        this.deptchiname = deptchiname;
    }

    
    @Column(name="PARENT", length=40)
    public String getParent() {
        return this.parent;
    }
    
    public void setParent(String parent) {
        this.parent = parent;
    }

    
    @Column(name="EMPNO", length=20)
    public String getEmpno() {
        return this.empno;
    }
    
    public void setEmpno(String empno) {
        this.empno = empno;
    }

    
    @Column(name="DEPTLEVEL", length=20)
    public String getDeptlevel() {
        return this.deptlevel;
    }
    
    public void setDeptlevel(String deptlevel) {
        this.deptlevel = deptlevel;
    }

    
    @Column(name="DEPTLEVELNAME", length=50)
    public String getDeptlevelname() {
        return this.deptlevelname;
    }
    
    public void setDeptlevelname(String deptlevelname) {
        this.deptlevelname = deptlevelname;
    }

    
    @Column(name="HEAD", length=20)
    public String getHead() {
        return this.head;
    }
    
    public void setHead(String head) {
        this.head = head;
    }

    
    @Column(name="DEPUTYHEAD", length=20)
    public String getDeputyhead() {
        return this.deputyhead;
    }
    
    public void setDeputyhead(String deputyhead) {
        this.deputyhead = deputyhead;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="CREATE_DATE", nullable=false, length=7)
    public Date getCreateDate() {
        return this.createDate;
    }
    
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    
    @Column(name="CREATE_USER", length=12)
    public String getCreateUser() {
        return this.createUser;
    }
    
    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }




}


