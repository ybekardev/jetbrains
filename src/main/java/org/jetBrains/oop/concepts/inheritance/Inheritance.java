package org.jetBrains.oop.concepts.inheritance;

import java.util.Date;

public class Inheritance {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setSalary(23445L);
        employee.setStartDate(new Date());
        System.out.println(employee.getSalary());
        System.out.println(employee.getStartDate());

        Programmer programmer = new Programmer();

        System.out.println(employee.getSalary());
        System.out.println(employee.getStartDate());

        programmer.setSkills(new String[]{"Java", "SQL", "Maven"});
        String[] arr = programmer.getSkills();
        for (String s : arr) {
            System.out.println(s);
        }

        Manager manager = new Manager();
        manager.setName("John Black");
        manager.setAddress("N Terr Blvd 23rd street");
        manager.setStartDate(new Date());
        manager.setSalary(3435342L);
        manager.setSmile(true);
        manager.setYearOfBirth(1975);
        System.out.println(manager.getName());
        System.out.println(manager.getAddress());
        System.out.println(manager.getStartDate());
        System.out.println(manager.getSalary());
        System.out.println(manager.isSmile());

    }


    static class Person {
        protected String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getYearOfBirth() {
            return yearOfBirth;
        }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        protected int yearOfBirth;
        protected String address;
        //getters & setters
    }

    static class Client extends Person {
        public String getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        public boolean isPremiumMember() {
            return premiumMember;
        }

        public void setPremiumMember(boolean premiumMember) {
            this.premiumMember = premiumMember;
        }

        protected String contactNumber;
        protected boolean premiumMember;
        //getters & setters
    }

    static class Employee extends Person {
        protected Date startDate;

        public Date getStartDate() {
            return startDate;
        }

        public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }

        protected Long salary;
        //getters & setters
    }

    static class Programmer extends Employee {
        protected String[] skills;
        public String[] getSkills() {
            return skills;
        }
        public void setSkills(String[] skills) {
            this.skills = skills;
        }
    }

    static class Manager extends Employee {
        protected boolean smile;
        public boolean isSmile() {
            return smile;
        }
        public void setSmile(boolean smile) {
            this.smile = smile;
        }
    }
}
