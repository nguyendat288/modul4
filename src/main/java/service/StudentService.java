package service;

import dao.ManagerStudent;
import model.Student;

import java.sql.SQLException;
import java.util.ArrayList;

public class StudentService {
    public ArrayList<Student> list=new ArrayList<>();
    public StudentService() {
        try {
            list= ManagerStudent.select();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void add(Student tk) throws SQLException {
        ManagerStudent.create(tk);
        list.add(tk);
    }
    public void edit(Student tk,int index) throws SQLException {
        ManagerStudent.edit(tk);
        list.set(index,tk);
    }
    public void delete(int index) throws SQLException {
        ManagerStudent.delete(list.get(index).getId());
        list.remove(index);
    }
    public Student findById(int id){
        for(Student x:list){
            if(x.getId()==id){
                return x;
            }
        }
        return null;
    }
    public ArrayList<Student> findByName(String name) throws SQLException {
        return  ManagerStudent.findByName(name);
    }
}
