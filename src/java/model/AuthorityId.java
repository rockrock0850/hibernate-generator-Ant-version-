package model;
// Generated Jan 23, 2017 3:49:03 PM by Hibernate Tools 4.0.0


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AuthorityId generated by hbm2java
 */
@Embeddable
public class AuthorityId  implements java.io.Serializable {


     private String roleId;
     private String catalogId;

    public AuthorityId() {
    }

    public AuthorityId(String roleId, String catalogId) {
       this.roleId = roleId;
       this.catalogId = catalogId;
    }
   


    @Column(name="ROLE_ID", nullable=false, length=20)
    public String getRoleId() {
        return this.roleId;
    }
    
    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }


    @Column(name="CATALOG_ID", nullable=false, length=30)
    public String getCatalogId() {
        return this.catalogId;
    }
    
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AuthorityId) ) return false;
		 AuthorityId castOther = ( AuthorityId ) other; 
         
		 return ( (this.getRoleId()==castOther.getRoleId()) || ( this.getRoleId()!=null && castOther.getRoleId()!=null && this.getRoleId().equals(castOther.getRoleId()) ) )
 && ( (this.getCatalogId()==castOther.getCatalogId()) || ( this.getCatalogId()!=null && castOther.getCatalogId()!=null && this.getCatalogId().equals(castOther.getCatalogId()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getRoleId() == null ? 0 : this.getRoleId().hashCode() );
         result = 37 * result + ( getCatalogId() == null ? 0 : this.getCatalogId().hashCode() );
         return result;
   }   


}


