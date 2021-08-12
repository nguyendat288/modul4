package dao;

import model.Student;

import java.sql.*;
import java.util.ArrayList;

public class ManagerStudent {
    static Connection connection;
    static ArrayList<Student> list =new ArrayList<>();

    static {
        connection = ConnectMySql.getConnect();
    }

    public static ArrayList<Student> select() throws SQLException, ClassNotFoundException {
        String select = "select * from student";
        // tạo ra Statement bằng connection.
        Statement statement = connection.createStatement();
        // thực câu truy vấn bằng statement.executeQuery và kết quả trả về là ResultSet;
        ResultSet resultSet = statement.executeQuery(select);

        while (resultSet.next()) {
            int id = Integer.parseInt(resultSet.getString("id"));
            String name = resultSet.getString("name");
            String phone = resultSet.getString("phone");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            int classroom = Integer.parseInt(resultSet.getString("classroom"));

            list.add(new Student(id,name,phone,email,address,classroom));
        }
        return list;
    }
    public static  void create(Student tk) throws SQLException {
        String create="insert into student value(?,?,?,?,?,?)";
        PreparedStatement preparedStatement=connection.prepareStatement(create);
        preparedStatement.setInt(1,tk.getId());
        preparedStatement.setString(2,tk.getName());
        preparedStatement.setString(3,tk.getPhone());
        preparedStatement.setString(4,tk.getEmail());
        preparedStatement.setString(5,tk.getAddress());
        preparedStatement.setInt(6,tk.getClassroom());
        preparedStatement.execute();
    }
    public static  void edit(Student tk) throws SQLException {
        String edit="update student set name =? , phone=? , email =? ,address= ?, classroom=? where id =?";
        PreparedStatement preparedStatement=connection.prepareStatement(edit);
        preparedStatement.setInt(6,tk.getId());
        preparedStatement.setString(1,tk.getName());
        preparedStatement.setString(2,tk.getPhone());
        preparedStatement.setString(3,tk.getEmail());
        preparedStatement.setString(4,tk.getAddress());
        preparedStatement.setInt(5,tk.getClassroom());
        preparedStatement.execute();
    }
    public static  void delete(int id) throws SQLException {
        String delete="delete from student  where id =?";
        PreparedStatement preparedStatement=connection.prepareStatement(delete);
        preparedStatement.setInt(1,id);
        preparedStatement.execute();
    }
    public static ArrayList<Student> findByName(String findName) throws SQLException {
        ArrayList<Student> findList = new ArrayList<>();
        String edit = "select * from student where name like '%" + findName +"%'";
        PreparedStatement preparedStatement = connection.prepareStatement(edit);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            int id = Integer.parseInt(resultSet.getString("id"));
            String name = resultSet.getString("name");
            String phone = resultSet.getString("phone");
            String email = resultSet.getString("email");
            String address = resultSet.getString("address");
            int classroom = Integer.parseInt(resultSet.getString("classroom"));

            findList.add(new Student(id,name,phone,email,address,classroom));
        }
        return findList;
    }
}
