public class Doctor extends Person {
    
    private String specialization;
    private String fName;
    private String lName;

    public Doctor(String fName, String lName, String specialization) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.specialization = specialization;
    }

    public void setFirstName(String newPatientFirstName){
        this.fName = newPatientFirstName;
    }
    public void setLastName(String newPatientLastName){
        this.lName = newPatientLastName;
    }
    public void setSpecialization(String newSpecializaiton){
        specialization = newSpecializaiton;
    }
    

    public String toString(){
        return String.format(fName + "\t\t" + lName + "\t\t" + specialization);
    }
}
