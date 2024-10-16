package interface_abstract_test.Interface;

public class InterfaceTest {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.sendMessage("난 길원임");
        smartPhone.musicStart();
        smartPhone.musicStop();
        smartPhone.receiveCall();
        smartPhone.sendCall();
        smartPhone.search("Interface 사용법");
    }
}
