package interface_abstract_test.Interface;

public interface Phone {
    String defaultMessage = "이곳에 문자를 입력해주세요";
    void sendCall();
    void receiveCall();
    default void sendMessage(String message) {
        System.out.println(message);
    }
}
