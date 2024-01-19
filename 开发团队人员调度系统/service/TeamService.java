package Project.service;

import Project.domain.Architect;
import Project.domain.Designer;
import Project.domain.Employee;
import Project.domain.Programmer;

/**
 * ClassName: TeamService
 * Package: Project.service
 * Description:
 *
 * @Author xu
 * @Create 2024/1/19 11:26
 * @Version 1.0
 */
public class TeamService {
    private static int counter = 1; //自动赋值mID
    private final int MAX_MEMBER = 5;
    private Programmer[] team;
    private int total;

    public TeamService() {
        team = new Programmer[MAX_MEMBER];
        total = 0;
    }

    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[this.total];
        for (int i = 0; i < this.total; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    public void addMember(Employee e) throws TeamException {
        if (total >= MAX_MEMBER) throw new TeamException("成员已满");
        if (!(e instanceof Programmer)) throw new TeamException("该员工不是开发人员，无法添加");

        Status status = ((Programmer) e).getStatus();
        switch (status) {
            case BUSY:
                throw new TeamException("该员工已经是团队成员");
            case VOCAtion:
                throw new TeamException("该员工正在休假");
        }

        int proNum = 0, desNum = 0, arcNum = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) arcNum++;
            else if (team[i] instanceof Designer) desNum++;
            else if (team[i] instanceof Programmer) proNum++;
        }

        if (e instanceof Architect) {
            if (arcNum >= 1) throw new TeamException("团队中已有一名架构师");
        } else if (e instanceof Designer) {
            if (desNum >= 2) throw new TeamException("团队中已有两名设计师");
        } else if (e instanceof Programmer) {
            if (proNum >= 3) throw new TeamException("团队中已有三名程序员");
        }

        ((Programmer)e).setMemberID(counter++);
        ((Programmer)e).setStatus(Status.BUSY);
        team[total++] = ((Programmer)e);
    }

    public void removeMember(int memberID) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberID() == memberID) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        if (i == total) throw new TeamException("未找到该员工");

        //调整数组
        for (int j = i; j < total; j++) {
            team[j] = team[j + 1];
        }
        team[--total] = null;
    }
}
