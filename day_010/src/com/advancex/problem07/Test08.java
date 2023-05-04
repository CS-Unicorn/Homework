package com.advancex.problem07;

public class Test08 {
    public static void main(String[] args) {
        User[] all = new User[15];
        for (int i = 0; i < all.length; i++) {
            all[i] = new User(null, i + 1);
        }
        Receptionist r1 = new Receptionist(new Filter() {
            @Override
            public void filterUser(User u) {
                u.setType("v1");
            }
        });
        for (int i = 0; i < 5; i++) {
            r1.recept(all[i]);
        }
        Receptionist r2 = new Receptionist(new Filter() {
            @Override
            public void filterUser(User u) {
                u.setType("v2");
            }
        });
        for (int i = 5; i < 10; i++) {
            r2.recept(all[i]);
        }
        Receptionist r3 = new Receptionist(new Filter() {
            @Override
            public void filterUser(User u) {
                u.setType("A");
            }

        });
        for (int i = 10; i < 15; i++) {
            r3.recept(all[i]);
        }
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
        }
    }
}

class User {
    private String type;
    private int id;

    public User(String type, int id) {
        super();
        this.type = type;
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "-" + type;
    }
}

interface Filter {
    void filterUser(User u);
}

class Receptionist {
    private Filter filter;

    public Receptionist(Filter filter) {
        super();
        this.filter = filter;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public void recept(User u) {
        if (u.getType() != null) {
            return;
        }
        filter.filterUser(u);
    }
}