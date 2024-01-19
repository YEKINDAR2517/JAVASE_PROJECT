package Project.domain;

import Project.service.Status;

/**
 * ClassName: Programmer
 * Package: Project.domain
 * Description:
 *
 * @Author xu
 * @Create 2024/1/19 10:38
 * @Version 1.0
 */
public class Programmer extends Employee {
    private int memberID;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary, Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetails() + "\t程序员\t" + getStatus() + "\t\t\t\t\t" + getEquipment().getDescription();
    }

    public String getDetailsForTeam() {
        return getMemberID() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t" + getSalary() + "\t程序员";
    }
}
