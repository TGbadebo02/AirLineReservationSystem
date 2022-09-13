public class Airline {
    private Person[] seats;

    public Airline() {
        seats = new Person[11];
    }

    public Person getPerson(int index) {
        return new Person(this.seats[index]);
    }

    public void setPerson(Person person1) {
        this.seats[person1.getSeatNumber() - 1] = new Person(person1);
    }

    public void createReservation(Person person) {
        while (seats[person.getSeatNumber() - 1] != null) {
            System.out.println("\n" + person.getName() + ", seat: " + person.getSeatNumber() + " is already taken. Please choose another seat.\n");
            person.chooseSeat();
        }
    }

    public String toString(){
        String temp = "";
        for(int i = 0; i<seats.length;i++){
            if(seats[i]!= null) {
                temp += seats[i].toString();
                temp += "\n\n";
            }

            else{
                temp += "Seat " + (i + 1) + " is empty.";
                temp += "\n\n";
            }
        }
        return temp;
    }

}
