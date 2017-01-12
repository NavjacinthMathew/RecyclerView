package mathew.navjacinth.com.recyclerviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private EmployeeAdapter adapter;
    private ArrayList<Employee> employeeArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Employee1", "emp1@example.com", "123456789"));
        employeeArrayList.add(new Employee("Employee2", "emp2@example.com", "987654321"));
        employeeArrayList.add(new Employee("Employee3", "emp3@example.com", "789456123"));
        employeeArrayList.add(new Employee("Employee4", "emp4@example.com", "321654987"));

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new EmployeeAdapter(MainActivity.this, employeeArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
}
