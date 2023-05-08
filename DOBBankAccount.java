import java.util.*;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class BankAccCreate {
    int age;
    String name;
    String addr;
    String Fname;
    int id;

    public BankAccCreate(int age, String name, String addr, String Fname) {

        this.age = age;
        this.name = name;
        this.addr = addr;
        this.Fname = Fname;

    }

    public void BankAccId() {
        Random random = new Random(999999);
        this.id = random.nextInt();

    }

    public void display() {
        System.out.println("Name : " + this.name + "\n Father Name : " + this.Fname + "\n Address : " + this.addr
                + "\n Age : " + this.age + "\n Your BANK Acc No : " + this.id);
    }
}

class BankAcc {
    public static void main(String[] a) {
        int age;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println(" ENTER AGE.");
            age = in.nextInt();
            if (age < 18)
                throw new InvalidAgeException("YOU ARE NOT ELIGGIBLE FOR CREATING BANK ACC");
            else {
                System.out.println("**** Enter you Details ****");
                String del = in.nextLine();
                System.out.println("Enter you name : ");
                String name = in.nextLine();

                System.out.println("Enter you Address : ");
                String addr = in.nextLine();
                System.out.println("Enter you Father Name : ");
                String Fname = in.nextLine();
                BankAccCreate id1 = new BankAccCreate(age, name, addr, Fname);
                id1.BankAccId();
                id1.display();
            }
        } catch (InvalidAgeException e) {
            System.out.println("CAUGHT AN EXCEPTION");
            System.out.println(e.getMessage());
        }

    }
}
