package Project.domain;

/**
 * ClassName: Printer
 * Package: Project.domain
 * Description:
 *
 * @Author xu
 * @Create 2024/1/18 22:05
 * @Version 1.0
 */
public class Printer implements Equipment {
    private String name;
    private String type;

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type + ")";
    }
}
