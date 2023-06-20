package com.myapp;
import java.util.ArrayList;
import java.util.List;


public class User {
 private String name;
 private List<userRole2>userRoles;

 public User(String name) {
     this.name = name;
     userRoles = new ArrayList<>();
 }

 public void addRole(Role role) {
     userRoles.add((userRole2)userRoles);
 }

 public List<userRole2> getRoles() {
     return userRoles;
 }

 public String getName() {
     return name;
 }
}
