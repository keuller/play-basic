package models;

/**
 * Simple VO contact class.
 */
public final class Contact {

    private final Integer id;

    private final String name;

    private final String email;

    public Contact(int id, String name, String mail) {
        this.id = id;
        this.name = name;
        this.email = mail;
    }

    public Integer getId() { return id; }

    public String getName() { return name; }

    public String getEmail() { return email; }

    public boolean equals(Object obj) {
        if (obj == null) return false;
        boolean isInstance = (obj instanceof Contact);
        if (!isInstance) return false;
        final Contact bean = (Contact) obj;
        return bean.getId().equals(this.id);
    }
    
}
