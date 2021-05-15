package com.example.ashifpracs6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String[] subjectArray = {"Physics","Chemistry","Mathematics","Static Electricity",
            "Kinematics","Wave Energy","Electromagnetism","Quantum Physics"};
    TextView teacherName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                R.layout.list_view, subjectArray);
        teacherName = (TextView) findViewById(R.id.teacher);
        ListView listView = (ListView) findViewById(R.id.subject_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("position",String.valueOf(position));
                switch (position){
                    case 0:teacherName.setText("Jason");
                            break;
                    case 1:teacherName.setText("Susy");
                            break;
                    case 2:teacherName.setText("Alex");
                            break;
                    case 3:teacherName.setText("Rutherford");
                            break;
                    case 4:teacherName.setText("Emily");
                            break;
                    case 5:teacherName.setText("Mike");
                            break;
                    case 6:teacherName.setText("William");
                            break;
                    case 7:teacherName.setText("Mr Fantastic");
                }
            }
        });
    }
}
