public class Test {
    public static void main(String[] args) {
        IPerson person = new Person( name: "Farid", address: "North York");
    }
    static void investigatePerson(IPerson person){
        System.out.println(person.getName());
        person.printDetails();
    }
}
