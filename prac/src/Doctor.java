public abstract class Doctor extends Human {
    private final String university;
    private String practice;

    public Doctor(String name, int age, double height, String university) {
        super(name, age, height);
        this.university = university;
        this.practice="";
    }

    public void getUniversity(){
        System.out.println( "i am from " + this.university);
    }

    public void setPractice(String practice){
        this.practice = practice;
    };

    public String getPractice() {
        return practice;
    }
}
