package com.spring.ioc;


public class Person {
    //	@Value("#{settings[name]}")
    private String name = "defaultName";

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

