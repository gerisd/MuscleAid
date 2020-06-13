package doova.fitgoal;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PlannerFragment extends Fragment {

    Button DatePickerButton;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.planner_fragment, container, false);

        DatePickerButton = view.findViewById(R.id.DatePickerButton);
        DatePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerFragment datepicker = new DatePickerFragment();
                datepicker.show(getFragmentManager(), "date picker");
            }
        });

        return view;
    }
}
