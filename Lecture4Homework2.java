package mypack;

public class Lecture4Homework2 {
    public static void main(String[] args) {
        String myName = "Vladislav";
        System.out.println(myName);
        String friendName = "Dimitar";
        System.out.println(myName.equals(friendName));
        System.out.println(myName.equalsIgnoreCase(friendName));
        System.out.println(myName.compareTo(friendName));

        String lastName = "Stamenov";
        System.out.println(myName.concat("\n").concat(lastName));
        byte age = 32;
        System.out.println(age);
        System.out.println(myName + " " + lastName + " " +age);
        String friendLastName = "Petrov";
        byte friendAge = 33;
        System.out.println(friendName + " " + friendLastName + " " + friendAge);
    }
}
