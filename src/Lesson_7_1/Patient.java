package Lesson_7_1;

public class Patient {
    private int treatmentPlan;
    private Doctor doctor;
    private String name;
    public Patient (String name, int treatmentPlan) {
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public String getName() {
        return name;
    }
}
