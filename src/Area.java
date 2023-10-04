public class Area {
    int length;
    int breadth;
    public void setDim(int len, int bre){

        length=len;
        breadth=bre;
    }
    public int getArea() {
        return length * breadth;
    }
    public static void main (String []args){
        Area area = new Area();
        area.setDim(5,10);
        System.out.println("The area of the rectangle is:"+ area.getArea());
    }
}



import java.util.Scanner;

public class Area {
    int length;
    int breadth;

    public void setDim(int len, int bre) {
        length = len;
        breadth = bre;
    }

    public int getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Area area = new Area();

        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        // Close the Scanner
        scanner.close();

        area.setDim(length, breadth);

        System.out.println("The area of the rectangle is: " + area.getArea());
    }
}