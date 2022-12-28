package Test;

public interface IEmployeeRepository {
    void add();
    void display();
    void edit(Employee employee);
    Employee search(int maNhanVien);
}
