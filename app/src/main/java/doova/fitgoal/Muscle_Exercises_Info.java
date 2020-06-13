package doova.fitgoal;

public class Muscle_Exercises_Info {

    private int Workout_Image;
    private String Workout_name;
    private String Targeted_Muscles;

    public Muscle_Exercises_Info(int workout_Image, String workout_name, String targeted_Muscles) {
        Workout_Image = workout_Image;
        Workout_name = workout_name;
        Targeted_Muscles = targeted_Muscles;
    }

    public int getWorkout_Image() {
        return Workout_Image;
    }

    public void setWorkout_Image(int workout_Image) {
        Workout_Image = workout_Image;
    }

    public String getWorkout_name() {
        return Workout_name;
    }

    public void setWorkout_name(String workout_name) {
        Workout_name = workout_name;
    }

    public String getTargeted_Muscles() {
        return Targeted_Muscles;
    }

    public void setTargeted_Muscles(String targeted_Muscles) {
        Targeted_Muscles = targeted_Muscles;
    }
}
