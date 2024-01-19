package Project.service;

import Project.domain.*;

import static Project.service.Data.*;
/**
 * ClassName: NameListService
 * Package: Project.service
 * Description:
 *
 * @Author xu
 * @Create 2024/1/19 10:45
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;

            switch(Integer.parseInt(EMPLOYEES[i][0])) {
                case EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case PROGRAMMER:
                    equipment = creatEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case DESIGNER:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case ARCHITECT:
                    equipment = creatEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    public Equipment creatEquipment(int i) {
        Equipment e = null;
        int type = Integer.parseInt(EQUIPMENTS[i][0]);
        switch (type) {
            case PC:
                e = new PC(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);
                break;
            case NOTEBOOK:
                e = new NoteBook(EQUIPMENTS[i][1], Double.parseDouble(EQUIPMENTS[i][2]));
                break;
            case PRINTER:
                e = new Printer(EQUIPMENTS[i][1], EQUIPMENTS[i][2]);
                break;

        }
        return e;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if(id == employees[i].getId()) return employees[i];
        }
        throw new TeamException("未找到指定员工");
    }
}
