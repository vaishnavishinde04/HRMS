package com.HRMS.model;

import java.util.Date;

import jakarta.persistence.*;


@Entity
@Table(name  = "tbl_Project")
public class ProjectMaster {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Project_Id;
    private String Project_Name;
    private Integer Client_Id;
    private String Client_Name;
    private String Currency;
    private String Location;
    private Integer Manger_Id;
    private Integer Hr_Id;
    private Date Start_Date;
    private Date End_Date;
    private String Status;

    public ProjectMaster() {
    }
    
    public ProjectMaster(int projectId) {
    	this.Project_Id=projectId;
    }

    public ProjectMaster(Integer project_Id, String project_Name, Integer client_Id, String client_Name, String currency, String location, Integer manger_Id, Integer hr_Id, Date start_Date, Date end_Date, String status) {
        Project_Id = project_Id;
        Project_Name = project_Name;
        Client_Id = client_Id;
        Client_Name = client_Name;
        Currency = currency;
        Location = location;
        Manger_Id = manger_Id;
        Hr_Id = hr_Id;
        Start_Date = start_Date;
        End_Date = end_Date;
        Status = status;
    }

    public Integer getProject_Id() {
        return Project_Id;
    }

    public void setProject_Id(Integer project_Id) {
        Project_Id = project_Id;
    }

    public String getProject_Name() {
        return Project_Name;
    }

    public void setProject_Name(String project_Name) {
        Project_Name = project_Name;
    }

    public Integer getClient_Id() {
        return Client_Id;
    }

    public void setClient_Id(Integer client_Id) {
        Client_Id = client_Id;
    }

    public String getClient_Name() {
        return Client_Name;
    }

    public void setClient_Name(String client_Name) {
        Client_Name = client_Name;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Integer getManger_Id() {
        return Manger_Id;
    }

    public void setManger_Id(Integer manger_Id) {
        Manger_Id = manger_Id;
    }

    public Integer getHr_Id() {
        return Hr_Id;
    }

    public void setHr_Id(Integer hr_Id) {
        Hr_Id = hr_Id;
    }

    public Date getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(Date start_Date) {
        Start_Date = start_Date;
    }

    public Date getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(Date end_Date) {
        End_Date = end_Date;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    @Override
    public String toString() {
        return "ProjectMaster{" +
                "Project_Id=" + Project_Id +
                ", Project_Name='" + Project_Name + '\'' +
                ", Client_Id=" + Client_Id +
                ", Client_Name='" + Client_Name + '\'' +
                ", Currency='" + Currency + '\'' +
                ", Location='" + Location + '\'' +
                ", Manger_Id=" + Manger_Id +
                ", Hr_Id=" + Hr_Id +
                ", Start_Date=" + Start_Date +
                ", End_Date=" + End_Date +
                ", Status='" + Status + '\'' +
                '}';
    }
    
    
}
