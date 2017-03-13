package ioc.iocExample;


import java.beans.ConstructorProperties;

public class Person {
    private  int age = 0;
    private String description = "defaultDescription";
    //	@Value("#{settings[name]}")
    private String name = "defaultName";

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @ConstructorProperties({"name", "description"})
    public Person(String name, String des) {
        this.name = name;
        this.description = des;
    }

    public int getAge() {
        return age;
    }

    public static class InnerPerson {

        public InnerPerson(String name) {
            this.name = name;
        }

        private String name = "defaultInnerPersonName";

        public String getName() {
            return name;
        }
    }
}

