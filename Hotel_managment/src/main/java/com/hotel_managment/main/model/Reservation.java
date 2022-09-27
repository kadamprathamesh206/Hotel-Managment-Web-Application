package com.hotel_managment.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Reservation {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
  private int id;
  private String firstName;
  private String middleName;
  private String lastName;
  private String aadhar;
  private String email;
  private String address;
  private String contactNo;
  private String checkIn_date;
  private String checkout_date;
  public Reservation(int id, String firstName, String middleName, String lastName, String aadhar, String email,
		String address, String contactNo, String checkIn_date, String checkout_date, String status, String roomtype,
		int bed, int room_no, String remark, long bill, int no_day) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.aadhar = aadhar;
	this.email = email;
	this.address = address;
	this.contactNo = contactNo;
	this.checkIn_date = checkIn_date;
	this.checkout_date = checkout_date;
	Status = status;
	this.roomtype = roomtype;
	this.bed = bed;
	this.room_no = room_no;
	this.remark = remark;
	this.bill = bill;
	this.no_day = no_day;
}
public String getCheckIn_date() {
	return checkIn_date;
}
public void setCheckIn_date(String checkIn_date) {
	this.checkIn_date = checkIn_date;
}
public String getCheckout_date() {
	return checkout_date;
}
public void setCheckout_date(String checkout_date) {
	this.checkout_date = checkout_date;
}
private String Status;
  private String roomtype;
  private int bed;
  private int room_no;
  private String remark;
  public Reservation(int id, String firstName, String middleName, String lastName, String aadhar, String email,
		String address, String contactNo, String date, String status, String roomtype, int bed, int room_no,
		String remark, long bill, int no_day) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.aadhar = aadhar;
	this.email = email;
	this.address = address;
	this.contactNo = contactNo;
	this.checkIn_date = date;
	Status = status;
	this.roomtype = roomtype;
	this.bed = bed;
	this.room_no = room_no;
	this.remark = remark;
	this.bill = bill;
	this.no_day = no_day;
}
public int getRoom_no() {
	return room_no;
}
public void setRoom_no(int room_no) {
	this.room_no = room_no;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public long getBill() {
	return bill;
}
public void setBill(long bill) {
	this.bill = bill;
}
private long bill;
  public String getRoomtype() {
	return roomtype;
}
public void setRoomtype(String roomtype) {
	this.roomtype = roomtype;
}
public int getBed() {
	return bed;
}
public void setBed(int bed) {
	this.bed = bed;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
private int no_day;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getMiddleName() {
	return middleName;
}
public void setMiddleName(String middleName) {
	this.middleName = middleName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getAadhar() {
	return aadhar;
}
public void setAadhar(String aadhar) {
	this.aadhar = aadhar;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public Reservation(int id, String firstName, String middleName, String lastName, String aadhar, String email,
		String address, String contactNo, String date, String status, int no_day) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.aadhar = aadhar;
	this.email = email;
	this.address = address;
	this.contactNo = contactNo;
	this.checkIn_date = date;
	Status = status;
	this.no_day = no_day;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContactNo() {
	return contactNo;
}
public void setContactNo(String contactNo) {
	this.contactNo = contactNo;
}
public String getDate() {
	return checkIn_date;
}
public void setDate(String date) {
	this.checkIn_date = date;
}
public int getNo_day() {
	return no_day;
}
public void setNo_day(int no_day) {
	this.no_day = no_day;
}
public Reservation(int id, String firstName, String middleName, String lastName, String aadhar, String email,
		String address, String contactNo, String date, int no_day) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.aadhar = aadhar;
	this.email = email;
	this.address = address;
	this.contactNo = contactNo;
	this.checkIn_date = date;
	this.no_day = no_day;
}
public Reservation() {
	super();
	// TODO Auto-generated constructor stub
}
public Reservation(int id, String firstName, String middleName, String lastName, String aadhar, String email,
		String address, String contactNo, String date, String status, String roomtype, int bed, int no_day) {
	super();
	this.id = id;
	this.firstName = firstName;
	this.middleName = middleName;
	this.lastName = lastName;
	this.aadhar = aadhar;
	this.email = email;
	this.address = address;
	this.contactNo = contactNo;
	this.checkIn_date = date;
	Status = status;
	this.roomtype = roomtype;
	this.bed = bed;
	this.no_day = no_day;
}
  
  
}
