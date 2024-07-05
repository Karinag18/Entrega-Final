import java.util.List;
import java.util.ArrayList;

public class Graph {
    private List<User> users;

    public Graph() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void addConnection(User user1, User user2) {
        user1.addFriend(user2);
        user2.addFriend(user1);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<User> getFriends(User user) {
        return user.getFriends();
    }

    public List<User> recommendFriends(User user) {
        RecommendationEngine engine = new RecommendationEngine();
        return engine.recommendFriends(user, this);
    }
}
