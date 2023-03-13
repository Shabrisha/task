package com.ty;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentDetails {
@Id
private int id;
private String studentname;
private String teachername;
private double fees;
private double balancefees;
private String dateofjoin;
public String getDateofjoin() {
return dateofjoin;
}
public void setDateofjoin(String dateofjoin) {
this.dateofjoin = dateofjoin;
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getStudentname() {
return studentname;
}
public void setStudentname(String studentname) {
this.studentname = studentname;
}
public String getTeachername() {
return teachername;
}
public void setTeachername(String teachername) {
this.teachername = teachername;
}
public double getFees() {
return fees;
}
public void setFees(double fees) {
this.fees = fees;
}
public double getBalancefees() {
return balancefees;
}
public void setBalancefees(double balancefees) {
this.balancefees = balancefees;
}

public void payFees(double amount)
{
if(balancefees!=0&&amount<balancefees)
{
balancefees=balancefees-amount;
}

}



}