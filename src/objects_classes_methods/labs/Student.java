package objects_classes_methods.labs;

public class Student {

    private int age;
    private String color;

    public Student ( int age, String color){
        this.age = age;
        this.color = color;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >=0 && age <=140 ){
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
