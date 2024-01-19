package Project.domain;

/**
 * ClassName: Designer
 * Package: Project.domain
 * Description:
 *
 * @Author xu
 * @Create 2024/1/19 10:43
 * @Version 1.0
 */
public class Designer extends Programmer {
    private double bonus;

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus() + "\t" + getBonus()
                + "\t\t\t" + getEquipment().getDescription();
    }

    public String getDetailsForTeam() {
        return getMemberID() + "/" + getId() + "\t" + getName() + "\t" + getAge()
                + "\t" + getSalary() + "\t设计师\t" + getBonus();
    }
}
