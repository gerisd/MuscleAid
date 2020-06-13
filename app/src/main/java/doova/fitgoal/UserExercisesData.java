package doova.fitgoal;

public class UserExercisesData {
    private String workout_name;
    private int workout_image;

    public UserExercisesData(String workout_name, int workout_image) {
        this.workout_name = workout_name;
        this.workout_image = workout_image;
    }

    public String getWorkout_name() {
        return workout_name;
    }

    public void setWorkout_name(String workout_name) {
        this.workout_name = workout_name;
    }

    public int getWorkout_image() {
        return workout_image;
    }

    public void setWorkout_image(int workout_image) {
        this.workout_image = workout_image;
    }
}
