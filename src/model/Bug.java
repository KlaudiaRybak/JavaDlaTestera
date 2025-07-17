package model;

public class Bug {

    private String bugDescription;
    private String email;
    private int bugPriority;
    private boolean bugStatus;

    //---

    public Bug(String bugDescription, String email, int bugPriority) {
        this.bugDescription = bugDescription;
        this.email = email;
        this.bugPriority = bugPriority;
        this.bugStatus = false;
    }

    //---

    public String getBugDescription() {
        return bugDescription;
    }

    public void setBugDescription(String bugDescription) {
        if (bugDescription.length() < 10) {
            System.out.println("Incorrect bug description");
        } else {
            this.bugDescription = bugDescription;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!email.contains("@")) {
            System.out.println("Wrong email address");
        } else {
            this.email = email;
        }
    }

    public int getBugPriority(){
        return bugPriority;
    }

    public void setBugPriority(int bugPriority) {
        switch (bugPriority) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                this.bugPriority = bugPriority;
                break;
            default:
                System.out.println("Incorrect bug priority range");
        }
    }


    //---

    public void showAllBugDescription() {
        System.out.println("Bug description: " + bugDescription + " email: " + email +
                " bug priority: " + bugPriority + " bug status: " + bugStatus);
    }

    public void showEmail() {
        System.out.println("Email: " + email);
    }

    public void showBugStatus() {
        System.out.println("Bug status: " + bugStatus);
    }

}
