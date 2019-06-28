package singerAndRunner;

public class Girl implements Runner, Singer {

    String name;
    int age;
    boolean runing;
    boolean sining;

    public Girl(String name, int age, boolean runing, boolean sining) {
        this.name = name;
        this.age = age;
        this.runing = runing;
        this.sining = sining;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isRuning() {
        return runing;
    }

    public boolean isSining() {
        return sining;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", runing=" + runing +
                ", sining=" + sining +
                '}';
    }

    @Override
    public boolean run() {
        return runing;
    }

    @Override
    public int runDistance() {
        return 0;
    }

    @Override
    public boolean guitar() {
        return false;
    }

    @Override
    public String sing() {
        return null;
    }
}
