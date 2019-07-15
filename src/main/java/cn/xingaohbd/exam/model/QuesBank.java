package cn.xingaohbd.exam.model;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class QuesBank extends BaseEntity<Integer>{
    private static final long serialVersionUID = -6525908145032868837L;
    private String quesName;
    private String selectA;
    private String selectB;
    private String selectC;
    private String selectD;
    private String answer;
    private int level;
    private int quesTypeStatus;
    private int classifyId;
    private int status;
    private String analysis;

    @Override
    public String toString() {
        return "QuesBank{" +
                "quesName='" + quesName + '\'' +
                ", selectA='" + selectA + '\'' +
                ", selectB='" + selectB + '\'' +
                ", selectC='" + selectC + '\'' +
                ", selectD='" + selectD + '\'' +
                ", answer='" + answer + '\'' +
                ", level=" + level +
                ", quesTypeStatus=" + quesTypeStatus +
                ", classifyId=" + classifyId +
                ", status=" + status +
                ", analysis='" + analysis + '\'' +
                '}';
    }
}
