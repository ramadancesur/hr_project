import java.util.ArrayList;
import java.util.List;

// Department sınıfı
class Department {
    private String name;
    private List<String> employees;

    // Constructor: Departman adını ayarlıyor ve çalışanlar listesini başlatıyor
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Personel ekleyen metod
    public void addEmployee(String employee) {
        employees.add(employee);
    }

    // Tüm personelleri döndüren metod
    public List<String> getEmployees() {
        return employees;
    }

    // Departman adını döndüren metod
    public String getDepartmentName() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        // Yeni bir departman oluştur
        Department itDepartment = new Department("Bilgi Teknolojileri");

        // Departmana personel ekle
        itDepartment.addEmployee("Ramadan Cesur");
        itDepartment.addEmployee("Serkan Cura");
        itDepartment.addEmployee("Ahmet Mehmet");
        itDepartment.addEmployee("Ayşe Fatma");

        // Departmanın adını ve personellerini ekrana yazdır
        System.out.println("Departman: " + itDepartment.getDepartmentName());
        System.out.println("Personeller:");

        // Personelleri listele
        for (String employee : itDepartment.getEmployees()) {
            System.out.println("- " + employee);
        }
    }
}
