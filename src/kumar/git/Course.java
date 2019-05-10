package kumar.git;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="crtab")
public class Course {
	@Id
	@Column(name="cid")
	private int crsId;
	@Column(name="code")
	private String crsCode;
	@Column(name="cost")
	private double crsCost;
	public Course() {
		super();
	}
	public int getCrsId() {
		return crsId;
	}
	public void setCrsId(int crsId) {
		this.crsId = crsId;
	}
	public String getCrsCode() {
		return crsCode;
	}
	public void setCrsCode(String crsCode) {
		this.crsCode = crsCode;
	}
	public double getCrsCost() {
		return crsCost;
	}
	public void setCrsCost(double crsCost) {
		this.crsCost = crsCost;
	}
	@Override
	public String toString() {
		return "Course [crsId=" + crsId + ", crsCode=" + crsCode + ", crsCost=" + crsCost + "]";
	}
	
}
