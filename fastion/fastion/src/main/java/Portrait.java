public class Portrait {
    private String id;
    private String level;

    public Portrait(){
        System.out.println("Constructor");
    }

    public String getID(){
        System.out.println("getID");
        return id;
    }

    public void setID(String id){
        System.out.println("setID");
        this.id = id;
    }

    public String getLevel(){
        System.out.println("getLevel");
        return level;
    }

    public void setLevel(String level){
        System.out.println("setLevel");
        this.level = level;
    }
}
