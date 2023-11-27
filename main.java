import models.Student;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Student Paurakh=new Student();
        Scanner obj=new Scanner(System.in);
        System.out.println("Marks in Phys");
        Paurakh.setPhysics(obj.nextInt());
        System.out.println("Marks in math");
        Paurakh.setMaths(obj.nextInt());
        System.out.println("marks in chemistry");
        Paurakh.setChemistry(obj.nextInt());
        System.out.println("Maths:"+Paurakh.getMaths());
        System.out.println("Phys:"+Paurakh.getPhysics());
        System.out.println("Chemistry"+ Paurakh.getChemistry());
    }
}
