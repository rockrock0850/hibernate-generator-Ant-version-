package model;
// Generated May 10, 2017 12:40:59 AM by Hibernate Tools 4.0.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * HrmMemberId generated by hbm2java
 */
@Embeddable
public class HrmMemberId  implements java.io.Serializable {


     private String empno;
     private String deptcode;

    public HrmMemberId() {
    }

    public HrmMemberId(String empno, String deptcode) {
       this.empno = empno;
       this.deptcode = deptcode;
    }
   


    @Column(name="EMPNO", nullable=false, length=10)
    public String getEmpno() {
        return this.empno;
    }
    
    public void setEmpno(String empno) {
        this.empno = empno;
    }


    @Column(name="DEPTCODE", nullable=false, length=40)
    public String getDeptcode() {
        return this.deptcode;
    }
    
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof HrmMemberId) ) return false;
		 HrmMemberId castOther = ( HrmMemberId ) other; 
         
		 return ( (this.getEmpno()==castOther.getEmpno()) || ( this.getEmpno()!=null && castOther.getEmpno()!=null && this.getEmpno().equals(castOther.getEmpno()) ) )
 && ( (this.getDeptcode()==castOther.getDeptcode()) || ( this.getDeptcode()!=null && castOther.getDeptcode()!=null && this.getDeptcode().equals(castOther.getDeptcode()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getEmpno() == null ? 0 : this.getEmpno().hashCode() );
         result = 37 * result + ( getDeptcode() == null ? 0 : this.getDeptcode().hashCode() );
         return result;
   }   


}


