package leb7;

public class studentApp {
    public static void main(String[] args) {
        //object creation
        // การสร้าง object
        Student std1;
        std1 = new Student();
        System.out.println(std1.getName());
        std1.setName("Boy");
        System.out.println(std1.getName());
        System.out.println(std1.getGender());
        std1.setGender('M');
        System.out.println(std1.getGender());
        std1.setId("358411110067");
        ///////////////////////
        Student std2 = new Student("222222222","Gitl",'F');

        System.out.println(std1.getName());
        System.out.println(std2.getName());



    }

}//class
