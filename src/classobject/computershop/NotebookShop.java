package classobject.computershop;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        Computer apple = new Computer("Apple", 12345);
        Computer apple2 = new Computer("Apple", 12345);
        Computer hp = new Computer("HPEnvy", 22335);
        Computer hp2 = new Computer("HPPavillion", 22336);
        Computer hp3 = new Computer("HPBlack", 22337);

        dataStore.add(apple);
        dataStore.add(apple2);
        dataStore.add(hp);
        dataStore.add(hp2);
        dataStore.add(hp3);

        Computer compToFind = new Computer("Apple", 12345);
        int computersFound = dataStore.checkAvailability(compToFind);
        System.out.println("Liczba komputerów " + compToFind + ": " + computersFound);

        System.out.println("Wszystkie dostępne komputery: ");
        for (Computer c : dataStore.getComputers()) {
            System.out.println(c);
        }
    }
}
