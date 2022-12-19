public class Origin extends Person {
    public  String suku;
    public  String reqion;


    public Origin(String suku, String reqion) {
        this.suku = suku;
        this.reqion = reqion;
    }

    public Origin(Integer id, String name, String gender, String address, int age, String suku, String reqion) {
        super(id, name, gender, address, age);
        this.suku = suku;
        this.reqion = reqion;
    }
}
