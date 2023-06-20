package com.myapp;
import java.util.ArrayList;
import java.util.List;


public class Role {
 private String roleName;
 private List<userRole2>userRoles ;

 public Role(String roleName) {
     this.roleName = roleName;
     userRoles = new ArrayList<>();
 }

 public void addUser(userRole2 userRole2) {
     userRoles.add(userRole2);
 }

 public List<userRole2> getUsers() {
     return userRoles;
 }

 public String getRoleName() {
     return roleName;
 }
}
