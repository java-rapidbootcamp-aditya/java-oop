public class Income extends Person {
    String pekerjaan;
    String gaji;

    public Income(String pekerjaan, String gaji) {
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    public Income(Integer id, String name, String gender, String address, int age, String pekerjaan, String gaji) {
        super(id, name, gender, address, age);
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }
}
