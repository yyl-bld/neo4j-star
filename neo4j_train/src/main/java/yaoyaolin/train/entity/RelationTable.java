package yaoyaolin.train.entity;

public class RelationTable {
    private String mainStar;
    private String relation;
    private String secondStar;

    public String getMainStar() {
        return mainStar;
    }

    public void setMainStar(String mainStar) {
        this.mainStar = mainStar;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getSecondStar() {
        return secondStar;
    }

    public void setSecondStar(String secondStar) {
        this.secondStar = secondStar;
    }

    @Override
    public String toString() {
        return "RelationTable{" +
                "mainStar='" + mainStar + '\'' +
                ", relation='" + relation + '\'' +
                ", secondStar='" + secondStar + '\'' +
                '}';
    }
}
