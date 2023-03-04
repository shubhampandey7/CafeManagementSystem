/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import model.Bill;

/**
 *
 * @author bhawana
 */
public class BillDao {

    public static String getID() {
        int id = 1;
        try {
            ResultSet rs = Dboperation.getData("select max(id) from bill");
            while (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }

    public static void save(Bill bill) {
        String query = "insert into bill values('" + bill.getId() + "','" + bill.getName() + "','" + bill.getMobile() + "','" + bill.getEmail() + "','" + bill.getDate() + "','" + bill.getTotal() + "','" + bill.getCreatedBy() + "')";
        Dboperation.setDataOrDelete(query, "Bills Details Added Successfully");
    }

    public static ArrayList<Bill> getAllRecordByInc(String date) {
        ArrayList<Bill> list = new ArrayList<>();
        try {
            ResultSet rs = Dboperation.getData("select *from bill where date like '%" +date+ "%'");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobile(rs.getString("mobile"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                list.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }

    public static ArrayList<Bill> getAllRecordByDesc(String date) {
        ArrayList<Bill> list = new ArrayList<>();
        try {
            ResultSet rs = Dboperation.getData("select *from bill where date like '%" +date+ "%' order By id DESC");
            while (rs.next()) {
                Bill bill = new Bill();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobile(rs.getString("mobile"));
                bill.setEmail(rs.getString("email"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                list.add(bill);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return list;
    }
}
