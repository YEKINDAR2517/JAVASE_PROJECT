package Project.domain;

/**
 * ClassName: PC
 * Package: Project.domain
 * Description:
 *
 * @Author xu
 * @Create 2024/1/18 22:02
 * @Version 1.0
 */
public class PC implements Equipment {
    private String model;
    private String display;

    public PC() {
    }

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
