package cs544.project.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer userid;
	private String firstName;
	private String lastName;
	private String email;
	private String gender;
	private String username;
	private String password;
	
	@ManyToMany
	@JoinTable(name = "User_Role", 
		joinColumns = {@JoinColumn(name = "userid")}, 
		inverseJoinColumns = {@JoinColumn(name = "roleid")} )
	private List<Role> roles = new ArrayList<Role>();
	
	@OneToMany
	@JoinColumn(name = "user_id")
	private List<Appointment> appointments = new ArrayList<Appointment>();
	
	@OneToMany
	@JoinColumn(name = "user_id")
	private List<Reservation> reservations = new ArrayList<Reservation>();
	
	public User() {}

	public User(String firstName, String lastName, String email, String gender, String username, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.username = username;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getUserid() {
		return userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	

	
}
