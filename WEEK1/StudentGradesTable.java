package firstJavaProgram;

public class StudentGradesTable {
    public static void main(String[] args) {
        String[] names = {"Joe", "William", "Mary Sue", "Emily", "Michael"};
        int[] labPoints = {43, 50, 39, 48, 45};
        int[] bonusPoints = {7, 8, 10, 5, 9};
        
        System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("==          Student Points          ==");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");
        
        System.out.println("Name\t\tLab\tBonus\tTotal");
        System.out.println("----\t\t---\t-----\t-----");
        
        for (int i = 0; i < names.length; i++) {
            int total = labPoints[i] + bonusPoints[i];
            System.out.printf("%-10s\t%d\t%d\t%d\n", names[i], labPoints[i], bonusPoints[i], total);
        }
    }
}



