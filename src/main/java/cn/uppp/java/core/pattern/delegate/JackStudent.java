package cn.uppp.java.core.pattern.delegate;

public class JackStudent implements Student {

    @Override
    public void handHomework() {
        System.out.println("学生Jack交作业");
    }
}
