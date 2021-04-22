import java.util.*;

public class demo {
    public static void main(String[] args) {
        Queue<Human> queueNam = new ArrayDeque<>();
        Queue<Human> queueNu = new ArrayDeque<>();
        ArrayList<Human> array = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng phần tử");
        int size= sc.nextInt();
        sc.nextLine();
        for (int i=0;i<size;i++){
            System.out.println(" Enter Name : ");
            String name = sc.nextLine();
            System.out.println(" Enter Age : ");
            String age = sc.nextLine();
            System.out.println(" Enter gender : ");
            String gender = sc.nextLine();
            array.add(new Human(name,age,gender));
        }
        System.out.println(array);
        System.out.println("\n");
        for (Human k:array){
            if (k.getGender().equals("nam")){
                queueNam.add(k);
            }else {
                queueNu.add(k);
            }
        }
        ArrayList<Human> newArray = new ArrayList<>();
        while (!queueNu.isEmpty()){
            newArray.add(queueNu.poll());
        }
        while (!queueNam.isEmpty()){
            newArray.add(queueNam.poll());
        }
        System.out.println(newArray);


    }
}
