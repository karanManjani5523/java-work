package Assingment;
abstract class Marks {
    abstract double getPercentage();
}

class Z extends Marks {
    int maths, science, english;

    Z(int maths, int science, int english) {
        this.maths = maths;
        this.science = science;
        this.english = english;
    }

    double getPercentage() {
        return (maths + science + english) / 3.0;
    }
}

class Y extends Marks {
    int  python,ai, java, php;

    Y(int python, int ai, int java, int php) {
        this.python = python;
        this.ai = ai;
        this.java = java;
        this.php = php;
    }

    double getPercentage() {
        return (python + ai + java + php) / 4.0;
    }
}

public class Program27 {
    public static void main(String[] args) {
        Z studentA = new Z(80, 70, 90);
        Y studentB = new Y(80, 70, 90, 85);

        System.out.println("Student A's percentage: " + studentA.getPercentage());
        System.out.println("Student B's percentage: " + studentB.getPercentage());
    }
}