public class Patient extends Person {
    private String fName;
    private String lName;
    private String doctor;

    public Patient(String fName, String lName, String doctor) {
            super();
            this.fName = fName;
            this.lName = lName;
            this.doctor = doctor;
        }

        public void setFirstName(String newPatientFirstName){
            this.fName = newPatientFirstName;
        }
        public void setLastName(String newPatientLastName){
            this.lName = newPatientLastName;
        }
        public void setDoctorname(String newDoctorName){
            this.doctor = newDoctorName;
        }

        public String toString(){
            return String.format(fName + "\t\t" + lName + "\t\t" + "Dr." + doctor);
        }
}
