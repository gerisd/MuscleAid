package doova.fitgoal;

public class ExerciseRoutine_Information {
    private String Routine_name;
    private String Routine_Split;

    public ExerciseRoutine_Information(String name, String split){
        Routine_name = name;
        Routine_Split = split;
    }

    public String getRoutine_name() {
        return Routine_name;
    }

    public String getRoutine_Split() {
        return Routine_Split;
    }
}
