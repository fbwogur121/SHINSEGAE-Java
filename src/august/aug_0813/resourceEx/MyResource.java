package august.aug_0813.resourceEx;

public class MyResource implements AutoCloseable {
    private String name;

    MyResource(String name) {
        this.name = name;
        System.out.println("[MyResource(" + name + ") 열기");
    }

    public String read1(){
        System.out.println("[MyResource(" + name + ") 읽기");
        return "100";
    }

    public String read2(){
        System.out.println("[MyResource(" + name + ") 읽기");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("[MyResource(" + name + ") 닫기");
    }
}
