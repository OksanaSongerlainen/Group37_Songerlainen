package Lesson_7;

public class Therapist extends Doctor {
    public Therapist () {
        super("Терапевт");
    }
    public void treat() {
        System.out.println("Общее лечение");
    }
    public void doctorsChoice (Patient patient) {
        int treatmentPlan = patient.getTreatmentPlan();
        Doctor doctorsChoice;
        if (treatmentPlan == 1) {
            doctorsChoice = new Surgeon();
        } else if (treatmentPlan == 2) {
            doctorsChoice = new Danist();
        } else {
            doctorsChoice = this;
        }
        patient.setDoctor(doctorsChoice);
        System.out.println("Пациенту " + patient.getName() + " назначен " + doctorsChoice.getSpecialisation());
        doctorsChoice.treat();
    }
}