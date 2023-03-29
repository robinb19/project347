package Repetitions.Abstraktion;

public class Medium {
    private String name;
    private boolean entleihstatus;

    public Medium(String name, boolean entleihstatus){
        super();
        this.name = name;
        this.entleihstatus = entleihstatus;
    }
    public boolean getEntleihstatus(){
        return entleihstatus;
    }
    public void setEntleihstatus(boolean entleihstatus) {
        this.entleihstatus = entleihstatus;
    }

    public double getGebuehr(){
        return 0;
    }
    public void printInformation(){
        System.out.println("Mediuminformationen");
        System.out.println("Name: " + name);
        System.out.println("Ausleihstatus: "+ entleihstatus);
    }
}
