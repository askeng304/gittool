package kumar.git;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table(name="stdtab")
public class Student {
	@Id
	@Column(name="sid")
	private int stdId;
	@Column(name="sname")
	private String stdName;
	@ManyToMany
	@JoinTable(name="stdscrtab",joinColumns=@JoinColumn(name="sidFk"),inverseJoinColumns=@JoinColumn(name="cidFk"))
	private Set<Course> cobs=new HashSet<>();
	public Student() {
		super();
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Set<Course> getCobs() {
		return cobs;
	}
	public void setCobs(Set<Course> cobs) {
		this.cobs = cobs;
	}
	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", cobs=" + cobs + "]";
	}
	
}
