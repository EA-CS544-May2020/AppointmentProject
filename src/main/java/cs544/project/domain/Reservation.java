package cs544.project.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Temporal(TemporalType.TIME)
	private Date time;
	
	private String location;
	
//	@ManyToOne
//	@JoinColumn(name = "userid")
//	private User booker;
	
	@ManyToOne
	@JoinColumn(name = "appointment_id")
	private Appointment appointment;

	public Reservation() {}
			
	public Reservation(Date date, Date time, String location) {
		super();
		this.date = date;
		this.time = time;
		this.location = location;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

//	public User getBooker() {
//		return booker;
//	}
//
//	public void setBooker(User booker) {
//		this.booker = booker;
//	}
	
}
