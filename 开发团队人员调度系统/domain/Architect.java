package Project.domain;

/**
 * ClassName: Architect
 * Package: Project.domain
 * Description:
 *
 * @Author xu
 * @Create 2024/1/19 10:44
 * @Version 1.0
 */
public class Architect extends Designer {
    private int stock;

    public Architect() {
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus()
                + "\t" + getStock() + "\t" + getEquipment().getDescription();
    }

    public String getDetailsForTeam() {
        return getMemberID() + "/" + getId() + "\t" + getName() + "\t" + getAge()
                + "\t" + getSalary() + "\t设计师\t" + getBonus() + "\t" + getStock();
    }
}
