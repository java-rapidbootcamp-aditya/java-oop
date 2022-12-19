public class Kondisi extends Person {
    public Integer tahun;
    public String ect;

    public Kondisi(Integer tahun, String ect) {
        this.tahun = tahun;
        this.ect = ect;
    }

    public Kondisi(Integer id, String name, String gender, String address, int age, Integer tahun, String ect) {
        super(id, name, gender, address, age);
        this.tahun = tahun;
        this.ect = ect;
    }
}
