package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user14")
public class MyUser {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name,pass;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public MyUser(int id, String name, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}
	public MyUser( String name, String pass) {
		super();
		
		this.name = name;
		this.pass = pass;
	}
	
	public MyUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", name=" + name + ", pass=" + pass + "]";
	}
	
	

}
