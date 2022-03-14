/**
 * Напишете програма, която:
 * 1. Извежда името ви в конзолата.
 * 2. Сравнява го с име на приятел/ка, като използвате equals(),
 * equalsIgnoreCase(), compareTo(), резултатите да излизат на отделни редове.
 * 3. Долепя до името ви вашата фамилия, на нов ред.
 * 4. Извежда възраст нов ред.
 * 5. Извежда името фамилията и годините ви на един ред.
 * 6. Извежда името фамилията и годините на приятелят/ката ви на нов ред.
 *  //декларирайте и инициализирайте променливи
 *  //може да използвате методите за събиране на низове
 */
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
