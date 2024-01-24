package CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CLL lis = new CLL();
        lis.insert(13);
        lis.insert(23);
        lis.insert(43);
        lis.insert(53);
        lis.insert(263);
        lis.disp();
        lis.delete(43);
        lis.disp();

    }
}
