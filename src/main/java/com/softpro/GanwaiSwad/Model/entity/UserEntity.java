package com.softpro.GanwaiSwad.Model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class UserEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer user_id;
private String user_name;
private String user_email;
private String user_password;
private String user_mobile;
private String user_role;
private String user_address;
private String user_city;
private String user_state;
private String user_zip;
private Integer user_status;

public UserEntity() {
   }

   public UserEntity(Integer user_id, String user_name, String user_email, String user_password, String user_mobile,
           String user_role, String user_address, String user_city, String user_state, String user_zip,
           Integer user_status) {
       super();
       this.user_id = user_id;
       this.user_name = user_name;
       this.user_email = user_email;
       this.user_password = user_password;
       this.user_mobile = user_mobile;
       this.user_role = user_role;
       this.user_address = user_address;
       this.user_city = user_city;
       this.user_state = user_state;
       this.user_zip = user_zip;
       this.user_status = user_status;
   }
   public Integer getUser_id() {
       return user_id;
   }
   public void setUser_id(Integer user_id) {
       this.user_id = user_id;
   }
   public String getUser_name() {
       return user_name;
   }
   public void setUser_name(String user_name) {
       this.user_name = user_name;
   }
   public String getUser_email() {
       return user_email;
   }
   public void setUser_email(String user_email) {
       this.user_email = user_email;
   }
   public String getUser_password() {
       return user_password;
   }
   public void setUser_password(String user_password) {
       this.user_password = user_password;
   }
   public String getUser_mobile() {
       return user_mobile;
   }
   public void setUser_mobile(String user_mobile) {
       this.user_mobile = user_mobile;
   }
   public String getUser_role() {
       return user_role;
   }
   public void setUser_role(String user_role) {
       this.user_role = user_role;
   }
   public String getUser_address() {
       return user_address;
   }
   public void setUser_address(String user_address) {
       this.user_address = user_address;
   }
   public String getUser_city() {
       return user_city;
   }
   public void setUser_city(String user_city) {
       this.user_city = user_city;
   }
   public String getUser_state() {
       return user_state;
   }
   public void setUser_state(String user_state) {
       this.user_state = user_state;
   }
   public String getUser_zip() {
       return user_zip;
   }
   public void setUser_zip(String user_zip) {
       this.user_zip = user_zip;
   }
   public Integer getUser_status() {
       return user_status;
   }
   public void setUser_status(Integer user_status) {
       this.user_status = user_status;
   }



}
