package observerdesignpattern;

/*
 * Claire
 * @date  2020/7/25 下午9:59
 *
 */

public class Message {
    private int id;
    private String userName;

    public Message(int id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                '}';
    }
}
