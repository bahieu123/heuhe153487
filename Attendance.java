/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Date;

/**
 *
 * @author Nhat Anh
 */
public class Attendance {
    private int attenID;
    private Schedule Sche;
    private int UserID;
    private String studenName;
    private Date date;
    private Slot slot;
    private boolean atten;
    private String note;

    public Attendance() {
    }

    public Attendance(int attenID, Schedule Sche, int UserID, String studenName, Date date, Slot slot, boolean atten, String note) {
        this.attenID = attenID;
        this.Sche = Sche;
        this.UserID = UserID;
        this.studenName = studenName;
        this.date = date;
        this.slot = slot;
        this.atten = atten;
        this.note = note;
    }

    public int getAttenID() {
        return attenID;
    }

    public void setAttenID(int attenID) {
        this.attenID = attenID;
    }

    public Schedule getSche() {
        return Sche;
    }

    public void setSche(Schedule Sche) {
        this.Sche = Sche;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public String getStudenName() {
        return studenName;
    }

    public void setStudenName(String studenName) {
        this.studenName = studenName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Slot getSlot() {
        return slot;
    }

    public void setSlot(Slot slot) {
        this.slot = slot;
    }

    public boolean isAtten() {
        return atten;
    }

    public void setAtten(boolean atten) {
        this.atten = atten;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
}
