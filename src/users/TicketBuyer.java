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
public class TicketBuyer extends User {

    private String gender;
    private int nidNo;
    private int phoneNo;

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

    @Override
    public String toString() {
        return "TicketBuyer{" + "gender=" + gender + ", nidNo=" + nidNo + ", phoneNo=" + phoneNo + '}';
    }

    
}
