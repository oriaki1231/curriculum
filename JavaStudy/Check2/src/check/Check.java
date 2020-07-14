package check;

import constants.Constants;

public class Check {

    private String firstName = "朗";
    private String lastName = "折尾";

    private void printName() {
        System.out.println("printNameメソッド → " + lastName + firstName);
    }

    public static void main(String[] args) {

        Check name = new Check();
        name.printName();

        Constants b = new Constants();

        Pet p = new Pet(b.CHECK_CLASS_JAVA,b.CHECK_CLASS_HOGE);
        p.introduce();

        RobotPet r = new RobotPet(b.CHECK_CLASS_R2D2,b.CHECK_CLASS_LUKE);
        r.introduce();
    }
}