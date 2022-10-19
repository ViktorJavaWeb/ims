package org.example.javaEssential.exceptions.task2;

import javax.xml.crypto.Data;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Worker {
    /*фамилия и инициалы работника;
  название занимаемой должности;
  год поступления на работу.*/

    private String lastName;
    private String employeePosition;
    private Date dateStartWork;

    public String getLastName() {
        return lastName;
    }

    public Worker() {
    }

    public void setLastName(String lastName) {
        this.lastName = lastName.trim();
    }

    public String getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(String employeePosition) {
        this.employeePosition = employeePosition.trim();
    }

    public Date getDateStartWork() {
        return dateStartWork;
    }

    public void setDateStartWork(String dateStartWork) {
        Date date = null;
        try {
            date = new SimpleDateFormat("d.M.yyyy").parse(dateStartWork);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        this.dateStartWork = date;
    }

    @Override
    public String toString() {
        return "Worker:" +
                "\n\tlastName = '" + lastName + '\'' +
                "\n\temployeePosition = '" + employeePosition + '\'' +
                "\n\tdateStartWork = " + dateStartWork;
    }
}
