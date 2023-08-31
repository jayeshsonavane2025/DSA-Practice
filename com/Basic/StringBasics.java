package LearnString;

public class StringBasics {
    public static void main(String[] args) {
        String name = "ANuj";
        String sameName = "Anuj";
        String newName = new String("Anuj");

        System.out.println(name);
        System.out.println(newName);

//        if(name == sameName) {
//            System.out.println("Both are same");
//        }
//
//        if(name == newName) {
//            System.out.println("Both are same");
//        } else {
//            System.out.println("Both are not same");
//        }

        if(name.equalsIgnoreCase(newName)) {
            System.out.println("name and newName have same values");
        } else {
            System.out.println("Not same");
        }
    }
}
