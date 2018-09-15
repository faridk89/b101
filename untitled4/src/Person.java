public class Person implements IPerson {

    public String name;
    public String address;

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    @Override
    public String getName() {
        return this.name
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void changeAddress(String Address) {
        this.address = address;
    }

    @Override
    public void printDetails() {
        System.out.println("Name is" + name);
        System.out.println("Address is " + address);
    }
}