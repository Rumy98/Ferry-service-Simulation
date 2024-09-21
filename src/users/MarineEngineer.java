/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

/**
 *
 * @author USER
 */
public class MarineEngineer extends User{
    private String gender;
    private int nidNo;
    private int phoneNo;
private int dateOfJoin;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getNidNo() {
        return nidNo;
    }

    public void setNidNo(int nidNo) {
        this.nidNo = nidNo;
    }

    public int getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(int phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getDateOfJoin() {
        return dateOfJoin;
    }

    public void setDateOfJoin(int dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

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

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public MarineEngineer(String gender, int nidNo, int phoneNo, int dateOfJoin) {
        this.gender = gender;
        this.nidNo = nidNo;
        this.phoneNo = phoneNo;
        this.dateOfJoin = dateOfJoin;
    }

    @Override
    public String toString() {
        return "MarineEngineer{" + "gender=" + gender + ", nidNo=" + nidNo + ", phoneNo=" + phoneNo + ", dateOfJoin=" + dateOfJoin + '}';
    }
    
}
