/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;

/**
 *
 * @author bhawana
 */
public class tables {

    public static void main(String[] args) {
        try {
            String userTable = "create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobile varchar(10),password varchar(200),securityQuestion varchar(200),answer varchar(200),status varchar(20),UNIQUE (email))";
            String AdminDetails = "insert into user(name,email,mobile,password,securityquestion,answer,status) value('Admin','admin@gmail.com','1234567890','qwertyuiop','country','Nepal','true')";
            String categoryTable = "create table category(id int AUTO_INCREMENT primary key,name varchar(200))";
            String productTable = "create table product(id int AUTO_INCREMENT primary key,name varchar(200),category varchar(200),price varchar(200))";
            String billTable = "create table bill(id int primary key,name varchar(200),mobile varchar(200),email varchar(200),date varchar(50),total varchar(50),createdBy varchar(200))";
            Dboperation.setDataOrDelete(billTable, "User Table created successfully");
            Dboperation.setDataOrDelete(userTable, "User Table created successfully");
            Dboperation.setDataOrDelete(AdminDetails, "Admin's details added successfully");
            Dboperation.setDataOrDelete(categoryTable, "Category table created sucessfully");
            Dboperation.setDataOrDelete(productTable, "Prdocut table created sucessfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

}
