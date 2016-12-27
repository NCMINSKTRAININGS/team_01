package by.nc.teamone.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="claim_status")
public class ClaimStatus  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @Column(name="claim_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

	@Column(name = "claim_status_en")
	private String claimStatusEn;
	
	@Column(name = "claim_status_ru")
	private String claimStatusRu;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClaimStatusEn() {
		return claimStatusEn;
	}

	public void setClaimStatusEn(String claimStatusEn) {
		this.claimStatusEn = claimStatusEn;
	}

	public String getClaimStatusRu() {
		return claimStatusRu;
	}

	public void setClaimStatusRu(String claimStatusRu) {
		this.claimStatusRu = claimStatusRu;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((claimStatusEn == null) ? 0 : claimStatusEn.hashCode());
		result = prime * result + ((claimStatusRu == null) ? 0 : claimStatusRu.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClaimStatus other = (ClaimStatus) obj;
		if (claimStatusEn == null) {
			if (other.claimStatusEn != null)
				return false;
		} else if (!claimStatusEn.equals(other.claimStatusEn))
			return false;
		if (claimStatusRu == null) {
			if (other.claimStatusRu != null)
				return false;
		} else if (!claimStatusRu.equals(other.claimStatusRu))
			return false;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ClaimStatus [id=" + id + 
				", claimStatusEn=" + claimStatusEn + 
				", claimStatusRu=" + claimStatusRu + "]";
	}
}
