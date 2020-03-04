package by.belhard.j20.lessons.lesson11.jdbcExample;

import java.sql.SQLException;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    DBManager manager = new DBManager();

    List<Employee> list = null;

    try {
      list = manager.getEmployeesListByCharInclude('a');
    } catch (SQLException e) {
      e.printStackTrace();
    }

    if (list != null) {
      list.forEach(System.out::println);
//      list.forEach(e -> System.out.println(e));
    } else
      System.out.println("Empty list");

    Specialty specialty1 = list.get(0).getSpecialty();
    Specialty specialty2 = list.get(4).getSpecialty();

    System.out.println(specialty1.equals(specialty2));
    System.out.println(specialty1 == specialty2);
  }
}
