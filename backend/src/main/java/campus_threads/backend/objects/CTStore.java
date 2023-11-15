package campus_threads.backend.objects;

import java.util.HashMap;

public class CTStore {
	private HashMap<Integer, Post> activePosts_;
	private HashMap<Integer, User> users_;

	public CTStore() {
		this.activePosts_ = new HashMap<>();
		this.users_ = new HashMap<>();
	}

	public HashMap<Integer, Post> getActivePosts() {
		return activePosts_;
	}

	public void setActivePosts(HashMap<Integer, Post> activePosts) {
		this.activePosts_ = activePosts;
	}
	public HashMap<Integer, User> getUsers() {
		return users_;
	}

	public void setUsers(HashMap<Integer, User> users) {
		this.users_ = users;
	}
}