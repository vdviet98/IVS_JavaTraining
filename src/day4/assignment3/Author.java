package day4.assignment3;

public class Author {
    private String name;
    private String email;
    private boolean isMale;

    public Author(String name, String email, boolean isMale) {
        this.name = name;
        this.email = email;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isMale() {
        return isMale;
    }

    public String toString(){
        if (this.isMale()){
            return this.getName() + " (Male) at " + this.getEmail();
        }
        return this.getName() + " (Female) at " + this.getEmail();
    }
}
